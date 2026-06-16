class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            int needed = target - nums[j];
            if(map.containsKey(needed)){
                if(map.get(needed) != j){
                    res[0] = j;
                    res[1] = map.get(needed);
                }
                
            }
        }
        return res;
    }
}