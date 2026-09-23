class Solution {
    public void rotate(int[][] matrix) {
        //brute force approach as it is taking extra space coplexity of ans matrix 
         int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }
        for(int i=0;i<n;i++){
            int a=0;
            int b=matrix[i].length-1;
            while(a<=b){
                int temp=matrix[i][a];
                matrix[i][a]=matrix[i][b];
                matrix[i][b]=temp;
                a++;
                b--;

            }
        }
 
        
    }
}