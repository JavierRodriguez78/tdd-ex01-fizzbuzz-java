import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz02Test {

	@Test
	public void should_return_number_when_not_multiple_of_any() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
		assertEquals("Fizz", fb.say(9));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Buzz", fb.say(5));
		assertEquals("Buzz", fb.say(10));
	}
	
	@Test
	public void should_return_fizzbuzz_when_multiples_of_fifteen() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("FizzBuzz", fb.say(15));
		assertEquals("FizzBuzz", fb.say(30));
	}
	
	@Test
	public void should_return_wow_when_multiples_of_seven() {
		FizzBuzz02 fb = getNewFizzBuzz();
		assertEquals("Wow", fb.say(7));
	}

	private FizzBuzz02 getNewFizzBuzz() {
		return new FizzBuzz02();
	}

}
