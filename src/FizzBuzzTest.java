import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void should_return_number_when_not_multiple_of_any() {
		FizzBuzz fb = getNewFizzBuzz();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz fb = getNewFizzBuzz();
		assertEquals("Fizz", fb.say(3));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz fb = getNewFizzBuzz();
		assertEquals("Buzz", fb.say(5));
	}

	private FizzBuzz getNewFizzBuzz() {
		return new FizzBuzz();
	}

}
