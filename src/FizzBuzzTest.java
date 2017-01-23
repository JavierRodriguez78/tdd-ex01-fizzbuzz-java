import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		FizzBuzz fb = new FizzBuzz();	// Arrange
		String actual = fb.say(1);		// Act
		assertEquals("1", actual);		// Assert
	}

}
