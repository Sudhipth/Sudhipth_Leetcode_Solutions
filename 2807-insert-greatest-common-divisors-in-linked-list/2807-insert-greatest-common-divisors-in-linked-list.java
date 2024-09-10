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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ArrayList<Integer> l=new ArrayList<>();
        while(head!=null)
        {
            l.add(head.val);
            head=head.next;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<l.size();i++)
        {
            int n2=l.get(i-1);
            int n1=l.get(i);
            int min=Math.min(n1,n2);
            for(int j=min;j>0;j--)
            {
                if(n1%j==0 && n2%j==0)
                {
                    ans.add(j);
                    break;
                }
            }
            
        }
        head = null ;
        ListNode tail = null ;
        for(int i = 0 ; i < l.size() - 1 ; i++){
            ListNode nn = new ListNode(l.get(i));
            ListNode nn1 = new ListNode(ans.get(i));
            if(head == null){
                head = nn ;
                head.next = nn1 ;
                tail = nn1 ;
            }
            else{
                tail.next = nn ;
                tail = nn ;
                tail.next = nn1 ;
                tail = nn1 ;
            }
        }
        ListNode ln = new ListNode(l.get(l.size() - 1)) ;
        if(head == null){
            head = ln ;
        }
        else{
            tail.next = ln;
            tail = ln;
        }
        return head;
    }
}