class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(res, path, used,nums );
        return res;
    }

    private static void backtrack(List<List<Integer>> res,List<Integer> path, boolean[] used, int[] choices ){
        if(path.size()==choices.length){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = 0; i<choices.length; i++){
            if(used[i]){
                continue;
            }

            // check when wanted to choose a new path , whether th current element is same as previous and caused duplicated permutation
            if(i>0 && choices[i] == choices[i-1] && !used[i-1] ){
                continue;
            }
            path.add(choices[i]);
            used[i] = true;
            backtrack(res, path, used, choices);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}