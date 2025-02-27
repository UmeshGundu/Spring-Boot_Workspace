package in.ashokit.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.PassPort;
import in.ashokit.entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonPassportService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private PassportRepo passportRepo;

	public void saveData() {

		Person p = new Person();
		p.setPersonName("King");
		p.setGender("Male");
		Person savedPerson = personRepo.save(p);

		PassPort pp = new PassPort();
		pp.setPassPortNum("SEF8FDF54SD4");
		pp.setIssuedAt(LocalDate.now());
		pp.setExpiredAt(LocalDate.now().plusYears(10));

		pp.setPerson(savedPerson);
		passportRepo.save(pp);
	}

	public void deletePerson() {
		personRepo.deleteById(1);
	}
	
	public void getPerson() {
		Optional<Person> byId = personRepo.findById(1);
		if(byId.isPresent()) {
			System.out.println(byId.get());
		}
	}

	public void deletePassport() {
		passportRepo.deleteById(2);
	}

}
