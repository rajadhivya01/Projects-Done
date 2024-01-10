package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeCreate {


	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost/employee";
			String user="root";
			String password="Dhivya@123...";
			Connection connection=DriverManager.getConnection(url,user,password);
			Statement statement=connection.createStatement();
			String createTableQuery = "CREATE TABLE IF NOT EXISTS Employee ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "name VARCHAR(255) NOT NULL,"
                    + "email VARCHAR(255) NOT NULL,"
                    + "dep_name VARCHAR(255) NOT NULL,"
                    + "dep_id INT NOT NULL"
                    + ")";
            statement.executeUpdate(createTableQuery);

			String selectQuery="SELECT * FROM EMPLOYEE";
			ResultSet resultset=statement.executeQuery(selectQuery);
			
			
			while(resultset.next()) {
				int id=resultset.getInt("id");
				String name=resultset.getString("name");
				String email=resultset.getString("email");
				String depName=resultset.getString("dep_name");
				int depId=resultset.getInt("dep_id");
				System.out.println("ID: "+id+", Name: "+name+", Email: "+email+", Department: "+depName+", DepartmentNo: "+depId);
			}
			resultset.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
