package in.ashokit.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.enitity.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	public void savePersons() {
		Person p1 = new Person(1, "Ram", 25, "Male", "India");
		Person p2 = new Person(2, "Sita", 23, "Female", "India");
		Person p3 = new Person(3, "Radha", 22, "Female", "India");
		Person p4 = new Person(4, "King", 24, "Male", "America");
		Person p5 = new Person(5, "Lisa", 25, "Female", "America");
		Person p6 = new Person(6, "Scott", 35, "Male", "Japan");
		Person p7 = new Person(7, "kathey", 75, "Male", "America");
		Person p8 = new Person(8, "Lakshmi", 55, "Female", "India");
		Person p9 = new Person(9, "John", 85, "Male", "America");
		Person p10 = new Person(10, "Krishna", 20, "Male", "India");

		List<Person> asList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		personRepo.saveAll(asList);
	}

	public void getPersonsSort() {

		Sort sort = Sort.by("age").ascending();

		List<Person> all = personRepo.findAll(sort);
		all.forEach(System.out::println);
	}

	public void getPersonPagination() {

		int pageSize = 3;
		int pageNo = 3;

		PageRequest of = PageRequest.of(pageNo - 1, pageSize);

		Page<Person> all = personRepo.findAll(of);
		all.forEach(System.out::println);
	}

	public void getPersonsQBE(String gender, String country) {

		Person p = new Person();
		if (gender != null) {
			p.setGender(gender);
		}
		if (country != null) {
			p.setCountry(country);
		}

		Example<Person> of = Example.of(p);

		List<Person> all = personRepo.findAll(of);
		all.forEach(System.out::println);

	}

}
