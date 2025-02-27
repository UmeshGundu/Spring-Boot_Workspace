package in.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "OrderDtls_tbl")
public class OrderDetailsEntity {

	@Id
    @GenericGenerator(name="order_id_gen" strategy="in.ashoki.generator.OrderIdGenerator")
	@GeneratedValue(name="order_id_gen")
	private String id;

	@Column(name = "ORDER_BY")
	private String orderBy;

	@Column(name = "ORDER_PLACED_DATE")
	@CreationTimestamp
	private Date orderDate;

}
