class Solution {
    public int[][] merge(int[][] intervals) {


        // 1. brute force approach
        // int[][] first = {{intervals[0][0],intervals[0][1]}};
        // if(intervals.length==1) return first;

        // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // for(int i = 1; i<intervals.length;i++){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];
        //     for(int j = 0 ; j < i ; j++){
        //         int previousStart = intervals[j][0];
        //         int previousEnd = intervals[j][1];
        //         if((start<=previousEnd && end >= previousStart) && start >=0 ){
        //             previousStart = Math.min(start,previousStart);
        //             previousEnd = Math.max(end,previousEnd);
        //             intervals[j][0] = previousStart;
        //             intervals[j][1] = previousEnd;

        //             // to indicate current already merge;
        //             intervals[i][0] = -1;

        //         }
        //     }
        // }
        // int size =0;
        
        // for(int i = 0; i<intervals.length;i++){
        //     if(intervals[i][0]!=-1){

        //         size++;
        //     }
        // }
        // int[][] res = new int[size][2];
        // int x = 0;
        // for(int i = 0; i<intervals.length;i++){
        //     if(intervals[i][0]!=-1){
        //         res[x][0] = intervals[i][0];
        //         res[x][1] = intervals[i][1];
        //         x++;
        //     }
        // }
        // return res;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        for (int[] current : intervals) {
            if (merged.isEmpty()) {
                merged.add(current);
                continue;
            }

            int[] previous = merged.get(merged.size() - 1);

            if (current[0] <= previous[1]) {
                previous[1] = Math.max(previous[1], current[1]);
            } else {
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
        
    }
}