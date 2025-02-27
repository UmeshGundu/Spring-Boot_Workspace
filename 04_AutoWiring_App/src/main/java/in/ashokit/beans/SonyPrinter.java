package in.ashokit.beans;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("Sony::constructor");
	}

	@Override
	public String receipt() {
		return "Sony Printer Receipt";
	}

}
