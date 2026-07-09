class Solution {
    public static void fun(int nums[],int start,int target,List<Integer> list,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0)
          return;
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1])
               continue;
            
            
            list.add(nums[i]);
    
            fun(nums,i+1,target-nums[i],list,ans);

            list.remove(list.size()-1);
            

        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        fun(nums,0,target,list,ans);
        return ans;
    }
}