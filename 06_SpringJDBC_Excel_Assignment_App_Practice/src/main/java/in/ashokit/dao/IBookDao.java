package in.ashokit.dao;

import java.util.List;

import in.ashokit.dto.BookDTO;

public interface IBookDao {
	public void saveBooks(Integer bId, String bName, double bPrice);
	public List<BookDTO> getBooks();

}
