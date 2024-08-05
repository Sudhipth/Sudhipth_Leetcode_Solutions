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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode ss=head;
        if(head==null)
        return head;
        int size=0;
        while(ss!=null)
        {
            size++;
            ss=ss.next;
        }
        int n=(k<size)?k:k%size;
        for(int i=0;i<n;i++)
        {
            ListNode last=head;
            while(last.next.next!=null)
            {
              size++;
              last=last.next;
             }
            last.next.next=head;
            head=last.next;
            last.next=null;           
        }
        return head;
    }
}