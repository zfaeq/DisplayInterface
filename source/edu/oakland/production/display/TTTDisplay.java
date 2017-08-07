package edu.oakland.production.dispaly;
package edu.oakland.production.middlewareSubs;

public class TTTDisplay {
	//private TTTMiddleware middleware;
	private int rowNumber;
	private int columnNumber;
	private char playerMark;
	private char[][]boardStatus;
	private boolean isWinOrDraw;
	
	
	
	
	TTTDisplay(TTTMiddleware ref){
		middleware = ref;		
		//TODO print instructions
	}
	
	public void placeMarkOnBoard(char mark){
		boolean goodVal = false;
		playerMark = mark;
		
		Scanner reader = new Scanner(System.in);
		
		/*while(!goodVal){
			this.printCurrentBoard();
			System.out.println(mark+" enter a number : ");
			int n = reader.nextInt(); 
			
		}*/
	}
	
	public int[] getXYVal(int n){
		
		int x = (n+1)/2;
		int y = 0;
		int [] temp= {x,y};
		 return temp;
		
	}
	public char markPlaced(){
		return playerMark;
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
