package test.muvi6.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVRead
{

	
	public static void main(String[] args) throws IOException {
		// open file input stream
		BufferedReader reader = new BufferedReader(new FileReader("../test.muvi6/test.csv"));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		
		List<DataGetFile> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			DataGetFile emp = new DataGetFile();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setId(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setRole(data);
				else if (index == 3)
					emp.setSalary(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		
		//close reader
		reader.close();
		
		System.out.println(empList);
		
	}
	
	
}
