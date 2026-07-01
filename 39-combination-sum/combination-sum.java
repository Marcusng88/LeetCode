class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        backtrack(candidates, target, 0, path, res);
        return res;
    }

    static void backtrack(int[] candidates,int remain, int start, List<Integer> path, List<List<Integer>> res ){

        if(remain < 0){
            return;
        }
        if(remain == 0){
            res.add(new ArrayList<>(path));
        }

        for(int i = start; i<candidates.length;i++){

            // for(int j = 0; j<candidates.length;j++){
            //     path.add(candidates[j]);
                
            // }
            path.add(candidates[i]);
            backtrack(candidates ,remain-candidates[i],i, path, res);
            path.remove(path.size()-1);
            
        }
        

    }
}