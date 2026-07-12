class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sortarr[] = arr.clone();
        Arrays.sort(sortarr);
        int rank = 1;
        for(int num : sortarr){
            if(!map.containsKey(num)){
                map.put(num,rank);
                rank += 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;

        
    }
}