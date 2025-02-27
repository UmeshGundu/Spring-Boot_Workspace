package in.ashokit.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.Product;

@RestController
public class ProductRestController {

	@PutMapping(value = "/product", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> updateProduct(@RequestBody Product p) {
		System.out.println(p);
		// logic to update the product
		String msg = "Product updated";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@DeleteMapping(value = "/product/{pid}", produces = "text/plain")
	public ResponseEntity<String> deleteProduct(Integer pid) {
		// logic to delete
		return new ResponseEntity<>("Product is Deleted", HttpStatus.OK);
	}

	@PostMapping(value = "/product", consumes = "application/json", produces = "text/plain")
	public ResponseEntity<String> addProduct(@RequestBody Product p) {
		System.out.println(p);
		// logic to save product
		String msg = "Product saved";
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}

	@GetMapping(value = "/product/{pid}", produces = "application/json")
	public ResponseEntity<Product> getProduct(@PathVariable Integer pid) { // internally springboot uses
																			// HttpMsgConverters concept to convert
		// object to json .
		Product p = new Product(1, "Mouse", 1200.0);
		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}

	@GetMapping(value = "/products", produces = "application/json")
	public ResponseEntity<List<Product>> getProducts() {

		Product p1 = new Product(1, "Mouse", 2200.0);
		Product p2 = new Product(2, "KeyBoard", 3200.0);
		Product p3 = new Product(3, "CPU", 5200.0);

		List<Product> pList = Arrays.asList(p1, p2, p3);
		return new ResponseEntity<List<Product>>(pList, HttpStatus.OK);
	}

}
