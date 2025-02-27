package in.ashokit.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine::Constructor");
	}
	
	@Override
	public int start() {
		System.out.println("dieselengine::started");
		return 1;
	}

}
