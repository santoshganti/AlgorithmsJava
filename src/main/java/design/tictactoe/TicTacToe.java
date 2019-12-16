package design.tictactoe;

public class TicTacToe {
    private final int[][] board;

    public TicTacToe(final int n){
    	board = new int[n][n];
    }

    /**
     *  Makes a move on the board and returns the winnder if the move is winning move
     * @param player is either 0 or 1
     * @param row is the move's row index
     * @param col is the move's column index
     * @return winner+1 if the first player, -1 if the second player and zero otherwise
     * @throws IllegalArgumentException
     */
    public int move(int player, int row, int col) throws IllegalArgumentException{
        return 0;
    }
}
