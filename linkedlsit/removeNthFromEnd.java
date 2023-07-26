package linkedlsit;

import org.w3c.dom.Node;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        int med=0;
        if(head==null || head.next==null){
            return null;
        }
        else{
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            med=med+1;
            fast=fast.next.next;    
            length=length+2;
        }
        if(fast.next==null){
            length=length+1;
        }
        int x=length-med+n;
        while(slow!=null && slow.next!=null && x!=0){
            slow=slow.next;
            x=x-1;
        }
        ListNode temp=slow.next.next;



    }
 
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move the fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next; // Return the updated head of the linked list
    }
}
