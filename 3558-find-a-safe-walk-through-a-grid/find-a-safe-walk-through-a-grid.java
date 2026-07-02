class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dirs = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };
        int[][] dist = new int[m][n];
        for(int i = 0; i<m ;i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        // pq to compare cost
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        int[] first = {0,0, grid.get(0).get(0)};
        pq.offer(first);

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int r = curr[0];
            int c = curr[1];
            int cost = curr[2];

            if(cost>dist[r][c]) continue;
            if(r == m-1 && c == n-1) return health - cost >=1;


            for(int[] dir : dirs ){
                int xr = r+dir[0];
                int xc = c+dir[1];

                if(xr<0 || xr>= m || xc<0 || xc>= n ) continue;

                int newCost = cost+grid.get(xr).get(xc);
                if(newCost< dist[xr][xc]){
                    dist[xr][xc] = newCost;
                    pq.offer(new int[] {xr, xc, newCost});
                }



            }
            

        }

        return false;
    }
}