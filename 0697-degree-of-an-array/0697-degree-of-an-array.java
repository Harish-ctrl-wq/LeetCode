class Solution {
    public int findShortestSubArray(int[] nums) {
        int freq[] = new int[50000];

        int first[] = new int[50000];

        int last[] = new int[50000];

        Arrays.fill(first,-1);

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            freq[num]++;
            if(first[num] == -1){
                first[num] = i;
            }
            last[num] = i;
        }
       
        int max = Integer.MIN_VALUE;
        for(int num : freq){
            if(num > max){
                max = num;
            }
        }
        //max is the degree of original array

        int ans = nums.length;
        for(int num : nums){
            if(freq[num] == max){
                int len = last[num] - first[num] + 1;
                ans = Math.min(len,ans); 
            }
        }
        return ans;

        
    }
}