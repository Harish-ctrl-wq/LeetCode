class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int maxsum = nums[0];
        int left = 0;
        int right = 1;

        while(right < nums.length){
            if(nums[left] < nums[right]){
                sum += nums[right];
                maxsum = Math.max(maxsum , sum);
            }else{
                sum = nums[right];
            }
            left++;
            right++;
        }
        return maxsum;

    }
    
    }