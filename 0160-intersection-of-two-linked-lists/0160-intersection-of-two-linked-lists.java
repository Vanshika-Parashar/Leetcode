/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la=0;
        int lb=0;
        ListNode ta=headA;
        ListNode tb=headB;
        while(ta!=null){
            ta=ta.next;
            la++;
        }
        while(tb!=null){
            tb=tb.next;
            lb++;
        }
        ta=headA;
        tb=headB;
        if(la>lb){
            int diff=la-lb;
            for(int i=0;i<diff;i++){
                ta=ta.next;
            }
        }
        else if(lb>la){
            int diff=lb-la;
            for(int i=0;i<diff;i++){
                tb=tb.next;
            }

        }
        while(ta!=tb){
            ta=ta.next;
            tb=tb.next;
        }
        return ta;
        
    }
}