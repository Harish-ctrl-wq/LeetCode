class Solution {
    //dfs ka universal fun
    public boolean dfs(List<List<Integer>> adj,int node,boolean[] vis,int destination){
        if(node == destination) return true;
        vis[node] = true;
        for(int neigh : adj.get(node)){
            if(!vis[neigh]){
                if(dfs(adj,neigh,vis,destination)){
                    return true;
                }
            }
        }

return false;

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        //size deni pdegi
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        // source and destination insert krenge adj list me
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // bidirectional he isiliye agr 0 se 1 path he toh 1 se 0 bhi hoga //
        }
        boolean [] vis = new boolean[n];
        return dfs(adj,source,vis,destination);




        
    }
}