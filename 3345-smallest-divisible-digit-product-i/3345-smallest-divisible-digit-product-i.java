class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; i < n+10; i++){
            int mul = 1;
            int temp = i;
            while(temp > 0){
                int d = temp%10;
                mul = mul*d;
                temp /= 10;
            }
            if(mul%t == 0) return i;
        }
        return n;
        
    }
}