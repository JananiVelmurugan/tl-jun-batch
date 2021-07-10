package com.training.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
		Statement statement1 = null;
		Statement statement2 = null;
		ResultSet resultSet = null;
		ResultSet resultSet1 = null;

		try {

			// 1. Load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. Obtain connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "password");
			System.out.println(connection);
			connection.setAutoCommit(false);
			// 3. Create statement
			statement = connection.createStatement();

			// Use case 1 - New Employee
			// 4. Create sql query
			String sql = "insert into employee_info values(400,'raji')";
			// 5. Execute query
			statement.execute(sql);

			// Use case 2 - View All Employees
			// 3. Create statement
			statement1 = connection.createStatement();
			// 4. Create sql query
			String sql1 = "select * from employee_info";
			// 5. Execute query
			resultSet = statement1.executeQuery(sql1);
			// 6. Iterate the result
			Set<Employee> empSet = new HashSet<>();

			// Connection Metadata
			DatabaseMetaData dbMetaData = connection.getMetaData();
			System.out.println(dbMetaData.getDriverName());
			// ResultSet Metadata
			ResultSetMetaData rsMetaData = resultSet.getMetaData();
			int columnCount = rsMetaData.getColumnCount();
			String name = rsMetaData.getColumnName(1);
			System.out.println(columnCount);
			System.out.println(name);
			while (resultSet.next()) {
				Employee emp = new Employee();
				emp.setId(resultSet.getInt("id"));
				emp.setName(resultSet.getString(2));
				empSet.add(emp);
			}
			System.out.println(empSet);

			// Use case 3 - View An Employee Based on Id
			// 3. Create statement
			statement2 = connection.createStatement();
			// 4. Create sql query
			String sql2 = "select * from employee_info where id=100";
			// 5. Execute query
			resultSet1 = statement2.executeQuery(sql2);
			// 6. Iterate the result
			while (resultSet1.next()) {
				Employee emp = new Employee();
				emp.setId(resultSet1.getInt("id"));
				emp.setName(resultSet1.getString(2));
				System.out.println(emp);
			}

			// Batch Execution
			Statement stbatch = connection.createStatement();
			String sql4 = "insert into employee_info values(700,'raji')";
			String sql5 = "insert into employee_info values(900,'rai')";
			stbatch.addBatch(sql4);
			stbatch.addBatch(sql5);
			stbatch.executeBatch();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
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
