

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Assignment6 {


	
		double decimalpoints = 0.0001;

	    @Test	
		public	void AccuracySin() throws PowerException, FactorialException
		{
			assertEquals(Math.sin(1), TrigonometricFunctions.sin(1),0.535256);
			
		}
	   
		
		@Test
		public	void AccuracyCos() throws PowerException, FactorialException
		{
			assertEquals(Math.cos(3), TrigonometricFunctions.cos(3), decimalpoints);
		}
		
		@Test
		public	void AccuracyTan() throws PowerException, FactorialException
		{
			assertEquals(Math.tan(3), TrigonometricFunctions.tan(3), decimalpoints);
		}
		
		
		@Test
		public	void AccuracyValueinradianSin() throws PowerException, FactorialException
		{
			assertEquals(Math.sin(8.6), TrigonometricFunctions.sin(8.6), decimalpoints);
		}
		
		@Test
		public	void AccuracyValueinradianCos() throws PowerException, FactorialException
		{
			assertEquals(Math.cos(5), TrigonometricFunctions.cos(5), decimalpoints);
		}
		
		@Test
		public	void AccuracyValueinradianTan() throws PowerException, FactorialException
		{
			assertEquals(Math.tan(0.86), TrigonometricFunctions.tan(0.86), decimalpoints);
		}
		
		
		@Test
		public	void testSin2() throws PowerException, FactorialException
		{
			assertEquals(0.49999, TrigonometricFunctions.sin(
					TrigonometricFunctions.DgToRd(30)), decimalpoints);
		}

		@Test
		public	void testCos2() throws PowerException, FactorialException
		{
			assertEquals(0.8660, TrigonometricFunctions.cos(
					TrigonometricFunctions.DgToRd(30)), decimalpoints);
		}

		@Test
		public	void testTan2() throws PowerException, FactorialException
		{
			assertEquals(0.5773, TrigonometricFunctions.tan(
					TrigonometricFunctions.DgToRd(30)), decimalpoints);
		}
		
		@Test
		public	void Sin1() throws PowerException, FactorialException
		{
			assertNotEquals(Math.sin(4), TrigonometricFunctions.sin(1), decimalpoints);
		}
		
		@Test
		public	void Cos1() throws PowerException, FactorialException
		{
			assertNotEquals(Math.cos(4), TrigonometricFunctions.cos(1), decimalpoints);
		}
		
		@Test
		public	void tan1() throws PowerException, FactorialException
		{
			assertNotEquals(Math.tan(4), TrigonometricFunctions.tan(1), decimalpoints);
		}
		
		@Test
				public void powerTesting() throws PowerException, FactorialException
				{
					assertEquals(Math.pow(2, 1), TrigonometricFunctions.power(2, 1), decimalpoints);
				}
		
		

		
		@Test
		public void factTesting() throws PowerException, FactorialException
		{
			assertEquals(24, TrigonometricFunctions.fact(4));
		}
	
		
		
		 @Test	
			public	void AccuracyvalueinDegreeSin() throws PowerException, FactorialException
			{
				assertNotEquals(Math.sin(Math.toRadians(30)), TrigonometricFunctions.sin(0.49999999999999994), decimalpoints);
			}
			
			@Test
			public	void AccuracyvalueinDegreeCos() throws PowerException, FactorialException
			{
				assertNotEquals(Math.cos(Math.toRadians(90)), TrigonometricFunctions.cos(1.0), decimalpoints);
			}
			
			@Test
			public	void AccuracyvalueinDegreeTan() throws PowerException, FactorialException
			{
				assertNotEquals(Math.tan(Math.toRadians(20)), TrigonometricFunctions.tan(0.36397023426620234), decimalpoints);
			}
			


	}


