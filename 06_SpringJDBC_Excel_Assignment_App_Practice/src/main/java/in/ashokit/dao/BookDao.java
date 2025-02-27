package in.ashokit.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dto.BookDTO;
import in.ashokit.mapper.BookRowMapperImpl;

public class BookDao implements IBookDao {

	private JdbcTemplate jdbcTemplate;

	public BookDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void saveBooks(Integer bId, String bName, double bPrice) {

		String sql = "insert into books_tbl values(?,?,?)";
		jdbcTemplate.update(sql, ps -> {
			ps.setInt(1, bId);
			ps.setString(2, bName);
			ps.setDouble(3, bPrice);
		});
	}

	@Override
	public List<BookDTO> getBooks() {

		String sql = "select * from books_tbl";
		List books = jdbcTemplate.query(sql, new BookRowMapperImpl());
		return books;

	}

}
