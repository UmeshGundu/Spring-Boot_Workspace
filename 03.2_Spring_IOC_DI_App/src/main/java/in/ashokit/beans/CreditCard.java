package in.ashokit.beans;

public class CreditCard implements IPayment {

	public CreditCard() {
		System.out.println("Phonepe::constructor");
	}

	@Override
	public int pay() {
		return 0;
	}

}
