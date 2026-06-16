class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(nums, res, path);
        return res;

    }
    static void backtrack(int[] nums, List<List<Integer>> res,List<Integer> path ){
        if(path.size() == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i<nums.length;i++){
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            backtrack(nums, res, path);
            path.remove(path.size()-1);
        }
    }
}