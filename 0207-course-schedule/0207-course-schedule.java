class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = numCourses;
        while(n-- > 0){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        
        for(int edge[] : prerequisites){
            //is question ke accroding [d,s] destination phle fir src
            int d = edge[0];
            int s = edge[1];
            adj.get(s).add(d);
            indegree[d]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                q.offer(i);   //us node ko q me push krdenge
            }
        }
        int processed = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            processed++; //kitni nodes ko process kr liya  
            for(int neigh : adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh] == 0){
                    q.offer(neigh);
                }
            }
            
        }
        return numCourses == processed;


        
    }
}