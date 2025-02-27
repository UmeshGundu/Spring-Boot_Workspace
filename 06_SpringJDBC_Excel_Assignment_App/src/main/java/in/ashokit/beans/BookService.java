package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import in.ashokit.dto.BookDTO;
import in.ashokit.excel.ExcelGenerator;
import in.ashokit.pdf.PdfGenerator;

public class BookService {

	private BookDaoImpl bookDao;
	private ExcelGenerator excelGen;
	private PdfGenerator pdfGen;

	public BookService(BookDaoImpl bookDao, ExcelGenerator excelGen, PdfGenerator pdfGen) {
		this.bookDao = bookDao;
		this.excelGen = excelGen;
		this.pdfGen = pdfGen;
	}

	public void getBooks() throws Exception {
		List<BookDTO> books = bookDao.getBooks();

		books.forEach(bok -> {
			System.out.println(bok);
		});
		System.out.println("*****Books are displayed*****");
		System.out.println();

		excelGen.generateExcel(books);
		System.out.println("*****Books are copied to Excel file*****");
		System.out.println();

		pdfGen.generatePdf(books);
		System.out.println("****Books are copied to Pdf file*****");
		System.out.println();
	}

	public void storeBookData() throws Exception {
		File File = new File("book.txt");
		FileReader fr = new FileReader(File);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			String[] data = line.split(",");
			int bid = Integer.parseInt(data[0]);
			String bname = data[1];
			Double price = Double.parseDouble(data[2]);

			bookDao.saveBook(bid, bname, price);

			line = br.readLine();
		}
		System.out.println("****Books are inserted in DB Table****");
		System.out.println();
		br.close();
	}
}
