class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        char ch=word.charAt(0);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==ch){
                    if(find(board,word,i,j,0)) return true;;
                }
            }
        }
        return false;
    }
    public boolean find(char[][]board,String word,int r, int col,int i){
        if(i==word.length())return true;
        if(r>=board.length || col>=board[0].length || r<0 || col<0)return false;
        if(board[r][col]!=word.charAt(i))return false;
        char temp=board[r][col];
        board[r][col]='#';
        boolean found=find(board,word,r,col+1,i+1)||
        find(board,word,r+1,col,i+1)||
        find(board,word,r-1,col,i+1)||
        find(board,word,r,col-1,i+1);
        board[r][col]=temp;
        return found;

    }
}