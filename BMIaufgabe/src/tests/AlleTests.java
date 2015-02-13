package tests;

import junit.framework.TestSuite;;

public class AlleTests extends TestSuite
{
	public static TestSuite suite()
	{
		TestSuite s=new TestSuite();
		s.addTestSuite(TestBmiRechner.class);
		return s;
	}
}
