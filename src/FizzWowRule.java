
public class FizzWowRule implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 21 == 0;
	}

	@Override
	public String say() {
		return "FizzWow";
	}

}
