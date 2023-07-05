package com.employeesData;

import java.io.FileWriter;
import java.io.IOException;

class ManageFile {

	public boolean writeFile(String user, String pass, String txt) {
		boolean hogaya = false;

		try {
			FileWriter myFileWriter = new FileWriter("D:/InternshipJavaAdvanceJDBC/FileHandling/src/com/employeesData/file.txt");
			BufferedWriter bw = new BufferedWriter(myFileWriter);
 
			bw.write("Username: " + user);
			bw.newLine();
			bw.write("Password: " + pass);
			bw.newLine();
			bw.write("Text: " + txt);

			bw.close();
			hogaya = true;

		} catch (IOException e) {
			System.out.println("Some problem occurred while writing to the file!!");
		}

		return hogaya;
	}
}