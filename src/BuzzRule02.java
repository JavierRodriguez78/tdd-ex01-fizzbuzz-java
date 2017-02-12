
public class BuzzRule02 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 5 == 0;
	}

	@Override
	public String say() {
		return "Buzz";
	}

}
