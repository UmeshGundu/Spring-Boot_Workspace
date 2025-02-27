package in.ashokit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Passport_Table")
public class PassPort {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passPortId;
	private String passPortNum;
	private LocalDate issuedAt;
	private LocalDate expiredAt;

	@OneToOne
	@JoinColumn(name = "Person_Id")
	private Person person;

}
