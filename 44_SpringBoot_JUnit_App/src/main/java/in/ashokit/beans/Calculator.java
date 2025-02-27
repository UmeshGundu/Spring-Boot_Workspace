package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

}
