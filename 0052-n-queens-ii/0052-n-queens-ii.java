class Solution {
    private int count=0;
    public int totalNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]ch=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }
        }
        nqueen(ch,n,0,ans);
        return count;
        
    }
    public void nqueen(char[][]ch,int n,int row,List<List<String>>ans){
        if(row==n){
            count++;
            return;
        }
        for(int j=0;j<n;j++){
            if(ispossible(ch,n,row,j)){
                ch[row][j]='Q';
                nqueen(ch,n,row+1,ans);
                ch[row][j]='.';
            }
        }
        
    }
    public boolean ispossible(char[][]ch,int n,int row,int col){
        int i,j;
       //down
        
        //upr ame column m toh queen nhii h 
        i = row - 1;
        j=col;
        while(i >= 0){
            if(ch[i][col] == 'Q') return false;
            i--;
        }
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(ch[i][j]=='Q')return false;
            i--;
            j++;

        }
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(ch[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
}