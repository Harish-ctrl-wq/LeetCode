class Solution {
    public int lengthOfLastWord(String s) {
        int last = s.length() - 1;
        int count = 0;
        //end se sare space remove krenge
        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }

        while (last >= 0 && s.charAt(last) != ' ') {
            last--;
            count++;
        }
        return count;

    }
}