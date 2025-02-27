package in.ashokit.rest;

public class CourseNotFoundException extends RuntimeException {

	public CourseNotFoundException() {

	}

	public CourseNotFoundException(String msg) {
		super(msg);

	}
}
