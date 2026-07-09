class Solution {
    public static void fun(int nums[],boolean used[],List<Integer> list,List<List<Integer>> ans){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i])
            continue;
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
            continue;
            list.add(nums[i]);
            used[i] = true;
            fun(nums,used,list,ans);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean used[] = new boolean[nums.length];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        fun(nums,used,list,ans);
        return ans;
        
    }
}