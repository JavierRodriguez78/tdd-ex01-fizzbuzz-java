
public class FizzRule02 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 3 == 0;
	}

	@Override
	public String say() {
		return "Fizz";
	}

}
