package calculator.com;

import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorTest {

	Calculator c = new Calculator();
	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void TestAdd(){
		assertEquals(10, c.add(5, 5));
	}
	
	@Test
	public void TestSubstract(){
		assertEquals(  -2,c.substract(7, 9));
	}
	
	@Test
	public void TestDivide(){
		assertEquals(1, c.divide(5, 5));
	}
	
	@Test
	public void TestMultiply(){
		assertEquals(6, c.multiply(3, 2));
	}
	

}
