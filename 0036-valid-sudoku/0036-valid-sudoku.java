class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                char n=board[i][j];
                board[i][j]='.';
                if(isValid(board,i,j,n)==false)return false;
                board[i][j]=n;
            }
        }
        return true;
    }
    public boolean isValid(char[][]board,int row,int col,char n){
        //check row
        for(int j=0;j<9;j++){
            if(board[row][j]==n)return false;
        }
        //check column
        for(int i=0;i<9;i++){
            if(board[i][col]==n)return false;
        }
        //check 3*3 grid
        int strow=(row/3)*3;
        int stcol=(col/3)*3;
        for(int i=strow;i<strow+3;i++){
            for(int j=stcol;j<stcol+3;j++){
                if(board[i][j]==n)return false;
            }
        }
        return true;
    }
}