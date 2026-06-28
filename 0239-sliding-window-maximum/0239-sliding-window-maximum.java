class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        int ans[] = new int[nums.length-k+1];
        for(int i = 0; i < k ; i++){
            maxheap.offer(new int[]{nums[i],i});
        }
        ans[0] = maxheap.peek()[0];
        int idx = 1;
        for(int i = k; i < nums.length;i++){
            maxheap.offer(new int[]{nums[i],i});
            while(maxheap.peek()[1] <= i -k){
                maxheap.poll();
            }
            ans[idx++] = maxheap.peek()[0];
        }

       return ans;
    }
}  