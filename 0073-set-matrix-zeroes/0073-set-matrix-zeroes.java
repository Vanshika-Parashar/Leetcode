class Solution {
    public void setZeroes(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int [][] help=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                help[i][j]=a[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(help[i][j]==0){
                    for(int k=0;k<m;k++){
                        a[k][j]=0;
                    }
                    for(int k=0;k<n;k++){
                        a[i][k]=0;
                    }
                }
            }
        }
        
        

        
    }
}