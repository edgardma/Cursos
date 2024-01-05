package pe.com.dyd.arquitectura.patrones.strategy.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pe.com.dyd.arquitectura.patrones.strategy.util.MySQLDBAdapter;

public class SQLAuthStrategy implements IAuthStrategy {

	@Override
	public Principal authenticate(String userName, String password) {
		try {
			MySQLDBAdapter adapter = new MySQLDBAdapter();
			Connection connection = adapter.getConnection();
			
			String queryString = "SELECT userName, rol FROM users WHERE username = '%s' and password = '%s' ";
			String query = String.format(queryString, userName, password);
		
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery(query);
			
			if (results.next()) {
				return new Principal(results.getString("userName"), results.getString("rol"));
			} else {
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
}
