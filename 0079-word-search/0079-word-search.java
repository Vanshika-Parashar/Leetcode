class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        char ch=word.charAt(0);
        boolean[][]correct=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==ch){
                    if(find(board,i,j,word,0))
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean find(char[][] board,int r,int c,String s,int idx){
        if(idx==s.length()){
            return true;
        }
        int i,j;
        int n=board.length;
        int m=board[0].length;;
         if(r < 0 || c < 0 || r >= n || c >= m || board[r][c] != s.charAt(idx)){
            return false;
        }

        char temp=board[r][c];
        board[r][c]='$';
        boolean found=find(board,r,c+1,s,idx+1)||
        find(board,r+1,c,s,idx+1)||
        find(board,r-1,c,s,idx+1)||
        find(board,r,c-1,s,idx+1);
        board[r][c]=temp;
        return found;
    }
}