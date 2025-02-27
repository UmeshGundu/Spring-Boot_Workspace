package in.ashokit.beans;

public class Restaurant {
	
	private IPayment iPayment;

	public Restaurant() {
		System.out.println("Restaurant::constructor");
	}
	
	public void setIPayment(IPayment iPayment) {
		this.iPayment=iPayment;
		System.out.println("iPayment::is set");
	}
	
	public void bill() {
		int receipt = iPayment.pay();	
		System.out.println("receipt:: "+receipt);
	}

}
