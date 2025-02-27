package in.ashokit.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import in.ashokit.dto.BookDTO;

public class PdfGenerator {
	
	public void generatePdf(List<BookDTO> books) throws Exception {
		Document doc = new Document();
		File file = new File("Books_pdf.pdf");
		PdfWriter writer = PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream(file));
		System.out.println("PDF is being created...");
		System.out.println();

		doc.open();
		PdfPTable table = new PdfPTable(3);

		table.addCell("Id");
		table.addCell("Book Name");
		table.addCell("Book Price");

		for (BookDTO book : books) {
			table.addCell(String.valueOf(book.getBookId()));
			table.addCell(book.getBookName());
			table.addCell(String.valueOf(book.getBookPrice()));
		}

		doc.add(table);
		doc.close();
		writer.close();
		System.out.println("PDF file has been created successfully.");
		System.out.println();
	}
}