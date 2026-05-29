class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>n=new HashMap<>();
        Stack<Integer>st=new Stack<>();
        int l2=nums2.length;
        for(int i=l2-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=nums2[i]){

                st.pop();
            }
            if(st.isEmpty()){
                n.put(nums2[i],-1);
            }
            else{
                n.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }
        int[]ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=n.get(nums1[i]);
        }
        return ans;
    }
}