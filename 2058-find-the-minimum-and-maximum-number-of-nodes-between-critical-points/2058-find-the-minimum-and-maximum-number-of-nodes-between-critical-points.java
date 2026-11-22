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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode l=head;
        ListNode mid=head.next;
        ListNode r=head.next.next;
        int first=-1,last=-1;
        int idx=1;
        int[]arr={-1,-1};
        int dis=1;
        int min=Integer.MAX_VALUE;;
        while(r!=null){
            if((mid.val<l.val && mid.val<r.val) || (mid.val>l.val && mid.val>r.val)){
                if(first==-1)first=idx;
                //for minDistance
                if(last!=-1){
                    dis=idx-last;
                    min=Math.min(min,dis);
                }
                //formaxDistance
                last=idx;
            }
            idx++;
            l=l.next;
            mid=mid.next;
            r=r.next;
        }
        if(first==last)return arr;
        //formaxDistance
        int maxD=last-first;
        arr[0]=min;
        arr[1]=maxD;
        return arr;
        
    }
}