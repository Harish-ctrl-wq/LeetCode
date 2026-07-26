class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE; //first max element
        int smax = Integer.MIN_VALUE;  // second max element
        int tmax = Integer.MIN_VALUE;  // third max element

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int num : nums){
            if(num < min1){
                min2 = min1;
                min1 = num;
            }
            else if(num < min2){
                min2 = num;
            }
            
            if(num > max){
                tmax = smax;
                smax = max;
                max = num;
            }else if(num > smax){
                tmax = smax;
                smax  = num;
            } else if(num > tmax){
                tmax = num;
            }
        }
        return Math.max(max*tmax*smax , max*min1*min2);

        
    }
}