package com.wipro.filehandeling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Lab4_2 {
	public static void main(String[] args) {
		
			String myfile = "num.txt";


			try {
				File file = new File(myfile);
				if (!file.exists()) {
					FileWriter fw = new FileWriter(file);
					for (int i = 0; i <= 10; i++) {
						fw.write(i + (i < 10 ? "," : "")); 
					}
					fw.close();
					System.out.println("num.txt created successfully.");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}


			try {
				Scanner scanner = new Scanner(new File(myfile));
				scanner.useDelimiter(","); 
				System.out.println("Even numbers in file:");
				while (scanner.hasNext()) {
					int num = Integer.parseInt(scanner.next().trim());
					if (num % 2 == 0) {
						System.out.print(num + " ");
					}
				}
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

