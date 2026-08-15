class Solution {
    public int thirdMax(int[] nums) {
        Long max1 = null;
        Long max2 = null;
        Long max3 = null;

        for(Integer num : nums){
            long n = num;
            if ((max1 != null && n == max1) || 
                (max2 != null && n == max2) || 
                (max3 != null && n == max3)) {
                continue;
            }
            
            
            if(max1 == null || n > max1){
                max3 = max2;
                max2 = max1;
                max1 = (long) n;
            }else if(max2 == null || n > max2){
                max3 = max2;
                max2 = (long) n;
            }else if(max3 == null || n > max3){
                max3 = (long) n;
            }
        }
    return max3 != null ? max3.intValue() : max1.intValue();





    //    TreeSet<Integer> topthree = new TreeSet<>();
    //    for(int num : nums){
    //     topthree.add(num);
    //     if(topthree.size() > 3){
    //         topthree.pollFirst(); //top yani smallest delete
    //     }

    //    }
    //    if(topthree.size() < 3) return topthree.last(); //maximum ko return krenge
    //    return topthree.first();
        
        
    }
}