class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i = k; i < 100*k; i++){
            if(!set.contains(i) && i%k == 0){
               return i;
            }

        }
        return 100*k+1;
        
    }
}