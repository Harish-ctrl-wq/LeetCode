class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0; i < words.length ; i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue().equals(b.getValue()) ? 
                      b.getKey().compareTo(a.getKey()) : 
                      Integer.compare(a.getValue(), b.getValue()));

for(Map.Entry<String,Integer> entry : map.entrySet()){
    pq.offer(entry);
    if(pq.size()>k){
        pq.poll();
    }
}
List<String> res = new ArrayList<>();
while(!pq.isEmpty()){
    res.add(pq.poll().getKey());
}
//bcz we want high freq word first
Collections.reverse(res);
return res;
        
    }
}