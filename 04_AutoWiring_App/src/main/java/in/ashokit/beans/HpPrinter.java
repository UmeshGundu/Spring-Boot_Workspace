package in.ashokit.beans;

public class HpPrinter implements IPrinter {

	public HpPrinter() {
		System.out.println("hp::constructor");
	}

	@Override
	public String receipt() {

		return "Hp Printer Receipt";
	}

}
