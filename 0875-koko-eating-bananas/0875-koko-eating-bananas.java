class Solution {
     static long fun(int []nums,int n, int speed){
            long h = 0;
            for(int i = 0; i < n; i++){
                h += (nums[i] + speed - 1) / speed;
               }
               return h;

            }
            
 
        
    public int minEatingSpeed(int[] nums, int gaurd) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
       
        int low = 1;
        int high = max;
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            long hour = fun(nums , n, mid);
                if(hour > gaurd){
                    low = mid+1;
                }
                else{
                    res = mid;
                    high = mid-1;
                }
                
            }
            return res;

        }

        
    }
