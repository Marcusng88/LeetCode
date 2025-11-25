class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        // core idea is to use greedy solution , needs to solve tigher range first
        Arrays.sort(intervals, (a,b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return b[0] - a[0];
        });
        int first = -1_000_000_000;
        int second = -1_000_000_000;
        int count = 0;

        for(int[] interval : intervals){
            int L = interval[0];
            int R = interval[1];

            boolean firstIn = (first >= L && first <= R);
            boolean secondIn = (second >= L && second <= R);

            if( firstIn && secondIn){
                continue;
            }
            else if (secondIn){
                count ++;
                first = second;
                second = R;
            }
            else{
                count +=2;
                first = R-1;
                second = R;
            }
        }
        return count;
    }
}