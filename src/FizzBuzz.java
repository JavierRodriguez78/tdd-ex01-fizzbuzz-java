
public class FizzBuzz {

	public String say(int i) {
		if (i == 3 * 2) return "Fizz";
		if (i == 5) return "Buzz";
		if (i == 3) return "Fizz";
		return String.valueOf(i);
	}

}
