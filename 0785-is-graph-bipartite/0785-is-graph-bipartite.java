class Solution {
    public static boolean dfs(int node,int c,int colors[],int[][] graph){
        colors[node] = c;
        for(int neigh : graph[node]){
            if(colors[neigh] != -1 && colors[neigh] == c) return false;
            if(colors[neigh] == -1){
                if(!dfs(neigh,1-c,colors,graph)) return false;  // 1-c for opposite colors like 1 ka ulta 0 and 0 ka ulta 1//
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int c = 0; //color 0 and 1
        int colors[] = new int[n];
        Arrays.fill(colors,-1);
        for(int i = 0; i < n; i++){
           if(colors[i] == -1){
            if(!dfs(i,c,colors,graph)) return false;
           }
        }
        return true;
        
    }
}