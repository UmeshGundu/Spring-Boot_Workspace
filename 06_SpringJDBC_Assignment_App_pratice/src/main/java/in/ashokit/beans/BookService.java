package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService {

	private IBookDao bookDao;

	public BookService(IBookDao bookDao) {
		this.bookDao = bookDao;
	}

	public void displayData() throws Exception {
		File file = new File("books.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			String[] data = line.split(",");
			int bid = Integer.parseInt(data[0]);
			String bname = data[1];
			double bprice = Double.parseDouble(data[2]);

			bookDao.saveBooks(bid, bname, bprice);

			line = br.readLine();
		}
		System.out.println("*****Books are inserted in DB*****");
	}
	
	public void getBook() {
		
	}

}
