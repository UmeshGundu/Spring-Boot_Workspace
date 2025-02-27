package in.ashokit.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import in.ashokit.dto.BookDTO;

public class ExcelGenerator {

	public void generatorExcel(List<BookDTO> books) throws Exception {

		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Books_table");
		Row headerRow = sheet.createRow(0);

		headerRow.createCell(0).setCellValue("BookId");
		headerRow.createCell(1).setCellValue("BookName");
		headerRow.createCell(2).setCellValue("BookPrice");

		int rowIndexNo = 1;

		for (BookDTO b : books) {

			Row dataRow = sheet.createRow(rowIndexNo);

			dataRow.createCell(0).setCellValue(b.getBId());
			dataRow.createCell(1).setCellValue(b.getBName());
			dataRow.createCell(2).setCellValue(b.getBPrice());

			rowIndexNo++;
		}

		File file = new File("Books_tbl.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
		book.write(fos);

		fos.close();
		book.close();

	}

}
