package csvTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public class csvTest {
	 private static final String ADDRESS_FILE = "v_producto_real_updated.csv";
	 public static void main(String[]args) throws IOException {
		 CSVReader reader = new CSVReader(new FileReader(ADDRESS_FILE), ';');
		 String[] nextLine;
		 int x = 0;
		 while((nextLine = reader.readNext())!=null && x<2) {
			 System.out.println(nextLine[0]+" "+nextLine[1]);
			 x++;
		 }
	 }

}

