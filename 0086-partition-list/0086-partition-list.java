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
    public ListNode partition(ListNode head, int x) {
        ListNode small =new ListNode (100);
        ListNode large =new ListNode (100);
        ListNode temps=small;
        ListNode templ=large;
        ListNode temp=head;
        while(temp!=null){
            int p=temp.val;
            if(p<x){
                temps.next=temp;
                temps=temps.next;
            }else{
                templ.next=temp;
                templ=templ.next;
            }
            temp=temp.next;
        }
        templ.next=null;
        temps.next=large.next;
        return small.next;
        
    }
}