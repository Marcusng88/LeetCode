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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;

        if (n==1 && curr.next ==null){
            return null;
        }
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size ++;
        }
        curr = head;
        int idx = size - n;
        if(idx == 0){
            return head.next;
        }
        for(int i = 0 ;i<idx-1;i++){
            curr = curr.next;

        }
        ListNode next = curr.next;
        curr.next = curr.next.next;
        next = null;
        curr = head;
        return curr;
    }
}