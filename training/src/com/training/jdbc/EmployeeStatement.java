package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class EmployeeStatement {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			// 1. Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Obtain connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			System.out.println(connection);

			// 3. Create statement
			statement = connection.createStatement();

			// Use case 1 - New Employee
			// 4. Create sql query
			String sql = "insert into employee_info values(400,'raji')";
			// 5. Execute query
			statement.execute(sql);

			// Use case 2 - View All Employees
			// 4. Create sql query
			String sql1 = "select * from employee_info";
			// 5. Execute query
			ResultSet resultSet = statement.executeQuery(sql1);
			// 6. Iterate the result
			Set<Employee> empSet = new HashSet<>();
			ResultSetMetaData rsMetaData = resultSet.getMetaData();
			int columnCount = rsMetaData.getColumnCount();
			while (resultSet.next()) {
				Employee emp = new Employee();
				emp.setId(resultSet.getInt("id"));
				emp.setName(resultSet.getString(2));
				empSet.add(emp);
			}
			System.out.println(empSet);

			// Use case 3 - View An Employee Based on Id
			// 4. Create sql query
			String sql2 = "select * from employee_info where id=100";
			// 5. Execute query
			ResultSet resultSet1 = statement.executeQuery(sql2);
			// 6. Iterate the result
			while (resultSet1.next()) {
				Employee emp = new Employee();
				emp.setId(resultSet1.getInt("id"));
				emp.setName(resultSet1.getString(2));
				System.out.println(emp);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
