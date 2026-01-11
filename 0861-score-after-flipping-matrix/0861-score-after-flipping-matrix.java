class Solution {
    public int matrixScore(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        //flip row where first elementof every roe is 0, put 1 at oth psititon of every row;    
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        //flip column where no of 0 is >no of 1
        for(int j=0;j<n;j++){
            int nz=0;
            int no=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0){
                    nz++;
                }
                else{
                    no++;
                }
                
            }
            if(nz>no){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        int x=1;
        int score=0;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score+=arr[i][j]*x;

            }
            x*=2;

        }
        return score;

        
    }
}