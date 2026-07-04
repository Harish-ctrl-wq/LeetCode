class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for(String s: sentences){
            int words = 1;
            for(char ch : s.toCharArray()){
                if(ch == ' '){
                    words++;
                }
                max = Math.max(words,max);
            }
           
        }
        return max;
    }
}