package linkedlsit;

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
        ListNode current=head; 
        ListNode fast=head;
        ListNode slow=head;
        if(head.next==null){
            return null;
        }
        else{
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        while(current!=null && current.next!=null){
            if(current.next==slow){
                current.next=current.next.next;
                break;
            }
            current=current.next;
        }
        return head;}
    }
}

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        // Handle the case of a single node in the linked list
        if (fast != null && fast.next == null) {
            return null; // Return an empty list
        }

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }
}

