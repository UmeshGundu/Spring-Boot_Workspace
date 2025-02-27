package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.User;
import jakarta.transaction.Transactional;

public interface UserRepo extends CrudRepository<User, Integer> {

	public List<User> findByCountry(String country);

	public List<User> findByCountryAndGender(String country, String gender);

	public List<User> findBySalaryGreaterThanEqual(double salary);

	@Query("From User")
	public List<User> getAllUsersHQL();

	@Query(value = "Select * from user_tbl", nativeQuery = true)
	public List<User> getAllUsersSQL();

	@Modifying
	@Transactional
	@Query("UPDATE User u set u.salary = :salary WHERE u.id = :id")
	public int updateSalaryByIdHQL(Integer id, double salary);

	@Modifying
	@Transactional
	@Query(value = "update user_tbl set salary =:salary where  user_id=:id", nativeQuery = true)
	public int updateSalaryByIdSQL(@Param("id") int id, @Param("salary") double salary);

}
