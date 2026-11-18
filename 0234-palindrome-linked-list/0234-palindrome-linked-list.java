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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer>arrr=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            arrr.add(arr.get(i));
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=arrr.get(i)){
                return false;
            }
        }
        return true;
    }
}