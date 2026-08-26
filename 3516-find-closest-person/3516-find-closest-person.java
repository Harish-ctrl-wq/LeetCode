class Solution {
    public int findClosest(int x, int y, int z) {
       int diffx = Math.abs(z - x);
       int diffy = Math.abs(z - y);
       if(diffx > diffy)return 2;
       else if(diffx < diffy)return 1;
       return 0;
    }
}