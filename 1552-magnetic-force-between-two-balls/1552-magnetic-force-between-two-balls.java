class Solution {
    public boolean fun(int[] position, int n, int m, int mid){
        int ball = 1;
        int pos = position[0];
        for(int i =1; i < n ; i++){
            int dist = position[i] - pos;
            if(dist < mid){
                continue;
                
            }
            ball++;
            pos = position[i];
            
        }
        if(ball >= m){
            return true;
            }
        else {return false;
            }
    }
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int low = 1;
        int high = position[n-1] - position[0];
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(fun(position , n ,m ,mid)){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
        
    }
}