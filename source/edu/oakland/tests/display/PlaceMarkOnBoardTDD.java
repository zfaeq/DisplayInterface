package edu.oakland.tests.display;


import org.junit.*;
import static org.junit.Assert.*;
import edu.oakland.production.display.*;
import edu.oakland.production.middlewareStubs.*;
//import edu.oakland.helper.*;
import java.io.*;



public class PlaceMarkOnBoardTDD {
	TTTDisplay display;
	TTTMiddleware middle;
	
		
	
	@Before
	public void performSystemInitialization(){
		middle = new TTTMiddleware();
		display = new TTTDisplay(middle);
	}
	
	
	
	@Test
	public void testInputs(){
		String st = "2"+"\n"+"b";
		InputStream in  = new ByteArrayInputStream(st.getBytes());
		System.setIn(in);
		display.placeMarkOnBoard('x');
		assertEquals(1, display.getRowInput());
		assertEquals(1, display.getColumnInput());
		assertTrue(display.getGoodVal());
	}
	
	//TODO addmore testss
	
	
	
	
}