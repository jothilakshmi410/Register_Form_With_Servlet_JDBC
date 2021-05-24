package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employeee;
public class EmployeeeDao {
	
	public  int registerEmployeee(Employeee employee) throws ClassNotFoundException{
		String INSERT_USERS_SQL ="INSERT INTO employeee" +
	" (id,first_name,last_name,username,password,address) VALUES " +
				"(?,?,?,?,?,?);";
		
		int result = 0;
		
		Class.forName("org.postgresql.Driver");
		
		try(Connection connection =DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres", "jothivel");
				
				
				//Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL))
		{
			preparedStatement.setInt(1,employee.getStrid());
			preparedStatement.setString(2, employee.getFirst_name());
			preparedStatement.setString(3, employee.getLast_name());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			
			System.out.println(preparedStatement);
			//Step 3:Execute the query and update the query
			result = preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			//process sql exception
			e.printStackTrace();
		}
		return result;
	}
}
