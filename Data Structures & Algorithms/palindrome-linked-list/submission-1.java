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
    public ListNode midNode(ListNode head)
    {
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode next=null,prev=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        {
            return true;
        }
        ListNode mid=midNode(head);
        ListNode right=reverse(mid.next);
        ListNode temp=head;
        while(right!=null)
        {
            if(temp.val!=right.val)
            {
                return false;
            }
            temp=temp.next;
            right=right.next;
        }
        return true;
    }
}