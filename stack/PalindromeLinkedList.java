public class PalindromeLinkedList {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> pa=new Stack<>();
        int y=0;
        int x=0;
        ListNode current=head;
        while(current!=0){
            current=current.next;
            x=x+1;
        }
        if(x%2==0){
            x=x/2;
            while(current!=null){
                if(x>0){
                pa.push(current.next.val);
                x=x-1;
                }else{
                    int z=pa.peek();
                    pa.pop();
                    if(current.next.val==z){
                        y=1;
                    }
                    else{
                        y=0;
                    }
                }
        }
        else{
            x=(x+1)/2;
            while(current!=null){
                if(x>0){
                pa.push(current.next.val);
                x=x-1;
                }
                else if(x==0){
                    pa.pop();
                }
                else{
                    int z=pa.peek();
                    pa.pop();
                    if(current.next.val==z){
                        y=1;
                    }
                    else{
                        y=0;
                    }
                }

        }
    }
}

#optimized code
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is considered a palindrome
        }

        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the linked list has an odd number of nodes, skip the middle element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stack.pop();
            if (top != slow.val) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
