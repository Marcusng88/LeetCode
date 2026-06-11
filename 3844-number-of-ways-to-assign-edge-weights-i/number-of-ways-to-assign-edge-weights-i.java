class Solution {

    private static final int mod = 1000000007;
    public int assignEdgeWeights(int[][] edges) {
        int numOfVertices = edges.length +1;
        ArrayList<Integer>[] graph = new ArrayList[numOfVertices+1];
        Arrays.setAll(graph, i -> new ArrayList<>());
        for(int[] e: edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        return (int) pow(2, dfs(1,0, graph)-1);

    }

    private int dfs(int node, int prev, List<Integer>[] graph){
        int dist = 0;
        for(int g: graph[node]){
            if(g!= prev){
                dist=  Math.max(dist, dfs(g, node, graph) +1);
            }
        }
        return dist;
    }

    private long pow(long base, int exp){
        long res = 1;
        while(exp > 0){
            if(exp % 2 > 0){
                res = res * base % mod;
            }
            base = base * base % mod;
            exp/=2;
        }
        return res;
    }

}