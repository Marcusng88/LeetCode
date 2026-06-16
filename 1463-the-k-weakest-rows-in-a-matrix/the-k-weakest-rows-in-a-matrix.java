class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>( (a,b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        for(int i = 0; i<mat.length;i++){
            int soldier = 0;
            for(int j = 0;j<mat[i].length;j++){
                soldier += mat[i][j];
            }
            heap.offer(new int[]{soldier,i});
        }
        int[] res = new int[k];
        for(int j = 0;j<k;j++){
            res[j] = heap.poll()[1];
        }
        return res;

        
    }
}