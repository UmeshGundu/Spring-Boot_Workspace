package in.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Workers_tbl")
public class Worker {

	@Id
	@Column(name = "Worker_Id")
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String place;

}
