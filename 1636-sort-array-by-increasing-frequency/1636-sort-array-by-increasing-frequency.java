class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) ->{
        if(map.get(a).equals(map.get(b))){ 
            return Integer.compare(b,a);  //value decreasing order me hongi 
         }
        
        return Integer.compare(map.get(a), map.get(b));
        }
        ); //smallest phle lena he isiliye a-b 

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int res[] = new int[nums.length];
        minheap.addAll(map.keySet());
        int k = 0;
        while(!minheap.isEmpty()){
            int num = minheap.poll();
            int count = map.get(num);
            for(int j = 0; j < count; j++){
                res[k++] = num;
            }
            
        }
        return res;


      
       
        
    }
}