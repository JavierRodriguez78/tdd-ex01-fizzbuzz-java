
public class FizzBuzz {

	public String say(int i) {
		if (i % 5 == 0) return "Buzz";
		if (i % 3 == 0) return "Fizz";
		return String.valueOf(i);
	}

}
