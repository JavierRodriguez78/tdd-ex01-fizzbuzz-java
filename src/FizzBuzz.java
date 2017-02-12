
public class FizzBuzz {

	public String say(int i) {
		if (isMultipleOfThree(i) && isMultipleofFive(i)) return "Fizz" + "Buzz";
		if (isMultipleofFive(i)) return "Buzz";
		if (isMultipleOfThree(i)) return "Fizz";
		return String.valueOf(i);
	}

	private boolean isMultipleofFive(int i) {
		return i % 5 == 0;
	}

	private boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}

}
