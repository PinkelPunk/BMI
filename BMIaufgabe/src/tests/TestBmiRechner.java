package tests;

import junit.framework.TestCase;
import org.junit.*;
import bmi.BmiRechner;

public class TestBmiRechner extends TestCase
{
	@Test
	public void testGetGewicht_C1()
	{
		BmiRechner bmi=new BmiRechner();
		
		assertEquals(12, bmi.getGewicht());
		
		assertEquals(17, bmi.getGewicht());
		
		assertEquals(21, bmi.getGewicht());
		
		assertEquals(28, bmi.getGewicht());
		
		assertEquals(40, bmi.getGewicht());
	}
	
	
}
