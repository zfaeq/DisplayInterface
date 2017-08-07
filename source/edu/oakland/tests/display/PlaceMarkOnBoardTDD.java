package edu.oakland.tests.display;


import org.junit.*;
import static org.junit.Assert.*;
import edu.oakland.production.*;
import edu.oakland.helper.*;

public class PlaceMarkOnBoardTDD {
	TTTDispaly display;
	TTTMiddleware middle;
		
	
	@Before
	public void perormSystemInitialization(){
		display = new TTTDispaly(middle)
	}
	
	@Test
	public void testMarkStored(){
			
		
	}
	
}