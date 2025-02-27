package in.ashokit.beans;

public class Engine {

	public Engine() {
		System.out.println("Engine::constructor");
	}
	
	public int start() {
		System.out.println("Engine::started");
		return 1;
	}


}
