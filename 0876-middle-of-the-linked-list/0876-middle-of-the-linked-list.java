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
    public ListNode middleNode(ListNode head) {
        ListNode starter = head;
        ListNode pointer = head;
        while(pointer != null && pointer.next != null){
            starter = starter.next;
            pointer = pointer.next.next;
        }
        return starter;
    }
}