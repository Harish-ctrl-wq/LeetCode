class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(char c : s.toCharArray()){
            sum += c;
        }
        int sum2 = 0;
        for(char c : t.toCharArray()){
            sum2 += c;
        }
        return (char) (sum2 - sum);

       
        
    }
}