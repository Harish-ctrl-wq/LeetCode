class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int idxoftarget = 0;
        int repeat = 0;
       
        
        for(int num : nums){
            if(num < target){
                idxoftarget++;
            }else if(num == target){
                repeat++;
            }
        }
        // agar 1 se jada hua tab 
        for(int i = 0; i < repeat; i++){
            list.add(idxoftarget+i);
        }
      return list;
        
    }
}