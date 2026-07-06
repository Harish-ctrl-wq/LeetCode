class Solution {
    public int[] divisibilityArray(String word, int m) {
        long prefix = 0;
        int ans[] = new int[word.length()];
        for(int i = 0; i < word.length();i++){
            int digit = word.charAt(i)-'0';
            prefix = (prefix*10 + digit)%m;
            if(prefix == 0){
                ans[i] = 1;
            }
            
        }
        return ans;
    }
}