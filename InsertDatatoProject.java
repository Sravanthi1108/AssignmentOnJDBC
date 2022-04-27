import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertDatatoProject
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//loading driver
		try {
			//forName method creates an object and loads to the memory
		Class.forName("com.mysql.cj.jdbc.Driver");//loading driver to the memory
		
		//establish connection to the database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample?characterEncoding=utf8","root","Ammu@1108");
		
		//creating statement object to execute the database queries
		Statement statement=connection.createStatement();
		int result=statement.executeUpdate("insert into project values(2,'Android mbl app','python')");
		if(result==1)
		{
			System.out.println("inserted successfully");	
			}
		}
		//resultSet.absolute(3);
		
	   //ResultSet resultSet = null;
		
		//executequery executes the database query and we are storing the result into the 
		//Resultset object
		//ResultSet resultSet=statement.executeQuery("select *from project");
		//resultSet.absolute(3);
		
      /* while(resultSet.next())
       {
		System.out.println("Id--->"+resultSet.getInt("p_id"));
		System.out.println("Name--->"+resultSet.getString("p_name"));
		System.out.println("marks--->"+resultSet.getString("p_technology"));
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



