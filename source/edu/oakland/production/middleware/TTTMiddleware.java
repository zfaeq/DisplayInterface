package edu.oakland.production.middleware;

public class TTTMiddleware {
	
	private TTTDatanbase dataBase;
	private int rowNumber;
	private int colNUmber;
	private markChar;
	private boolean isBoardFull;
	private boolean isThereAWinOrDraw;
	
	public TTTMiddleware(TTTDatabase ref) {
		dataBase = ref;
	}
	
	// method to select position
	public boolean placeMarkOnBoard(int rowValue, int colValue, char markValue) {
		rowNumber = rowValue;
		colNumber = colValue;
		markChar = markValue;
		ref.placeMarkAsSelected(rowNumber, colNumber, markChar);
	}
	
	/* provide method to check for win or draw; this involves
	(1) retrieveing sets of all rows, columns and diagonal cells;
	(2) check each set for all cells containing the same player "mark";
	(3) if (1) & (2) above are flase, check to see if Board is full
	which means a tie; all these conditions lead to "game over"; */
	public char checkForWinOrDraw(){
		//provide Java code to check for win or draw for all possibilities;
		isThereAWinOrDraw = (result of analysis of all rows, columns adn diags);
		return isThereAWinOrDraw;
		
		//provide Java to print out win or draw; if neither, print nothing;
		
		//if win or draw, provide Java code to end game;
	}
	
	//provide a method to print the Board status;
	public char[][] getBoard(){
		
	}
}