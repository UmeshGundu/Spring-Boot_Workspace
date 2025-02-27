package in.ashokit.beans;

public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine::constructor");
	}

	@Override
	public int start() {
		System.out.println("petrolengine::started");
		return 1;
	}
}
