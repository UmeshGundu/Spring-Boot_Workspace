package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Contact;
import in.ashokit.entity.Person;
import in.ashokit.repo.ContactRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class TxService {

	@Autowired
	private PersonRepo personRepo;

	@Autowired
	private ContactRepo contactRepo;

	@Transactional(rollbackFor = Exception.class)
	public void savePersonWithContact() {

		Person p = new Person();
		p.setPName("Ram");
		p.setAge(24);
		p.setGender("Male");
		p.setCountry("India");
		personRepo.save(p);

		int i = 10 / 0;

		Contact c = new Contact();
		c.setName("Ram");
		c.setEmail("Ram@123");
		c.setPho(99879646L);
		contactRepo.save(c);
	}

}
