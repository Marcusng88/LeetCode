class Solution {
    public int maxProduct(int n) {
        if(n<10) return n;
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            int current = n % 10;
            n /=10;
            list.add(current );
        }
        Collections.sort(list);
        int size = list.size();
        return (list.get(size-1) * list.get(size-2));
    }
}