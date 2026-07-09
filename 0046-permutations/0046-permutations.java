class Solution {
   
    public static void fun(int nums[],List<Integer> list,boolean used[],List<List<Integer>> ans){
        if(list.size() == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;//permutation me koi element dobara aaye toh continue
            // choose
            list.add(nums[i]);
            used[i] = true;
            // explor
            fun(nums,list,used,ans);
            // remove
            list.remove(list.size()-1);
            used[i] = false;

        }
    }
   
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        fun(nums,list,used,ans);
        return ans;

        
    }
}