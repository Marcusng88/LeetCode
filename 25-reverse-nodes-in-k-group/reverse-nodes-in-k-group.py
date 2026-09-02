# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode(0, head)
        group_prev = dummy

        while True:
            kth = self.getKth(group_prev, k)

            if kth is None:
                break
            
            group_next = kth.next

            old_group_start = group_prev.next
            prev = group_next
            curr = group_prev.next

            while curr != group_next:
                nxt = curr.next
                curr.next = prev
                prev = curr
                curr = nxt
            
            group_prev.next = prev
            group_prev = old_group_start

        return dummy.next

    
    def getKth(self, curr, k):
        while curr is not None and k > 0:
            curr = curr.next
            k-=1
        return curr
        