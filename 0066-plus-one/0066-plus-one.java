class Solution {
    public int[] plusOne(int[] nums) {
        int ans[] = new int[nums.length+1];
       
        for(int i = nums.length-1;i >= 0; i--){
            if(nums[i] != 9){
                nums[i] = nums[i]+1;
                return nums;
            }
            // agar 9 he toh 0 bnana pdega
            nums[i] = 0;
        }
        // yha tak agr array aya he mtlb sare elements 9 he toh phla index 9 baki automaticaly 0 honge//
         ans[0] = 1;

        

        return ans;
    }
}