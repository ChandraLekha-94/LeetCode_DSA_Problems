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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d=new ListNode(-1);
        ListNode t=d;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null&&t2!=null){
            if(t1.val<t2.val){
                d.next=new ListNode(t1.val);
                t1=t1.next;
                d=d.next;
            }
            else{
                d.next=new ListNode(t2.val);
                t2=t2.next;
                d=d.next;
            }
        }
        while(t1!=null){
                d.next=new ListNode(t1.val);
                d=d.next;
                t1=t1.next;
        }
        while(t2!=null){
            d.next=new ListNode(t2.val);
            d=d.next;
            t2=t2.next;
        }
        return t.next;
    }
}