class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";
        int stlen = String.valueOf(low).length();
        int endlen = String.valueOf(high).length();
        for(int i = stlen; i <= endlen; i++){
            for(int st = 0; i+st <= s.length();st++){
                String ans = s.substring(st,st+i);
                int num = Integer.parseInt(ans);
                if(num >= low && num <= high){
                    list.add(num);
                }
            }
        }
        return list;
        
    }
}