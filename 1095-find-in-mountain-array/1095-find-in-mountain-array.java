/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
             int left = 0;
             int right = arr.length()-1;
             int peakidx = -1;
             while(left < right ){
                int mid = left + (right-left)/2;
                if(arr.get(mid) < arr.get(mid+1)){
                    left = mid+1;
                }
                else{
                    right = mid;
                }
             }
             peakidx = left;
             //increasing slop ke liye Mtlb first occurence check hogi if do element huye toh
             left = 0;
             right = peakidx;
             while(left <= right){
                int midS = left + (right-left)/2;
                if(arr.get(midS) < target ){
                    left = midS +1;
                }
                else if(arr.get(midS) > target){
                    right = midS-1;
                }
                else if(arr.get(midS) == target){
                    return midS;
                }
             }
             //right side me Bs agr left me nhi mila toh
             left = peakidx + 1 ;
             right = arr.length()-1;
             while(left <= right){
                int mid1 = left + (right-left)/2;
                if(arr.get(mid1) < target){
                    right = mid1-1;
                }
                else if(arr.get(mid1) > target ){
                    left = mid1+1;
                }
                else if(arr.get(mid1) == target){
                    return mid1;
                }

             }
             

      return -1;

        
    }
}