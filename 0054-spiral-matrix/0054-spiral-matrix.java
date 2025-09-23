class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        //pattern is printing in right->bottom->left->top
        int n=matrix.length;//row
        int m=matrix[0].length;//column
        ArrayList<Integer>ans=new ArrayList<>();
        int top=0;
        int left=0;
        int right=m-1;
        int bottom=n-1;
        while (top<=bottom && left<=right){

        
            //right
            for(int i =left;i<=right;i++){
                ans.add(matrix[top][i]);
                

            }
            top++;
            //bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
                
            }
            right--;
            //left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
                
            }
            bottom--;

            }
            
            //top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                
                }
                left++;
            }
        }
        return ans;
        
    }
}