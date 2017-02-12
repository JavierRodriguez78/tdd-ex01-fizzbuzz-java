
public class FizzBuzz03 {

	private FizzBuzzRule02[] rules;
	
	public void setFizzBuzzRules( FizzBuzzRule02[] rules ) {
		this.rules = rules;
	}

	public String say(int i) {
		for (FizzBuzzRule02 r : rules) {
			if (r.isValid(i)) return r.say();
		}
		return String.valueOf(i);
	}
	
}
