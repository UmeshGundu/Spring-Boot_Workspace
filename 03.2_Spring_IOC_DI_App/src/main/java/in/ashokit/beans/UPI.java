package in.ashokit.beans;

public class UPI implements IPayment {

	public UPI() {
	}

	@Override
	public int pay() {
		int tax=10;
		int total=tax*3;
		return total;
	}
}
