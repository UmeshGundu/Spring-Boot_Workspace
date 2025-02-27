package in.ashokit.pdf;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import in.ashokit.dto.BookDTO;

public class PdfGenerator {

	public void pdfGenerator(List<BookDTO> books) throws Exception {
		Document doc = new Document();
		File file = new File("Books_tbl.pdf");
		PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(file));

		doc.open();
		PdfPTable table = new PdfPTable(3);

		table.addCell("Book_id");
		table.addCell("Book_Name");
		table.addCell("Book_Price");

		for (BookDTO book : books) {
			table.addCell(String.valueOf(book.getBId()));
			table.addCell(book.getBName());
			table.addCell(String.valueOf(book.getBPrice()));
		}
		doc.add(table);
		doc.close();
		writer.close();
		System.out.println("*****Books are inserted in PDF*****");
	}

}
