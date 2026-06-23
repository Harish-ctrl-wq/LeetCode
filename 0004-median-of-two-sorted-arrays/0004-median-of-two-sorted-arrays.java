class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                c[k] = nums1[i];
                i++;
            }
            else{
                c[k] = nums2[j];
                j++;
            }
            k++;
        }
            while(i<nums1.length){
                c[k] = nums1[i];
                i++;
                k++;

            }
             while(j<nums2.length){
                c[k] = nums2[j];
                j++;
                k++;

            }
        
        double median;
        int n = c.length;
        if(n%2==0){
            median = (c[(n/2)-1]+c[n/2])/2.0;
            return median;
        }
        else{
            median = c[n/2];
            return median;
        }

        
    }
}