class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j] ){
                ans[k++] = nums2[j++];
            }else{
                ans[k++] = nums1[i++];
            }
        }
        while(i < nums1.length){
            ans[k++] = nums1[i++];
        }
        while(j < nums2.length){
            ans[k++] = nums2[j++];
        }
        int n = ans.length;
        if(n%2 == 1){
            return ans[n/2];
        }else{
            return ((double) ans[n/2] + (double) ans[n/2 - 1])/2.0;
        }
        
    }
}