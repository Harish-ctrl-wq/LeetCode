class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        
       int i = 0;
       for(int num : nums){
        if(i < k || num != nums[i-k]){
            nums[i++] = num;
        }
         
       }
        return java.util.Arrays.copyOf(nums, i);

   
    }
}