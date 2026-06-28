class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i< nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // List<Integer> ans = new ArrayList<>();
        // for(int key:map.keySet()){
        //     if(map.get(key) > (nums.length/3)){
        //          ans.add(key);
        //     }
        // }
        // return ans;
        int c1 = 0;
        int c2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int num : nums){
            if(count1 == 0 && num != c2){
                c1 = num;
                count1 = 1;
            }
            else if(count2 == 0 && num != c1){
                c2 = num;
                count2 = 1;
            }
            else if(num == c1){
                count1++;
            }
            else if(num == c2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }


        }

        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(c1==num){
                count1++;
            }else if(c2 == num){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > (nums.length/3)){
            ans.add(c1);
        }
        if(count2 > (nums.length/3)){
            ans.add(c2);
        }
        return ans;
    }
}