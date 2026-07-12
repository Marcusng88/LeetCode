class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) return arr;

        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();

        int currentRank = 1;

        for(int i = 0 ; i<arr.length;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], currentRank ++);
            }
        }

        for(int i = 0 ; i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
        
    }
}