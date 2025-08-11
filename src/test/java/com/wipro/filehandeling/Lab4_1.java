package com.wipro.filehandeling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab4_1 {
	public static void main(String[] args) {

		try {
			File myobj = new File("myfile.txt");
			if(myobj.createNewFile()) {
				System.out.println("File is created..." + myobj.getName());
			} else {
				System.out.println("File is already exist..");
			}


			FileReader fr = new FileReader(myobj);
			BufferedReader br = new BufferedReader(fr);
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				content.append(line).append("\n");
			}
			br.close();

			content.reverse();


			FileWriter fw = new FileWriter(myobj);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content.toString());
			bw.close();

			System.out.println("File content reversed successfully.");
		} catch (Exception e) {
			System.out.println("An error occurs");
			e.printStackTrace();
		}

	}
}

