class Solution {

    public int maxProduct(int n) {

        int max = -1;
        int smax = -1;
        while (n > 0) {
            int num = n % 10;
            if (num > max) {
                smax = max;
                max = num;
            } else if (num >= smax) {
                smax = num;
            }
            n /= 10;
        }
        return max * smax;

    }
}