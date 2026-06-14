class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer,Integer> map =new HashMap<>();
        
        for(int j = nums2.length-1;j>=0;j--){
            while(!stack.isEmpty() && nums2[j] >stack.peek()){
                stack.pop();
            }
            map.put(nums2[j],stack.isEmpty()? -1: stack.peek());
            stack.push(nums2[j]);
            
        }

        for(int x = 0; x<res.length;x++){
            res[x] = map.get(nums1[x]);
        }
        return res;
    }
}