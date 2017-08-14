package edu.oakland.production.middleware;

import edu.oakland.production.database.TTTDatabase;

public class TTTMiddleware {
	
	private TTTDatabase database;

	public TTTMiddleware(TTTDatabase database) {
		this.database = database;
	}

    /**
     * The placeMarkOnBoard method is used to place a mark on the board for the active player.
     *
     * @param mark the mark to place
     * @param row the row to place the mark
     * @param col the column to place the mark
     * @return true if the mark was placed successfully, false if a mark was
     * already placed there previously
     */
    public boolean placeMarkOnBoard(char mark, int row, int col){
    	if (mark == 'X' || mark == 'O' && row >= 0 && row <= 2 && col >= 0 && col <= 2) {
    		if (database.getCellValues(row, col) == '-') {
    			database.writeToBoard(row, col, mark);
    			return true;
    		}
    		else
    			return false;
    	}
    	else
    		return false;
    }

    /**
     * The checkForWinOrDraw determines if win or draw has occurred.
     *
     * @return the character of the player that won, 'd' for draw, or 'n' for none
     */
    public char checkForWinOrDraw(){
        char[][] A = database.getBoardStatus();
		if (A[0][0] != '-'){
			if(A[0][0] == A[0][1] && A[0][1] == A[0][2]){
				return A[0][0];
			} else if (A[0][0] == A[1][0] && A[1][0] == A[2][0]){
				return A[0][0];
			}
		}
		//Checks the diagonals, middle row and column. Returns char of sequence.
		if (A[1][1] != '-'){
			if (A[1][0] == A[1][1] && A[1][1] == A[1][2]){
				return A[1][1];
			} else if (A[0][1] == A[1][1] && A[1][1] == A[2][1]) {
				return A[1][1];
			} else if (A[0][0] == A[1][1] && A[1][1] == A[2][2]){
				return A[1][1];
			} else if (A[2][0] == A[1][1] && A[1][1] == A[0][2]){
				return A[1][1];
			}
		}
		//Checks the bottom row and right column. Returns char of sequence.
		if (A[2][2] != '-') {
			if (A[2][0] == A[2][1] && A[2][1] == A[2][2]){
				return A[2][2];
			} else if (A[0][2] == A[1][2] && A[1][2] == A[2][2]){
				return A[2][2];
			}
		}
		//Checks all the cells for a "-". If any then return N.
		for (int i =0; i < 3; i++){
			for(int j=0; j < 3; j++){
				if (A[i][j] == '-'){
					return 'N';
				}
			}
		}
		//Returns a D for a draw.
		return 'D';
    }

    /**
     * The getBoard method is used for accessing an array version of the board.
     *
     * @return the board as a two-dimensional board
     */
    public char[][] getBoard(){
    	return(database.getBoardStatus());
    }
}
