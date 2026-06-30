class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
     
        for(int i = 0;i<nums1.length ; i++){
            map.add(nums1[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums2.length;i++){
           if(map.contains(nums2[i])){
            set.add(nums2[i]);
           }
        }
           int ans[] = new int[set.size()];
           int j = 0;
           for(int num : set){
            ans[j++] = num;
           }
        
      return ans;
        
    }
}