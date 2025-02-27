package in.ashokit.beans;

public class ATM {

	private IPrinter printer;

	public ATM() {
		System.out.println("ATM::0-param constructor");
	}
	

	public ATM(IPrinter printer) {
		this.printer = printer;
		System.out.println("ATM::param constructor");
	}


	public void setPrinter(IPrinter printer) {
		this.printer = printer;
		System.out.println("setPrinter() method called...");

	}

	public void withdraw() {
		String receipt = printer.receipt();
		System.out.println("withdraw successfull:: " + receipt);

	}

}
