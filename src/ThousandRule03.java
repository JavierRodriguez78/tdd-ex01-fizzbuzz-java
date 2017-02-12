
public class ThousandRule03 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 21 == 0;
	}

	@Override
	public String say() {
		return "Thousand";
	}

}
