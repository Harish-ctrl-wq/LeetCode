class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxfreq = 0;
        int maxfreqcount = 0;

        for(int num : nums){
            int freq = map.getOrDefault(num, 0)+1;
            map.put(num,freq);

            if(freq > maxfreq){
                maxfreq = freq;
                maxfreqcount = freq;

            }else if(freq == maxfreq){
                maxfreqcount += maxfreq;
            }
        }
        return maxfreqcount;
           

    }
}