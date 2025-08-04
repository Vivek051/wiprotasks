package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_test {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/wiprodb";
		String user = "root";
		String pass = "2001";
		try {
			Connection con = DriverManager.getConnection(url, user,pass);
			System.err.println("Connected to db");
			String sql = "insert into seleniumstudent(id,name,age)values(?,?,?)";
			PreparedStatement psmt = con.prepareStatement(sql);
//			psmt.setInt(1, 101);
//			psmt.setString(2, "Vivek");
//			psmt.setInt(3, 24);
//			int rows =psmt.executeUpdate();

			String  readsql = "select * from seleniumstudent";
			ResultSet rs = psmt.executeQuery(readsql);
			while(rs.next())
			{
				System.out.println("id:"+rs.getInt("id"));
				System.out.println("name:"+rs.getString("name"));
				System.out.println("id:"+rs.getInt("age"));
			}


//			String updatesql = "update seleniumstudent set age=? where id=?";
//			psmt.setInt(1, 111);
//			psmt.setString(2, "Viv");
//			psmt.setInt(3, 23);
//
//			int rows = psmt.executeUpdate();
	} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}

