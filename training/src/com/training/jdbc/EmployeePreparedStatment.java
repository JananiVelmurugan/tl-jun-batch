package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class EmployeePreparedStatment {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		try {
			// 1. Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Obtain connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			System.out.println(connection);

			// Use case 1 - New Employee
			// 3. Create sql query
			String sql = "insert into employee_info values(?,?)";
			// 4. Create PreparedStatement
			PreparedStatement pstmt = connection.prepareStatement(sql);
			// 5. Pass Parameter Values
			pstmt.setInt(1, 1000);
			pstmt.setString(2, "Gaj");
			// 6. Execute the query
			int result = pstmt.executeUpdate();
			System.out.println(result);

			// Use case 2 - View All Employees
			// 3. Create Sql
			String sql1 = "select * from employee_info";
			// 4. Create PreparedStatement
			PreparedStatement pstmt1 = connection.prepareStatement(sql1);
			// 5. Execute query
			resultSet = pstmt1.executeQuery();
			// 6. Iterate the result
			Set<Employee> empSet = new HashSet<>();
			while (resultSet.next()) {
				Employee emp = new Employee();
				emp.setId(resultSet.getInt("id"));
				emp.setName(resultSet.getString(2));
				empSet.add(emp);
			}
			System.out.println(empSet);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 7. Close all the resources
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}