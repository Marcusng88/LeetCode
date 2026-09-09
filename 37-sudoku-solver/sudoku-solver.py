class Solution:
    def solveSudoku(self, board: List[List[str]]) -> None:
        FULL = (1 << 9) - 1   # 111111111 -> digits 1-9

        rows = [0] * 9
        cols = [0] * 9
        boxes = [0] * 9

        empty = []

        # Build row/column/box masks
        for r in range(9):
            for c in range(9):
                if board[r][c] == ".":
                    empty.append((r, c))
                else:
                    bit = 1 << (int(board[r][c]) - 1)
                    box = (r // 3) * 3 + c // 3

                    rows[r] |= bit
                    cols[c] |= bit
                    boxes[box] |= bit


        def candidates(r, c):
            box = (r // 3) * 3 + c // 3

            used = rows[r] | cols[c] | boxes[box]

            return FULL & ~used


        def backtrack(index):

            # All empty cells filled
            if index == len(empty):
                return True


            # --------------------------------
            # MRV:
            # Find cell with fewest candidates
            # --------------------------------
            best_index = index
            best_mask = 0
            best_count = 10

            for i in range(index, len(empty)):
                r, c = empty[i]

                mask = candidates(r, c)
                count = mask.bit_count()

                # No possible value -> dead end immediately
                if count == 0:
                    return False

                if count < best_count:
                    best_count = count
                    best_mask = mask
                    best_index = i

                    # Cannot do better than 1
                    if count == 1:
                        break


            # Put the best cell at current index
            empty[index], empty[best_index] = (
                empty[best_index],
                empty[index]
            )

            row, col = empty[index]
            box = (row // 3) * 3 + col // 3


            # --------------------------------
            # Least Constraining Value
            # --------------------------------
            options = []

            mask = best_mask

            while mask:
                bit = mask & -mask
                mask ^= bit

                impact = 0

                # Count how much this digit would restrict
                # other unfilled cells
                for i in range(index + 1, len(empty)):
                    r, c = empty[i]

                    # Only relevant if same row/col/box
                    if (
                        r == row
                        or c == col
                        or (
                            r // 3 == row // 3
                            and c // 3 == col // 3
                        )
                    ):
                        if candidates(r, c) & bit:
                            impact += 1

                options.append((impact, bit))


            # Try least restrictive digit first
            options.sort()


            for _, bit in options:

                digit = bit.bit_length()

                # CHOOSE
                board[row][col] = str(digit)

                rows[row] |= bit
                cols[col] |= bit
                boxes[box] |= bit


                # EXPLORE
                if backtrack(index + 1):
                    return True


                # UNDO
                rows[row] ^= bit
                cols[col] ^= bit
                boxes[box] ^= bit

                board[row][col] = "."


            # Restore empty-cell ordering
            empty[index], empty[best_index] = (
                empty[best_index],
                empty[index]
            )

            return False


        backtrack(0)