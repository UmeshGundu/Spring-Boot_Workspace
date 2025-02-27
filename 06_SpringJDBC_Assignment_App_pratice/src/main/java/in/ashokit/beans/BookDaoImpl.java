package in.ashokit.beans;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDaoImpl implements IBookDao {

	private JdbcTemplate jdbcTemplate;

	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBooks(Integer bid, String bname, double price) {

		String sql = "INSERT INTO books values(?,?,?)";
		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bid);
			ps.setString(2, bname);
			ps.setDouble(3, price);
		});

	}


}
