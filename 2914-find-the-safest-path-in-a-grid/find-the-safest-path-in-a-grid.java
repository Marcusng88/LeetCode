class Solution {
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];
        for(int i = 0; i <n;i++){
            Arrays.fill(dist[i], -1);
        }
        int[][] dirs = {
            {1,0},
            {0,1},
            {-1,0},
            {0,-1}
        };
        Queue<int[]> queue = new LinkedList<>();
        for(int i = 0;i<n; i++){
            for(int j = 0; j<n; j++){
                if(grid.get(i).get(j)==1){
                    queue.offer(new int[] {i,j});
                    dist[i][j] = 0;
                }
            }
        }

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] d: dirs){
                int nr = r+d[0];
                int nc = c+d[1];

                if(nr>=n || nr<0 || nc>=n || nc<0 ) continue;
                if(dist[nr][nc] !=-1) continue;

                dist[nr][nc] = 1+dist[r][c];
                queue.offer(new int[] {nr, nc});
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[2]-a[2]);
        boolean[][] visited = new boolean[n][n];
        pq.offer(new int[] {0,0,dist[0][0]});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int r = curr[0];
            int c = curr[1];
            int safe = curr[2];
            if(visited[r][c]) continue ;
            visited[r][c] = true;

            if(r==n-1 && c == n-1) return safe;

            for(int[] dir : dirs){
                int xr = r+dir[0];
                int xc = c+dir[1];

                if(xr <0 || xr>=n || xc <0 || xc>=n ) continue;
                if(visited[xr][xc]) continue;

                int newSafe = Math.min(safe, dist[xr][xc]);
                pq.offer(new int[] {xr, xc, newSafe});
            }
        }

        return 0;
    }
    
}