package demo4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void resetTest() {
		Calculator cal = new Calculator();
		assertTrue(cal.getResult() == 0);
	}
	@Test
	void addTest() {
		Calculator cal = new Calculator();
		cal.add(1);
		assertEquals(1, cal.getResult());
	}
	
	@Test
	void subtractTest() {
		Calculator cal = new Calculator();
		cal.subtract(2);
	}
	
	@Test
	void multiplyTest() {
		Calculator cal = new Calculator();
		cal.multiply(3);
	}
	
	@Test
	void exponentTest() {
		Calculator cal = new Calculator();
		cal.exponent(2);
	}


}
