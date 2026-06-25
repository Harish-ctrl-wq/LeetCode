class Solution {
    boolean fun(int nums[] , int mid, int k){
        int s = 1;
        int page = 0;
        for(int i = 0;i<nums.length ;i++){
            if(nums[i] + page <= mid){
                page = page + nums[i];
            } else {
                s++; // next student 
                page = nums[i];
                if(s > k ){
                    return false;
                }
            }
        }
        return true;

    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
       
        if(n < k){
            return -1;
        }
        int low = 0;
        int high = 0;
        for(int i = 0;i<nums.length ; i++){
            low = Math.max(nums[i],low);
            high += nums[i];
        }
        while(low <= high ){
            int mid = low + (high- low)/2;
            if(fun(nums,mid,k)){
                high =mid-1;

            } else {
                low = mid+1;
            }
        }
        return low;
    }
}