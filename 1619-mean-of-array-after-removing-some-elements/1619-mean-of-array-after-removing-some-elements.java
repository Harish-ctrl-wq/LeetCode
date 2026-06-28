class Solution {
    public double trimMean(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int rem = (int) (n*0.05);
        double sum = 0;
        for(int i = rem ; i < nums.length-rem; i++){
            sum += nums[i];
        }

        int remEle = n - (rem*2);

        return sum/remEle;

        
        
    }
}