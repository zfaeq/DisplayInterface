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
		
		
	}
	public void  printCurrentBoard(){
		//Get array from  middleware, return 3d array
		char[][] b;//getboard from middleware.
	        System.out.println("\t  1 2 3");
	        System.out.println("\tA "+ b[0][0] + "|" +b[0][1] + "|" + b[0][2]);
	        System.out.println("\t -------");
	        System.out.println("\tB "+ b[1][0] + "|" +b[1][1] + "|" + b[1][2]);
	        System.out.println("\t -------");
	        System.out.println("\tC "+ b[2][0] + "|" +b[2][1] + "|" + b[2][2]);	
	}
	
	public void changePlayer(char mark){
		
	}
	
	
}
