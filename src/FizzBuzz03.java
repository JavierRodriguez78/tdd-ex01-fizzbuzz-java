
public class FizzBuzz03 {

	private FizzBuzzRule02[] rules;
	
	public void setFizzBuzzRules( FizzBuzzRule02[] rules ) {
		this.rules = rules;
	}

	public String say(int i) {
		String result = "";

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
