package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.enitity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {
	

}
