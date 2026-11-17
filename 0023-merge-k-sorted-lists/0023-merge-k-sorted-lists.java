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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<ListNode>arr=new ArrayList<>();
        for(ListNode node : lists) {
            if(node != null) {
                arr.add(node);
            }
        }

        if(arr.size() == 0) return null;

        int n=lists.length;
        while(arr.size()>1){
            ListNode list1=arr.remove(arr.size()-1);
            ListNode list2=arr.remove(arr.size()-1);
            ListNode temp=merge(list1,list2);
            arr.add(temp);
            
        }
        return arr.get(0);

    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(100);
        ListNode t=dummy;
        ListNode t1=list1;
        ListNode t2=list2;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                t.next=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1==null){
            t.next=t2;
        }else{
            t.next=t1;
        }
        return dummy.next;
    }
}