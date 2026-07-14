class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        int needed = target;
        backtrack(res,path, candidates, 0, target, needed);
        return res;


    }

    private void backtrack(List<List<Integer>> res,List<Integer> path, int[] candidates, int idx, int target, int needed ){
        if(needed == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = idx; i<candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if (candidates[i] > needed) {
                break;
            }
            needed -= candidates[i];
            path.add(candidates[i]);
            backtrack(res, path,candidates, i+1, target, needed);


            path.remove(path.size()-1);
            // need to undo the choice made , so need add back the current value
            needed+=candidates[i];
        }
    }


}