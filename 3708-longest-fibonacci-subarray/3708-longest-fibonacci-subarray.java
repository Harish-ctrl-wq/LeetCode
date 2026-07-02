class Solution {
    public int longestSubarray(int[] nums) {
        int count = 2;
        int maxlen = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i] == nums[i-1]+nums[i-2]){
                count++;
            }else{
                  count = 2;
            }
            maxlen = Math.max(count,maxlen);
                
          
            
        }
       return maxlen;
    }
}