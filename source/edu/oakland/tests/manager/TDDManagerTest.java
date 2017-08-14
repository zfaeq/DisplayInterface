import org.junit.*;
import org.junit.runner.RunWith;
import edu.oakland.production.manager.*;
import static org.junit.Assert.*;

import edu.oakland.production.display.*;
import edu.oakland.production.middleware.*;
import edu.oakland.production.database.*;
import java.util.*;

public class TDDManagerTest {
	private TTTManager manager;
	private TTTDisplay display;
	private TTTMiddleware middleware;
	private TTTDatabase database;
	
	@Before
	// create display and manager classes
	public void initializeSystem() {
		manager = new TTTManager();
	}
		
	@Test
	public void test_Initial_Win_Or_Draw_is_false() {	
		assertFalse(manager.getGameIsOver());
	}

	@Test
	public void testPlaceMarkOnBoard() {
		manager.placeMarkOnBoard();	
	}
	
	@Test
	public void testPrintCurrentBoard() {
		manager.printCurrentBoard();
	}
	
	@Test
	public void testChangePlayer() {
		
		char temp = 'O';
		
		if ( manager.getCurrentPlayer() == 'X' ) temp = 'O';
		manager.changePlayer();
		
		boolean resultX = ( temp == manager.getCurrentPlayer());
		
		if ( manager.getCurrentPlayer() == 'O' ) temp = 'X';
		manager.changePlayer();
		
		
		
		boolean resultO = (temp == manager.getCurrentPlayer());
	
		assertTrue(resultX && resultO);		
		
	}
	
	//Need interface classes to play game
	
	@Test
	public void test_WinOrDraw() {
		//Play the game, win condition
		TTTManager play = new TTTManager();
		play.launchApp();
		assertFalse(manager.getGameIsOver());
	}


}
