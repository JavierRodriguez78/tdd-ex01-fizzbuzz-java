
public class BuzzWowRule03 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 35 == 0;
	}

	@Override
	public String say() {
		return "BuzzWow";
	}

}
