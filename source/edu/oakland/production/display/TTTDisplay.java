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
