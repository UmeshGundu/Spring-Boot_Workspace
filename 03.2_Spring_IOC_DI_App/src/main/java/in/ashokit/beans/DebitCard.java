package in.ashokit.beans;

public class DebitCard implements IPayment {

	public DebitCard() {
		System.out.println("paytm::constructor");
	}

	@Override
	public int pay() {
		return 1;
	}
	
	

}
