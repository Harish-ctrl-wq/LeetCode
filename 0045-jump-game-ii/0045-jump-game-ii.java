class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int maxreach = 0;
        int currentend = 0;
        for(int i = 0;i < nums.length - 1 ; i++){
         maxreach = Math.max(maxreach,nums[i]+i);

         if(i == currentend){
            jump++;
            currentend = maxreach;
         
       
        if(maxreach >= nums.length-1){
                   break;
           }  
           
        }
        
    }
    return jump;
}
}