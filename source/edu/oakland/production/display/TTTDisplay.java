package edu.oakland.production.display;
import edu.oakland.production.middleware.*;

import java.util.Scanner;

public class TTTDisplay {
	private TTTMiddleware middleware;
	private int rowNumber;
	private int columnNumber;
	private char playerMark;
	private char[][]boardStatus;
	private boolean isWinOrDraw;
	
	//for test
	boolean goodVal;
	String testInput;
	
	
	public TTTDisplay(TTTMiddleware ref){
		middleware = ref;		
		//TODO print instructions
	}
	
	public String getInput(){
		return testInput;
	}
	public boolean getGoodVal(){
		return goodVal;
	}
	public int getRowInput(){
		return rowNumber;
	}
	public int getColumnInput(){
		return columnNumber;
	}
	

	
	public void placeMarkOnBoard(char mark){
		goodVal = false;
		playerMark = mark;
		
		Scanner reader = new Scanner(System.in);
		
		
		
		
		while(!goodVal){
			
			
			
		
			
			rowNumber =  getleterFromUser(mark, reader);
			columnNumber  = getNumberFromUser(mark, reader);
			goodVal = middleware.placeMarkOnBoard(mark, rowNumber ,columnNumber);
			if(!goodVal){
				System.out.println("Spot Taken!!!");
			}
			
 		} 
		
	}
	
	//*******************helper methods for placeMarkOnBoard
	private int getNumberFromUser(char mark , Scanner reader){
		int n = -99;
		int count = 0; 
		do{
				
				System.out.print(mark+" enter a number : ");
				//reader.next();
				if(reader.hasNextInt()){
					n = reader.nextInt(); 	
				}else{
					reader.next();
				}				
				if( !nInRange(n) ){
					System.out.println("Number out of range, try again!!! ");
				}
				count++;
		}while ( !nInRange(n) && count<=5 );
		
		return n-1;
	}
	
	private int getleterFromUser(char mark , Scanner reader){
		char let;
		do{
				System.out.print(mark+" enter a Letter : ");
				let = reader.next().charAt(0);
				let =  Character.toLowerCase(let);
				
				if(!seeIfGoodChar(let)){
					System.out.println("Letter out of range try again!!! ");
				}
		}while(!seeIfGoodChar(let));
		
		return changeLetToNum(let);
		
	}
	
	
	private int changeLetToNum(char let){
		int num;
		switch(let) {
			case 'a': 
				num =  0;
				break; 
			case 'b':
				num = 1;
				break;
			case 'c':
				num = 2;
				break;
			default :
				num = 4;
				break;
		}
		return num;
	}
	
	private boolean seeIfGoodChar(char let){
		boolean tempB;
		switch(let) {
			case 'a': 
				tempB = true;
				break;
			case 'b':
				tempB =  true;
				break;
			case 'c':
				tempB =  true;
				break;
			default :
				tempB =  false;
				break;
		}
		return tempB;
	}
	private boolean nInRange(int n){
		if (n>0 && n < 4){
			return true;
		}
		return false;
	}
	//********************end helper methods for placeMarkOnBoard
	
	
	public boolean checkForWinOrDraw(){


	
		char status = middleware.checkForWinOrDraw();
		status = Character.toUpperCase(status);
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
