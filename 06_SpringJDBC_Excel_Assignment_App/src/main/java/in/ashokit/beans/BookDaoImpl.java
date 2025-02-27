package in.ashokit.beans;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dto.BookDTO;
import in.ashokit.mapper.BookRowMapper;

public class BookDaoImpl implements IBookDao {

	private JdbcTemplate jdbcTemplate;

	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBook(Integer bId, String bname, double price) {

		String sql = "insert into books values(?,?,?)";

		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bId);
			ps.setString(2, bname);
			ps.setDouble(3, price);

		});
	}

	@Override
	public List<BookDTO> getBooks() {

		String sql = "select * from books";

		List<BookDTO> books = jdbcTemplate.query(sql, new BookRowMapper());

		return books;
	}

}
