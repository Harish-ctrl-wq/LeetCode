class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            int d = 0;
            while(nums[i] > 0){
                d += nums[i]%10;
                nums[i] /= 10;
            }
            if(d == i) return i;
        }
        return -1;
    }
}