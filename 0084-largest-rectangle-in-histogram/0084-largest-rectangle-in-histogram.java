class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[]left=new int[n];//left nearest smaller
        int[] right=new int[n];//right smaller nearest
        Stack<Integer>st=new Stack<>();

        //right smaler nearest;
        right[n-1]=n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                right[i]=n;
            }
            else{
                right[i]=st.peek();
            }
            st.push(i);
        }
        //we will empty eiting stack
        while(!st.isEmpty()){
            st.pop();
        }
        //left smaler nearest;
        left[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.size()==0){
                left[i]=-1;
            }
            else{
                left[i]=st.peek();
            }
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]-1;
            int currarea=arr[i]*width;
            ans=Math.max(ans,currarea);
        }
        return ans;
        



        
    }
}