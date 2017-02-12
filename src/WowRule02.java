
public class WowRule02 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 7 == 0;
	}

	@Override
	public String say() {
		return "Wow";
	}

}
