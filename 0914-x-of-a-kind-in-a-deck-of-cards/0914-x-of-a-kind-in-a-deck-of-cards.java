class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : deck){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int gcd = 0;
        for(int val : map.values()){
            gcd = gcd(gcd,val);
        }
        return gcd >= 2;

        
    }
    public int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}