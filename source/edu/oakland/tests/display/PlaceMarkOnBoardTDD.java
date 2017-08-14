package edu.oakland.tests.display;


import org.junit.*;
import static org.junit.Assert.*;
import edu.oakland.production.display.*;
import edu.oakland.production.middleware.*;
import edu.oakland.production.database.*;
//import edu.oakland.helper.*;
import java.io.*;



public class PlaceMarkOnBoardTDD {
	TTTDisplay display;
	TTTMiddleware middle;
	TTTDatabase database;
	
		
	
	@Before
	public void performSystemInitialization(){
		database = new TTTDatabase();
		middle = new TTTMiddleware(database);
		display = new TTTDisplay(middle);
	}
	
	
	
	@Test
	public void testInputsSDS(){
		String st = "2"+"\n"+"b";
		InputStream in  = new ByteArrayInputStream(st.getBytes());
		System.setIn(in);
		display.placeMarkOnBoard('x');
		assertEquals(1, display.getRowInput());
		assertEquals(1, display.getColumnInput());
		assertTrue(display.getGoodVal());
	}
	
	
	@Test
	public void testInputsMultipleTries(){
		String st = "5"+"\n"+"3"+"\n"+"b";
		InputStream in  = new ByteArrayInputStream(st.getBytes());
		System.setIn(in);
		display.placeMarkOnBoard('x');
		assertEquals(2, display.getRowInput());
		assertEquals(1, display.getColumnInput());
		assertTrue(display.getGoodVal());
	}
	
	@Test
	public void testInputsMultipleTriesAlfa(){
		String st = "3"+"\n"+"\n"+"l"+"\n"+"k"+"\n"+"b";
		InputStream in  = new ByteArrayInputStream(st.getBytes());
		System.setIn(in);
		display.placeMarkOnBoard('x');
		assertEquals(2, display.getRowInput());
		assertEquals(1, display.getColumnInput());
		assertTrue(display.getGoodVal());
	}
	
	@Test
	public void testInputsBAD(){
		String st = "a"+"\n"+"3"+"\n"+"b";
		InputStream in  = new ByteArrayInputStream(st.getBytes());
		System.setIn(in);
		display.placeMarkOnBoard('x');
		assertEquals(2, display.getRowInput());
		//assertEquals(1, display.getColumnInput());
		//assertTrue(display.getGoodVal());
	}
	
	
	
}