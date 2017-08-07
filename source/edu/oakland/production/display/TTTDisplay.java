package edu.oakland.production.display;
import edu.oakland.production.middlewareStubs.*;

import java.util.Scanner;

public class TTTDisplay {
	private TTTMiddleware middleware;
	private int rowNumber;
	private int columnNumber;
	private char playerMark;
	private char[][]boardStatus;
	private boolean isWinOrDraw;
	
	
	
	
	public TTTDisplay(TTTMiddleware ref){
		middleware = ref;		
		//TODO print instructions
	}
	
	public void placeMarkOnBoard(char mark){
		boolean goodVal = false;
		playerMark = mark;
		
		Scanner reader = new Scanner(System.in);
		
		int n = -99;
		char let = 'p';
		
		while(goodVal){
			
			do{
				
				System.out.print(mark+" enter a number : ");
				n = reader.nextInt(); 
				System.out.println();
				if( !nInRange(n) ){
					System.out.println(mark+"Try new number : ");
				}
			}while ( nInRange(n) );

			do{
				System.out.print(mark+" enter a Letter : ");
				let = reader.next().charAt(0);
				let =  Character.toLowerCase(let);
				System.out.println();
				if(seeIfGoodChar(let)){
					System.out.print(mark+"Try new letter : ");
				}
			}while(seeIfGoodChar(let));
			goodVal = middleware.placeMarkOnBoard(changeLetToNum(let), n-1, mark);
		}
		
	}
	
	//*******************helper methods for placeMarkOnBoard
	private int changeLetToNum(char let){
		switch(let) {
			case 'a': 
				return 0;
			case 'b':
				return 1;
			case 'c':
				return 2;
			default :
				return -99;
		}
	}
	
	private boolean seeIfGoodChar(char let){
		
		switch(let) {
			case 'a': 
				return true;
			case 'b':
				return true;
			case 'c':
				return true;
			default :
				return false;
		}
	}
	private boolean nInRange(int n){
		if (n<4 && n>0){
			return true;
		}
		return false;
	}
	//********************end helper methods for placeMarkOnBoard
	
	
	public boolean checkforWinOrDraw(){


	
		char status = middleware.checkForWinOrDraw();
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
	public void  printCurrentBoard(){
		//Get array from  middleware, return 3d array
		char[][] b = middleware.getBoard();//getboard from middleware.
	        System.out.println("\t  1 2 3");
	        System.out.println("\tA "+ b[0][0] + "|" +b[0][1] + "|" + b[0][2]);
	        System.out.println("\t -------");
	        System.out.println("\tB "+ b[1][0] + "|" +b[1][1] + "|" + b[1][2]);
	        System.out.println("\t -------");
	        System.out.println("\tC "+ b[2][0] + "|" +b[2][1] + "|" + b[2][2]);	
	}


	
	
}
