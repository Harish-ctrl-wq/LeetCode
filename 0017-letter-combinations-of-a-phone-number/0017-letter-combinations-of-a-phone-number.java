class Solution {
    private static void backtrack(String digits,int idx,StringBuilder current,String []map,List<String> ans){
        if(idx == digits.length()){
            ans.add(current.toString());
            return;

        }
        String letters = map[digits.charAt(idx) -'0'];

        for(char ch: letters.toCharArray()){
            current.append(ch);
            backtrack(digits, idx + 1, current, map, ans);
             current.deleteCharAt(current.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        
        String[] map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        backtrack(digits,0,new StringBuilder(),map,ans);
        return ans;

        
    }
}