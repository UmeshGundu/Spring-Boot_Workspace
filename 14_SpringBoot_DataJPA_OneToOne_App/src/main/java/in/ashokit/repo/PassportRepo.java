package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.PassPort;

public interface PassportRepo extends JpaRepository<PassPort, Integer> {

}
