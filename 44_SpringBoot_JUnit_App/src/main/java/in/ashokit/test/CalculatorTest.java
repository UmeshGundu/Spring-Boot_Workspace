package in.ashokit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import in.ashokit.beans.Calculator;

@SpringBootTest
public class CalculatorTest {

	@Test
	public void testAdd() {

		Calculator c = new Calculator();
		int actualResult = c.add(10, 20);
		int expectedResult = 30;

		assertEquals(actualResult, expectedResult);
	}

}
