import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDatatoProject {
	public static void main(String[] args) 
	{
	
	try 
	{
		//forName method creates an object and loads to the memory
	Class.forName("com.mysql.cj.jdbc.Driver");//loading driver to the memory
	
	//establish connection to the database
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?characterEncoding=utf8","root","Ammu@1108");
	
	//creating statement object to execute the database queries
	Statement statement=connection.createStatement();
	
	//executequery executes the database query and we are storing the result into the 
	//Resultset object
	int result=statement.executeUpdate("Update project set p_name='online quiz' where p_id=1");
	if(result==1)
	{
		System.out.println("updated successfully");	
		}
	}
	//resultSet.absolute(3);
	
 /*  ResultSet resultSet = null;
while(resultSet.next())
   {
	System.out.println("Id--->"+resultSet.getInt("s_id"));
	System.out.println("Name--->"+resultSet.getString("s_name"));
	System.out.println("marks--->"+resultSet.getInt("s_marks"));
	System.out.println("sem--->"+resultSet.getInt("s_sem"));
	
	}
	}*/

    catch(ClassNotFoundException ex)
	{
		System.out.println("class not found"+ex.getMessage());
	}
    catch(SQLException e)
	{
		System.out.println(e.getMessage());
	}
	
	


}
	}









