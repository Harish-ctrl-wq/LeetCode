class Solution {
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sum = 0;
        long maxkept = 0;
        long n = beans.length;
        for(int i = 0; i < beans.length;i++){
            sum += beans[i];
            maxkept = Math.max(maxkept,(n-i)* (long) beans[i]);
        }
        return sum-maxkept;



      
        

    }
}