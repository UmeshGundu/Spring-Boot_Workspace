package in.ashokit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	private UserRepo userRepo;

	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public void saveUser() {

		User u1 = new User();
		u1.setId(1);
		u1.setName("king");
		u1.setGender("Male");
		u1.setCountry("America");
		u1.setSalary(50000.0);
		userRepo.save(u1);

		User u2 = new User();
		u2.setId(2);
		u2.setName("Ram");
		u2.setGender("Male");
		u2.setCountry("India");
		u2.setSalary(60000.0);
		userRepo.save(u2);

	}

	public void deletAllUsers() {
		userRepo.deleteAll();
	}

	public void saveAllUsers() {

		User u1 = new User();
		u1.setId(1);
		u1.setName("king");
		u1.setGender("Male");
		u1.setCountry("America");
		u1.setSalary(50000.0);

		User u2 = new User();
		u2.setId(2);
		u2.setName("Ram");
		u2.setGender("Male");
		u2.setCountry("India");
		u2.setSalary(60000.0);

		User u3 = new User();
		u3.setId(3);
		u3.setName("Sita");
		u3.setGender("Female");
		u3.setCountry("India");
		u3.setSalary(70000.0);

		User u4 = new User();
		u4.setId(4);
		u4.setName("Miller");
		u4.setGender("Male");
		u4.setCountry("America");
		u4.setSalary(40000.0);

		List<User> usersList = Arrays.asList(u1, u2, u3, u4);
		userRepo.saveAll(usersList);
	}

	public void getAllUsers() {
		Iterable<User> all = userRepo.findAll();
		all.forEach(u -> {
			System.out.println(u);
		});
	}

	public void getUserById(Integer uId) {
		Optional<User> byId = userRepo.findById(uId);
		if (byId.isPresent()) {
			System.out.println("User record :: " + byId);
		} else {
			System.out.println("User record not found ");
		}
	}

	public void getCount() {
		long count = userRepo.count();
		System.out.println("Users count:: " + count);
	}

	// Using findBy methods
	public void getUsersByCountry(String country) {
		List<User> byCountry = userRepo.findByCountry(country);
		byCountry.forEach(System.out::println);
	}

	public void getUsersByCountryAndGender(String country, String gender) {
		List<User> byCountryAndGender = userRepo.findByCountryAndGender(country, gender);
		byCountryAndGender.forEach(u -> {
			System.out.println(u);
		});
	}

	public void getBySalary(double salary) {
		List<User> bySalaryGreaterThanEqual = userRepo.findBySalaryGreaterThanEqual(salary);
		bySalaryGreaterThanEqual.forEach(u -> {
			System.out.println(u);
		});
	}

	// Using Custom Queries using HQL
	public void getAllUsersHQL() {
		List<User> hql = userRepo.getAllUsersHQL();
		hql.forEach(System.out::println);
	}

	public void setSalaryHQL(int id, double salary) {
		userRepo.updateSalaryByIdHQL(id, salary);
	}

	// Using Custom Queries using SQL
	public void getAllUsersSQL() {
		List<User> sql = userRepo.getAllUsersSQL();
		sql.forEach(System.out::println);
	}

	public void setSalarySQL(int id, double salary) {
		userRepo.updateSalaryByIdSQL(id, salary);
	}

}
