package com.cg.eis.service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import com.cg.eis.bean.Employee;
public class Eservice {

    public static void writeEmployeesToFile(List<Employee> employees, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employees);
            System.out.println("Employees written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 public static void readEmployeesFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            @SuppressWarnings("unchecked")
			List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Reading Employees from file:");
            for (Employee e : employees) {
                System.out.println(e);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
