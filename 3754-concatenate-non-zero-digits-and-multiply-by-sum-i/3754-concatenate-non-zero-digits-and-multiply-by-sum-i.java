class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long rev = 0;
        long sum = 0;
        //non zero milenge but in reverse order
        //sum of digit

        while(temp > 0){
            int digit = temp%10;
            if(digit != 0){
                rev = rev*10 + digit;
                sum += digit;
            }
            temp /= 10;  
        }
      
        
        //reverse krna pdega
        long ans = 0;
        while(rev > 0){
            ans = ans*10 + rev%10;
            rev /= 10;

        }
        
        return ans*sum;

        
    }
}