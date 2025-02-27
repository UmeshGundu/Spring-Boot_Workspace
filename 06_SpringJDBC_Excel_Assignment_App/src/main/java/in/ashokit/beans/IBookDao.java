package in.ashokit.beans;

import java.util.List;

import in.ashokit.dto.BookDTO;

public interface IBookDao {
	
	public void saveBook(Integer bId, String bname, double price);
	
	public List<BookDTO> getBooks();
}



