
public class FizzBuzz {

	public String say(int i) {
		String result = "";
		if (isMultipleOfThree(i)) result += "Fizz";
		if (isMultipleofFive(i)) result += "Buzz";
		if (result.isEmpty()) {
			return String.valueOf(i);
		} else {
			return result; 
		}
	}

	private boolean isMultipleofFive(int i) {
		return i % 5 == 0;
	}

	private boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}

}
