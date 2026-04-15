class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        boolean targetExist = false;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i< words.length; i++){
            if(words[i].equals(target)){
                targetExist = true;
                res.add(i);
            }
        }
        if(!targetExist){
            return -1;
        }
        int result = Integer.MAX_VALUE;
        for(int i : res){
            int n = words.length;
            int toLeft,toRight;
            toLeft = toRight = startIndex;
            int countLeft, countRight;
            countLeft = countRight = 0;
            
            
            while(toLeft!=i){
                toLeft = (toLeft-1+n)%n;
                countLeft++;
            }
            while(toRight!=i){
                toRight = (toRight+1)%n;
                countRight++;
            }
            int intermediate = Math.min(countLeft , countRight);
            result = Math.min(intermediate, result);

            // int intermediate = Math.min(Math.abs((-i-startIndex+n)%n), Math.abs((i-startIndex+n)%n));
            // result = Math.min(result, intermediate);
        }
        return result;
    }
}