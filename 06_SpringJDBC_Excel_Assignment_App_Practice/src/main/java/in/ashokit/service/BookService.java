package in.ashokit.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import in.ashokit.dao.BookDao;
import in.ashokit.dto.BookDTO;
import in.ashokit.excel.ExcelGenerator;
import in.ashokit.pdf.PdfGenerator;

public class BookService {

	private BookDao bookDao;
	private ExcelGenerator excelGen;
	private PdfGenerator pdfGen;

	public BookService(BookDao bookDao, ExcelGenerator excelGen, PdfGenerator pdfGen) {
		this.bookDao = bookDao;
		this.excelGen = excelGen;
		this.pdfGen = pdfGen;
	}

	public void BookData() throws Exception {

		File file = new File("books_tbl.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();

		while (line != null) {
			String[] data = line.split(",");
			int bId = Integer.parseInt(data[0]);
			String bName = data[1];
			double bPrice = Double.parseDouble(data[2]);

			bookDao.saveBooks(bId, bName, bPrice);
			line = br.readLine();
		}
		br.close();
		System.out.println("******Books are Inserted in DB******");
	}

	public void getBooksData() throws Exception {
		
		List<BookDTO> books = bookDao.getBooks();
		books.forEach(bok -> {
			System.out.println(bok);
		});
		System.out.println("*****Books are displayed*****");
		System.out.println();

		excelGen.generatorExcel(books);
		System.out.println("*****Excel file generated*****");
		System.out.println();

		pdfGen.pdfGenerator(books);
		System.out.println("*****Pdf file generated*****");
	}
}
