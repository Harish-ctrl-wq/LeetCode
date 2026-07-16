class Solution {
    //gcd nikalne ke liye function
    public static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
            
        }
        return a;
    }
    public long gcdSum(int[] nums) {
       
        int maxele = 0;
       
        //prefixgcd array
        int prefixgcd[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            maxele = Math.max(nums[i],maxele);
            prefixgcd[i] = gcd(nums[i],maxele);
        }
        
        // smallest aur largest gcd pair ka sum 
        // alg alg smallest aur largest elements ka gcd nikal kr sum krna he 
        Arrays.sort(prefixgcd);
        long ans = 0;
        int i = 0;
        int j = prefixgcd.length-1;
        while(i < j){
            ans += gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return ans;


        

        
    }
}