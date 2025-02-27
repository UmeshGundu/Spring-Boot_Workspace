package in.ashokit.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Persons_tbl")
public class Person {

	@Id
	@Column(name = "Person_id")
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String country;

}
