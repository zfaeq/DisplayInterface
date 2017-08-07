package edu.oakland.tests.display;


import org.junit.*;
import static org.junit.Assert.*;
import edu.oakland.production.display.*;
import edu.oakland.production.middlewareStubs.*;
//import edu.oakland.helper.*;



public class PlaceMarkOnBoardTDD {
	TTTDisplay display;
	TTTMiddleware middle;
	
		
	
	@Before
	public void performSystemInitialization(){
		middle = new TTTMiddleware();
		display = new TTTDisplay(middle);
	}
	
	@Test
	public void testMarkStored(){
	}
	
	@Test
	public void testInputs(){
		
	}
	
	
}