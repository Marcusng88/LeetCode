class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int value = 0;
        for(int i : nums){
            value = (value * 2 + i) % 5;
            res.add(value == 0);
        }
        return res;
    }
}