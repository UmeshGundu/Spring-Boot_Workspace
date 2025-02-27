package in.ashokit.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService throws Exception{
	
	public void storeBookData() throws Exception {
		File File = new File("book.txt");
		FileReader fr = new FileReader(File);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();


}
