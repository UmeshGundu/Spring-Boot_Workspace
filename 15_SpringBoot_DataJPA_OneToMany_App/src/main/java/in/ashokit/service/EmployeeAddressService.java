package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmployeeAddressService {

	@Autowired
	private AddressRepo addrRepo;

	@Autowired
	private EmployeeRepo empRepo;

	public void saveData() {
		Employee e = new Employee();
		e.setName("King");
		e.setSalary(4000.0);

		Address a1 = new Address();
		a1.setCity("hyd");
		a1.setState("TG");
		a1.setType("Present");

		Address a2 = new Address();
		a2.setCity("banglore");
		a2.setState("KA");
		a2.setType("Permanent");

		// set addresses to emp
		List<Address> addrList = Arrays.asList(a1, a2);
		e.setAddr(addrList);

		// set emp to addr
		a1.setEmp(e);
		a2.setEmp(e);

		empRepo.save(e);
	}

	public void deleteEmp() {
		empRepo.deleteById(2);
	}

	public void getAddr() {
		Optional<Address> byId = addrRepo.findById(1);
		System.out.println(byId);
	}

}
