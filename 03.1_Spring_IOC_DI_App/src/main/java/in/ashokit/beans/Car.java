package in.ashokit.beans;

public class Car {

	private IEngine eng;

	public Car() {
		System.out.println("Car::0-param constructor");
	}

	public Car(IEngine eng) {
		System.out.println("Car::param constructor");
		this.eng = eng;
	}

	
	public void drive() {
		int status = eng.start();

		if (status >= 1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine failure");
		}

	}
}
