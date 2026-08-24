class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        int origincolor = image[sr][sc];
        if(origincolor != color){
            dfs(image,sr,sc,origincolor,color);
        }
        return image;
       
        
        
    }
       
    public static void dfs(int[][] image,int sr,int sc,int origincolor,int color){

        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || origincolor != image[sr][sc]){
            return;

        }
        image[sr][sc] = color;
        dfs(image, sr + 1, sc,origincolor, color);
        dfs(image, sr - 1, sc,origincolor, color);
        dfs(image, sr, sc - 1,origincolor, color);
        dfs(image, sr, sc + 1,origincolor, color);

    }
    
}