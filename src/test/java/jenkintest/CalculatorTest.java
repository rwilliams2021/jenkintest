package jenkintest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jenkintest.Calculator;

public class CalculatorTest {

	private Calculator c = new Calculator();
	
	@Test
	public void addTest() {
		assertEquals(c.add(10, 5), 15);
	}
	@Test
	public void mulTest() {
		assertEquals(c.mul(10, 5), 50);
	}
}
