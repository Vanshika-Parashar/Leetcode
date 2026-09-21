class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n =nums.length;
        int[]nums1=new int[n];
        for(int i=0;i<n;i++){
            nums1[i]=nums[i];
        }
        int []ans=new int[n];
        ans[n-1]=-1;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && nums1[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;

            }
            else{
                ans[i]=nums[st.peek()];
            }
            st.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums1[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;

            }
            else{
                ans[i]=nums[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }
}