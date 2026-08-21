class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int pair = 0;
       
        for(int num : map.keySet()){
            pair += map.get(num)/2;
        }
         int rem = nums.length - pair*2;
         return new int[]{pair,rem};

         
        
    }
}