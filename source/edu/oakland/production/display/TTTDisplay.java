package edu.oakland.production.display;

public class TTTDispaly {
	//private TTTMiddleware middleware;
	private int rowNumber;
	private int columnNumber;
	private char playerMark;
	private char[][]boardStatus;
	private boolean isWinOrDraw;
	
	
	TTTDisplay(TTTMiddleware ref){
		middleware = ref;
	}
	
	public void placeMarkOnBoard(char mark){
		
	}
	
	public boolean checkforWinOrDraw(){
		Char status = middleware.checkForWinOrDraw();
		switch(status) {
			case 'X' :  
				System.out.println("X wins");
				return true;
			case 'O' :  
				System.out.println("O wins");
				return true;
			case 'D' :
				System.out.println("Draw");
				return true;
			case 'N' :
				return false;
			default :
				System.out.println("Invalid status");
				return true;
		}
	}
	public boolean printCurrentBoard(){
		
	}
	
	public void changePlayer(char mark){
		
	}
	
	
}
