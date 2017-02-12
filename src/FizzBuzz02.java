
public class FizzBuzz02 {

	public String say(int i) {
		String result = "";
		FizzRule02 fizz = new FizzRule02();
		BuzzRule02 buzz = new BuzzRule02();
		
		if (fizz.isValid(i)) result += fizz.say();
		if (buzz.isValid(i)) result += buzz.say();
		if (result.isEmpty()) {
			return String.valueOf(i);
		} else {
			return result; 
		}
	}

}
