package in.ashokit.beans;

public class Car {

    private Engine eng;

	public Car() {
		System.out.println("Car::constructor");
	}

	public void setEngine(Engine eng) {
		this.eng = eng;
	}

	public void drive() {
		
		if(eng == null) {
			System.out.println("Engine is not enjected");
		}
		int status = eng.start();
		
		if (status >= 1) {
			System.out.println("Journey Started");
		}
		else {
			System.out.println("Engine Failure");
		}
		System.out.println("Car::driving");
	}
}
