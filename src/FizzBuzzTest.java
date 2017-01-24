import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		FizzBuzz fb = new FizzBuzz();	// Arrange
		assertEquals("1", fb.say(1));	// Act and Assert
	}

}
