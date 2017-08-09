package edu.oakland.production.middlewareStubs;

public class TTTMiddleware {
	
	//private TTTDatanbase dataBase;
	public TTTMiddleware() {
		
	}
	
	// method to select position
	public boolean placeMarkOnBoard( char markValue, int colValue, int rowValue ) {
		return true;
		
	}
	
	/* provide method to check for win or draw; this involves
	(1) retrieveing sets of all rows, columns and diagonal cells;
	(2) check each set for all cells containing the same player "mark";
	(3) if (1) & (2) above are flase, check to see if Board is full
	which means a tie; all these conditions lead to "game over"; */
	public char checkForWinOrDraw(){
		
		return 'w';
		
		
	}
	
	//provide a method to print the Board status;
	public char[][] getBoard(){
		return null;
	}
}