/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head == null || head.next == null) return 0;
        int res = 0;
        int n = 0;
        ListNode current = head;
        ListNode prev = null;
        ArrayList<Integer> arr = new ArrayList<>();

        while(current!=null){
            // ListNode next = current.next;
            // current.next = prev;
            // prev = current;
            // current = next;
            arr.add(current.val);
            current = current.next;
            n++;            
        }
        Collections.reverse(arr);
        current = head;

        for(int i = 0; i < n / 2;i++){
            res = Math.max(res, current.val+arr.get(i));
            current = current.next;
        }
        return res;
        
    }

}