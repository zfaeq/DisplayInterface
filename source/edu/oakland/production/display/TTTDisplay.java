package edu.oakland.production.dispaly;

public class TTTDispaly {
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
		int [2] temp= {x,y};
		 return temp;
		
	}
	public char markPlaced(){
		return playerMark;
	}
	
	public boolean checkforWinOrDraw(){
		
		
	}
	public boolean printCurrentBoard(){
		
	}
	
	public void changePlayer(char mark){
		
	}
	
	
}
