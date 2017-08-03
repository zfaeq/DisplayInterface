package edu.oakland.production.display;

public interface TTTDispaly {
	
	
	public void placeMarkOnBoard(int row, int column,char mark);
	// Places the requested mark on the location defined by the row and column parameters
	public boolean checkforWinOrDraw();
		// Call a middleware method to check for win/draw after each move

	public boolean printCurrentBoard();

	// Redraw board after each move
	public void changePlayer(char mark);
	
	// alternate players after each move
}