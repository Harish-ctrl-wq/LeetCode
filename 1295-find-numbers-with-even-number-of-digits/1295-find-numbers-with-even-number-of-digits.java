class Solution {
    public int fun(int nums[]){
        int res = 0;
        

        for(int num: nums){
            int count = 0;
                while(num > 0){
                    num /= 10;
                    count++; 
                }
                if(count%2 == 0) res++;
                
                
           
        }
        
        return res;
    }
    public int findNumbers(int[] nums) {
        return fun(nums);

        
    }
}