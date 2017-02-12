import java.util.ArrayList;

public class FizzBuzz02 {

	public String say(int i) {
		String result = "";
		FizzBuzzRule02[] rules = { new FizzRule02(),
								   new BuzzRule02() };
		for (FizzBuzzRule02 r : rules) {
			if (r.isValid(i)) result += r.say();
		}
		if (result.isEmpty()) {
			return String.valueOf(i);
		} else {
			return result; 
		}
	}

}
