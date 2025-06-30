import java.util.*;
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> dict = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        for(int i = 0 ; i< nums.length;i++){
            dict.put(nums[i], dict.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
        }
        for(int element : set){
            if (dict.containsKey(element+1)){
                int sum = dict.get(element)+ dict.get(element+1);
                if(sum > res){
                    res = sum;
                }
            }
        }
        return res;

    }
}