class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int []>> adj = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[] : times){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new int[]{v,wt});
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));

        int dist[] = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        pq.add(new int[]{k,0});
        while(!pq.isEmpty()){
            int top[] = pq.poll();
            int v = top[0];
            int d = top[1];
            if(d > dist[v]) continue;
            for(int neigh[] : adj.get(v)){
                int neg = neigh[0];
                int wt = neigh[1];
                if(wt+d < dist[neg]){
                    pq.add(new int[]{neg,wt+d});
                    dist[neg] = wt+d;                }
            }
        }
        int max = 0;
        for(int i = 1; i <= n; i++){
            if(dist[i] == Integer.MAX_VALUE)return -1;
            max = Math.max(max,dist[i]);
        }
        return max;
 
    }
}