package edu.oakland.tests.display;


import org.junit.*;
import static org.junit.Assert.*;
import edu.oakland.production.*;
import edu.oakland.helper.*;



public class PlaceMarkOnBoardTDD {
	TTTDispaly display;
	TTTMiddleware_test middle;
	
		
	
	@Before
	public void perormSystemInitialization(){
		middle = new TTTMiddleware(null);
		display = new TTTDispaly(middle)
	}
	
	@Test
	public void testMarkStored(){
			display.placeMarkOnBoard('x');
			assertEquals(display.markPlaced(), 'x');
			display.placeMarkOnBoard('y');
			assertEquals(display.markPlaced(), 'y');
			display.placeMarkOnBoard('p');
			assertEquals(display.markPlaced(), '');
		
	}
	@Test 
	public void testgetVal(){
		
	}
}