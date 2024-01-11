class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];

        for(int i=0;i<moves.length;i++){
            char player = (i%2==0) ? 'A':'B';
            int row = moves[i][0];
            int col = moves[i][1];

            board[row][col] = player;

            if(checkWiner(board,row,col,player)){
                return String.valueOf(player);
            }

           
        }
         return (moves.length==9) ? "Draw":"Pending";

        
        
    }
    private boolean checkWiner(char[][] board,int row,int col, char player){
        if(board[row][0]==player && board[row][1]==player&& board[row][2]==player){
            return true;
        
        }
        if(board[0][col]==player && board[1][col]==player&& board[2][col]==player){
            return true;
        }

        if(row == col && board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }

        if(row+col==2 && board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }

        return false;
    }
}