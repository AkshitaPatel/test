package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App a = new App();
		a.a = 5;
		a.b=10;
		assertEquals(15, a.add());
		assertEquals(-5, a.substract());
		
	}

}
