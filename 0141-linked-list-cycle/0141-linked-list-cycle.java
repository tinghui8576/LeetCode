/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode starter = head;
        ListNode pointer = head;
        while(pointer != null && pointer.next != null){
            starter = starter.next;
            pointer = pointer.next.next;
            
            if (starter == pointer)
                return true;
        }
        return false;
    }
}