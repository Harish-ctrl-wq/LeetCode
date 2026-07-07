class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        boolean[] isnotprime = new boolean[n];
        int count = 0;

        for(int i = 2; i*i < n; i++){
            if(!isnotprime[i]){
                for(int j = i*i; j < n ; j += i){
                    isnotprime[j] = true;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(!isnotprime[i]){
                count++;
            }
        }
        return count;
        
    }
}