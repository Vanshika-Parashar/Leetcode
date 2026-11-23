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
    public int lengthCalc(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=lengthCalc(head);
        int size=len/k;
        int extra=len%k;
        ListNode temp=head;
        
        ListNode[]arr=new ListNode[k];
        int idx=0;
        int l=1;
        while(temp!=null){
            int s=size;
            if(extra>0)s++;
            if(l==1)arr[idx++]=temp;
            if(l==s){
                ListNode a=temp.next;
                temp.next=null;
                temp=a;
                l=1;
                extra--;
            }else{
                temp=temp.next;
                l++;
            }
        }
        
        return arr;


        
    }
}