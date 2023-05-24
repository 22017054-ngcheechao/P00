import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 9999;
		assertEquals(expected,actual);
		}
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		int expected = 5555;
		assertEquals(expected,actual);
	}public void testmultiply() {
		int a = 12;
		int b = 23;
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 276;
		assertEquals(expected,actual);
	}public void testdivide() {
	    int a = 20;
	    int b = 4;
	    Calculator cal = new Calculator();
	    int actual = 0;
	    int expected = 0;
	    try {
	        actual = cal.divide(a, b);
	        expected = 5;
	    } catch (ArithmeticException e) {
	        // Denominator is 0, handle the error
	        // For example, set actual and expected to special values like -1 or NaN
	        actual = -1;
	        expected = -1;
	    }
	    assertEquals(expected, actual);
	}

}
