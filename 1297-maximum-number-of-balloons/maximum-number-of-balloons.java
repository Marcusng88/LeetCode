class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<text.length();i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i),0)+1);
        }
        int counter = 0;
        String target = "balloon";
        boolean stop = false;
        while(true){
            
            for(int i = 0; i<target.length();i++){
                if(!map.containsKey(target.charAt(i))){
                    stop = true;
                    break;
                }
                if(map.get(target.charAt(i))<=0){
                    stop = true;
                    break;
                }
                map.put(target.charAt(i),map.get(target.charAt(i))-1);

            }
            if(stop){
                break;
            }
            counter++;
        }

        return counter;
    }
}