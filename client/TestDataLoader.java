package client;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestDataLoader {
	// UserData
	public static List<pojo> loadTestData(String filePath) throws IOException, CsvValidationException {
		// UserData
		List<pojo> userList = new ArrayList<>();
		CSVReader reader = new CSVReader(new FileReader(filePath));

		// Skip the header row
		reader.readNext();

		// Read data from CSV
		String[] line;

		while ((line = reader.readNext()) != null) {
			String username = line[0];
			String password = line[1];
			pojo p = new pojo(username, password); // UserData
			p = new pojo(username, password);
			userList.add(p);
		}

		reader.close();
		return userList;
	}
}
