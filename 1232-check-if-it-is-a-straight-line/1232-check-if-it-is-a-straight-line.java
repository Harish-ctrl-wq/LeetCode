class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        int deltax = x2 - x1;
        int deltay = y2 - y1;
        for(int i = 2 ; i < coordinates.length; i++ ){
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];
            if(deltay*(x3 - x2) != deltax*(y3-y2))return false;
        }
        return true;


        //2nd method y = mx + c
        // sbse phle c nikalo 

        
    }
}