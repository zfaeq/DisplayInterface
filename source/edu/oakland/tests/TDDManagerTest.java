import org.junit.*;
import org.junit.runner.RunWith;
import edu.production.*;


public class TDDManagerTest {
	private TicTacToeManager manager;
	
	@Before
	// create display and manager classes
	public void initializeSystem() {
		manager = new TicTacToeManager();
	}
	
	@Test
	public void testChooseSquare() {
		manage.chooseSquare();
		assertTrue(true);
	}
	
	@Test
	public void testPrintCurrentBoard() {
		manager.printCurrentBoard();
		assertTrue(true);
	}
	
	@Test
	public void testChangePlayer() {
		char current = getCurrentPlayer();
		char temp = 'O';
		
		if ( current == 'X' ) temp = 'O';
		manager.changePlayers();
		
		boolean resultX = ( temp == current);
		
		if ( current == 'O' ) temp = 'X';
		manager.changePlayers();
		
		boolean resultO = (temp == current);
	
		assertTrue(resultX && resultO);		
	}
	
	@Test
	public void test_Initial_Win_Or_Draw_is_false() {
		manager.checkForWinOrDraw();
		assertFalse(manager.gameIsOver());
	}
	
	@Test
	public void test_WinOrDraw_Win() {
		//Play the game
		manager.checkForWinOrDraw();
		assertFalse(manager.gameIsOver());
	}
}
