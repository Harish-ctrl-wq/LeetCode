class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                len = 1;
            }else{
            len++;
            }
            ans = Math.max(len,ans);
            
           
        }
        ans = Math.max(len,ans);
        return ans;

        
    }
}