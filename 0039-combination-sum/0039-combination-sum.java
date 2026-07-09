class Solution {
    public static void fun(int nums[],int start,int target,List<Integer> list,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target < 0 )
            return;
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            fun(nums,i,target-nums[i],list,ans);
            list.remove(list.size()-1);
            
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(nums,0,target,list,ans);
        return ans;
        
        
    }
}