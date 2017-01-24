import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));
		assertEquals("Fizz", fb.say(3));
	}

}
