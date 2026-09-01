# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import heapq
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        counter = 0
        for node in lists:
            if node:
                heapq.heappush(
                    heap,
                    (node.val , counter , node)
                )
                counter+=1
        
        dummy = ListNode(0)
        curr = dummy
        while heap:
            _, _,curr_node = heapq.heappop(heap)
            
            curr.next = curr_node
            curr = curr_node

            if curr_node.next:
                heapq.heappush(
                    heap,
                    (curr_node.next.val, counter, curr_node.next)
                )
                counter+=1


        return dummy.next
        