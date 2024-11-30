class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

    // Traverse the digits array from the last element
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++; // Increment and return early if not a 9
            return digits;
        }
        digits[i] = 0; // Set to 0 if it's 9 and carry over
    }

    // If all digits are 9, we need an extra space
    int[] result = new int[n + 1];
    result[0] = 1; // Leading 1 for numbers like 999 -> 1000
    return result;
    }
}