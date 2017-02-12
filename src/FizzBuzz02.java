
public class FizzBuzz02 {

	public String say(int i) {
		String result = "";
		FizzRule02 fizz = new FizzRule02();
		BuzzRule02 buzz = new BuzzRule02();
		
		if (fizz.isValid(i)) result += "Fizz";
		if (buzz.isValid(i)) result += "Buzz";
		if (result.isEmpty()) {
			return String.valueOf(i);
		} else {
			return result; 
		}
	}

}
