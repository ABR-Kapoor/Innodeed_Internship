package com.employee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageFile {

	public boolean createFile(String fName) {
		boolean hogaya = false;
		File myFile = new File("D:/InternshipJavaAdvanceJDBC/FileHandling/src/com/employee/" + fName + ".txt");

		try {
			myFile.createNewFile();
			hogaya = true;
		} catch (IOException e) {
			System.out.println("Some problem occurred while creating the file!!");
		}

		return hogaya;
	}

	public boolean writeFile(String fName, String txt) {
		boolean hogaya = false;

		try {
			FileWriter myFileWriter = new FileWriter("D:/InternshipJavaAdvanceJDBC/FileHandling/src/com/employee/" + fName + ".txt");
			myFileWriter.write(txt);
			hogaya = true;
			myFileWriter.close();

		} catch (IOException e) {
			System.out.println("Some problem occurred while writing to the file!!");
		}

		return hogaya;
	}

//	public boolean deletefile(String fName) {
//		boolean hogaya = false;
//
//		try {
//			File myFile = new File(fName+ ".txt");
//			if (myFile.delete()) {
//				hogaya=true;
//				System.out.println("Successfully deleted: "+ myFile.getName());
//			}
//			else {
//				System.out.println("umm nahi ho raha bhai!! ");
//			}
//
//		} catch (Exception e) {
//			System.out.println("Some problem occurred while writing to the file!! "+e);
//		}
//
//		return hogaya;
//	}
	
	public boolean deleteFile(String fName) {
	    boolean hogaya = false;

	    try {
	        File myFile = new File("D:/InternshipJavaAdvanceJDBC/FileHandling/src/com/employee/" + fName + ".txt");
	        if (myFile.delete()) {
	            hogaya = true;
	            System.out.println("Successfully deleted: " + myFile.getName());
	        } else {
	            System.out.println("Unable to delete the file.");
	        }

	    } catch (Exception e) {
	        System.out.println("Some problem occurred while deleting the file!! " + e);
	    }

	    return hogaya;
	}

	public boolean readfile(String fName){
	    boolean hogaya = false;

	    try {
	        File myFile = new File("D:/InternshipJavaAdvanceJDBC/FileHandling/src/com/employee/" + fName + ".txt");
	        
	        Scanner sc= new Scanner(myFile);
	        while (sc.hasNextLine()) {
				String txts = (String) sc.nextLine();
				System.out.println(txts);
				
			}

	    } catch (Exception e) {
	        System.out.println("Some problem occurred while deleting the file!! " + e);
	    }

	    return hogaya;
	}


}