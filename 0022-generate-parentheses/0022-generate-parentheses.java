class Solution {
    public static void fun(int open, int close, int n,String s, List<String> list){
        if(open == n && close == n){
            list.add(s);
            return;
        }
        if(open < n){
            fun(open+1 , close , n , s+'(', list);
        }
        if(close < open){
            fun(open , close+1 , n , s+')', list);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        fun( 0 , 0 , n , "", res);
        return res;
        
    }
}