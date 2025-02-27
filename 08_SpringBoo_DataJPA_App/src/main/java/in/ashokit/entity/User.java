package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "User_Tbl")
public class User {
	@Id
	@Column(name = "User_Id")
	private Integer id;
	@Column(name = "User_Name", nullable = false)
	private String name;
	@Column(name = "Gender", nullable = false)
	private String gender;
	@Column(name = "Country", nullable = false)
	private String country;
	@Column(name = "Salary", nullable = false)
	private double salary;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdAt;

	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate lastUpdated;

}
