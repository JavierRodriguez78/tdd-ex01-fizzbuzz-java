
public class TFSRule03 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 105 == 0;
	}

	@Override
	public String say() {
		return "TFS";
	}

}
