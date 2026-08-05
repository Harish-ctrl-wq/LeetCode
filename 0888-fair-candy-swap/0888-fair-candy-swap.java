class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num :aliceSizes){
            sum1 += num;
        }
        for(int num :bobSizes){
            sum2 += num;
        }
        int diff = (sum1 - sum2)/2;
        HashSet<Integer> set = new HashSet<>();
        for(int num : bobSizes){
            set.add(num);
        }
        for(int a : aliceSizes){
            int b = a - diff;
            if(set.contains(b)){
                return new int []{a,b};
                }
                

            }
        
        return new int [0];

        
    }
}