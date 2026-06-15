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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode curr = head;
        int size = 0;
        while(curr!=null){
            curr = curr.next;
            size ++;
        }
        curr = head;
        int idx = size / 2;
        for(int i = 0 ; i< idx-1;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next ;
        curr = head;
        return curr;
    }
}