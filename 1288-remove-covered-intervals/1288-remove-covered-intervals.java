class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        Arrays.sort(nums, (a, b) -> {
    if (a[0] == b[0]) {
        return b[1] - a[1];   // end descending //jab same starting ho toh bde end se sort krenge//
    }
    return a[0] - b[0];       // start ascending
});
        
        int n = nums.length;
        int maxend = nums[0][1];
        for(int i = 1; i < nums.length ; i++){
            int e2 = nums[i][1];
            if(e2 <= maxend){
                n--;
            }else{
                maxend = e2;
            }
            
            

        }
        return n;
        
    }
}