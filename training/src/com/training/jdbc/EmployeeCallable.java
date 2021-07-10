package com.training.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class EmployeeCallable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			CallableStatement prepareCall = con.prepareCall("{call print_contact(?,?)}");
			prepareCall.setString(1, "C-001");
			prepareCall.registerOutParameter(2, Types.VARCHAR);
			prepareCall.execute();
			System.out.println(prepareCall.getString(2));
			prepareCall.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
