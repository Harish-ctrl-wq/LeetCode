class Solution {
    public void rotate(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        k = k % nums.length;
        int i = k;
        
        while(i > 0){
            int n = nums.length-i;
            ans.add(nums[n]);
            i--;
        }
        for(int j = 0; j<nums.length -k;j++){
            ans.add(nums[j]);

        }

        for(int h = 0; h < nums.length;h++){
            nums[h] = ans.get(h);
        }
        
        
    }
}