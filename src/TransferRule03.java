
public class TransferRule03 implements FizzBuzzRule02 {

	@Override
	public boolean isValid(int i) {
		return i % 15 == 0;
	}

	@Override
	public String say() {
		return "Transfer";
	}

}
