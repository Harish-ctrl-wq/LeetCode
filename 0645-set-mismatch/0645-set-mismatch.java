class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];

      
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int count = map.getOrDefault(num,0)+1;
            map.put(num,count);

            if(count == 2){
                ans[0] = num;
            }
        }
           
        
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                ans[1] = i;
                break;
            }
        }
        return ans;

        
        
    }
}