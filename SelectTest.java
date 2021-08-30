import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*  
 *  ODBC
 * 	JDBC API - Java's Database Connectivity 
 * 		
 * 						Driver <-- interface
 * 							|
 * 				-----------------------------			
 * 				|			|				|
 * 		Oracle's driver  MS-Sql's Driver	HSQLDB's driver
 * 
 * 			Database <------driver ------> Your Java Application
 
  
 1. load/register the driver  	
       DriverManager.registerDriver() 
       			org.hsqldb.jdbc.JDBCDriver()
 2. acquire the connection   
    Connection <-DriverManager.getConnection("dsn","username","password"); 
 jdbc:hsqldb:hsql://localhost/mydb", "SA","")
 */
public class SelectTest {
	public static void main(String[] args) {
		
	    //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:???",
		//"system", "manager");
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");

			System.out.println("Connected to the database "+conn);
			Statement statement= conn.createStatement();
			
			System.out.println("Statement created : "+statement);
			
			ResultSet rs = statement.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println("Emp number : " + rs.getInt(1) );
				System.out.println("Emp name   : " + rs.getString(2) );
				System.out.println("Emp salary : " + rs.getInt(3) );//in oracle's emp table 6th col
				System.out.println("-----------------------");
			}
			rs.close();
			statement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
