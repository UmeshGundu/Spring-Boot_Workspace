package in.ashokit.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.bindings.Customer;

public class App {

	public static void main(String[] args) throws Exception {
		App a = new App();
		// a.convertJavaToJson();
		a.convertJsonToJava();
	}

	public void convertJsonToJava() throws Exception {

		File f = new File("customer.json");

		// de-serialization
		ObjectMapper mapper = new ObjectMapper(); // it is a class in jackson api to perform serializtion and
													// de-serializtion, it provide methods to perform.
		Customer cobj = mapper.readValue(f, Customer.class);
		System.out.println(cobj);
	}

	public void convertJavaToJson() throws Exception {

		File f = new File("customer.json");
		Customer cobj = new Customer();
		cobj.setId(1);
		cobj.setName("Umesh");
		cobj.setPhno(985665l);

		// serialization
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(f, cobj); // instead of f if u give system.out then json data will be print on the
									// console.

		System.out.println("Operation completed..!");

	}

}
