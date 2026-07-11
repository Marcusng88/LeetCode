class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] edge : edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int res = 0;

        for(int i =0 ;i<n ; i++){
            if(visited[i]) continue;

            List<Integer> component = new ArrayList<>();
            dfs(i,component, graph, visited);

            int size = component.size();
            boolean complete = true;
            for(int node: component){
                if(graph[node].size() != size-1){
                    complete = false;
                    break;
                }
            }
            if (complete) res ++;

        }
        return res;



    }

    private void dfs(int node , List<Integer> component, List<Integer>[] graph, boolean[] visited){
        visited[node] = true;

        component.add(node);
        for(int next: graph[node]){
            if(!visited[next]){
                dfs(next, component, graph, visited);
            }
        }

    }
}