class Solution {
    public int heightChecker(int[] heights) {
        
        int nums[] = heights.clone();
        for(int i = 0; i < heights.length-1; i++){
            for(int j = 0; j < heights.length-1-i; j++){
                 if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] =  heights[j+1];
                    heights[j+1] = temp;
                }
            }

        }
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != nums[i]){
                count++;
            }
        }
        return count;

        
    }
}