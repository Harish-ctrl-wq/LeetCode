class Solution {
    public static void fun(int nums[],int idx,List<List<Integer>> ans,List<Integer> list){
            ans.add(new ArrayList<>(list));
        
         for(int i = idx; i < nums.length;i++){
            if(i > idx && nums[i] == nums[i-1])
                continue;
            
            list.add(nums[i]);
            fun(nums,i+1,ans,list);
            list.remove(list.size()-1);
         }
        

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        fun(nums,0,ans,list);
        return ans;


        
    }
}