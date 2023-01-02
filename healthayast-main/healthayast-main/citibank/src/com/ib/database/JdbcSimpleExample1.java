package com.ib.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSimpleExample1 {

	public static void main(String[] args) {
		ResultSet rs = null;
		Statement stmt = null;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/www", "root", "password");		// here sonoo is database name, root is username and password
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from customer_details");
			
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3));
			
			
		} catch (ClassNotFoundException e) {
			// send mail
			System.out.println("no driver found...");
		} catch (SQLException e) {
			// send mail
			e.printStackTrace();
		} finally {
			try {

				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {

			}

		}

	}

}
