package Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class EmployeeUpdate {


	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost/employee";
			String user="root";
			String password="Dhivya@123...";
			Connection connection=DriverManager.getConnection(url,user,password);
			Statement statement=connection.createStatement();
			String updateQuery1="UPDATE EMPLOYEE SET email='john.email123@gmail.com' WHERE id=1";
			statement.execute(updateQuery1);
			String updateQuery2="UPDATE EMPLOYEE SET dep_name='Development',dep_id=2001 WHERE id=2";
			statement.execute(updateQuery2);
			
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
