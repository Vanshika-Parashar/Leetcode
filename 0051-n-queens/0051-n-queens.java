class Solution {
    public List<List<String>> solveNQueens(int n) {
    //     char[][]board=new char[n][n];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             board[i][j]='.';
    //         }
    //     }
    //     List<List<String>>ans=new ArrayList<>();
    //     nqueen(board,n,0,ans);
    //     return ans;
        
    // }
    // public void nqueen(char[][]board,int n,int row,List<List<String>>ans){
    //     if(row==n){
    //        List<String> list = new ArrayList<>();
    //         for(int i=0;i<n;i++){
    //             list.add(new String(board[i]));
    //         }
    //         ans.add(list);
    //         return;
    //     }
    //     for(int j=0;j<n;j++){
    //         if(issafe(board,row,j)){
    //             board[row][j]='Q';
    //             nqueen(board,n,row+1,ans);
    //             board[row][j]='.';
    //         }
            


    //     }
    // }
    // public boolean issafe(char[][]board,int row,int col){
    //     int i,j;
    //     int n=board.length;
    //     //column check
    //     i=row;
    //     j=col;
    //     while(j<n){
    //         if(board[i][j]=='Q')return false;
    //         j++;
    //     }
    //     //row check
    //     i=0;
    //     j=col;
    //     while(i<n){
    //         if(board[i][j]=='Q')return false;
    //         i++;
    //     }
    //     //north-east check
    //     i=row;
    //     j=col;
    //     while(i>=0 && j<n){
    //         if(board[i][j]=='Q')return false;
    //         i--;
    //         j++;
    //     }
    //     //south-east check
    //     i=row;
    //     j=col;
    //     while(i<n&& j<n){
    //         if(board[i][j]=='Q')return false;
    //         i++;
    //         j++;
    //     }
    //     //south-west check
    //     i=row;
    //     j=col;
    //     while(i<n && j>=0){
    //         if(board[i][j]=='Q')return false;
    //         i++;
    //         j--;
    //     }
    //     //north-west check
    //     i=row;
    //     j=col;
    //     while(i>=0 && j>=0){
    //         if(board[i][j]=='Q')return false;
    //         i--;
    //         j--;
    //     }
    //     return true;

        
        char[][]ch=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ch[i][j]='.';
            }
        }
        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        return nqueen(ch,n,0,ans);
    }
    public List<List<String>> nqueen(char[][]ch,int n,int row,List<List<String>>ans){
        if(row==n){
            List<String>list=new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(new String(ch[i]));
            }
            ans.add(list);
            return ans;
        }
        for(int j=0;j<n;j++){
            if(ispossible(ch,row,j,n)){
            ch[row][j]='Q';
            nqueen(ch,n,row+1,ans);
            ch[row][j]='.';
            }
        }
        return ans;
        
    }
    public boolean ispossible(char[][]ch,int row,int col,int n){
        int i,j;
        //down
        i=row;
        j=col;
        while(i<n){
            if(ch[i][j]=='Q')return false;
            i++;
        }
        //column(hoda smj nhi aaya )
        i=0;
        j=col;
        while(i<n){
            if(ch[i][j]=='Q')return false;
            i++;
        }
       //north-east
       i=row;
       j=col;
       while(i>=0 && j<n){
        if(ch[i][j]=='Q')return false;
        i--;
        j++;
       }
    //    south-east
       i=row;
       j=col;
       while(i<n && j<n){
        if(ch[i][j]=='Q')return false;
        i++;
        j++;
       }
    //    north-west
       i=row;
       j=col;
       while(i>=0 && j>=0){
        if(ch[i][j]=='Q')return false;
        i--;
        j--;
       }
       //south-west
       i=row;
       j=col;
       while(i<n && j>=0){
        if(ch[i][j]=='Q')return false;
        i++;
        j--;
       }
       return true;


        


    }

}