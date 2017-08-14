package edu.oakland.production.database;

public class TTTDatabase{	
	private char[][] board;
	
	public TTTDatabase(){
		board = new char[][]{{'-','-','-'}, {'-','-','-'}, {'-','-','-'}};
	}
	
	public void writeToBoard(int row, int col, char mark){
		board[row][col] = mark;
	}
	
	public char[][] getBoardStatus(){
		return board;
	}
	
	public char getCellValues(int row, int col){
		return board[row][col];
	}
}
