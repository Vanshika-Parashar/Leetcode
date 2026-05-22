class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        return find(n,board,0,ans);
    }
    public List<List<String>> find(int n,char[][]board,int row,List<List<String>>ans){
        if(row==n){
           List<String>list=new ArrayList<>();
           for(int i=0;i<n;i++){
            list.add(new String(board[i]));
           }
           ans.add(list);
           return ans;
        }
        for(int j=0;j<n;j++){
            if(isvalid(n,board,row,j)){
                board[row][j]='Q';
                find(n,board,row+1,ans);
                board[row][j]='.';
            }
            
        }
        return ans;

    }
    public boolean isvalid(int n,char[][]board,int row,int col){
        int i,j;
        //row check
        i=row-1;
        j=col;
        while(i>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
        }
        //north-west
        i=row-1;
        j=col-1;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j--;
        }
       // north-east
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(board[i][j]=='Q'){
                return false;
            }
            i--;
            j++;
        }
        
        return true;
    }
}