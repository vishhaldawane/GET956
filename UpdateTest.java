import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

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
public class UpdateTest {
	public static void main(String[] args) {
		
	    //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:???",
		//"system", "manager");
		
		try {
			//DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Driver registered....");
		
			//Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:OSE","scott", "tiger");
			System.out.println("Connected to the database "+conn);
			
			
			//below interface is the child of the Statement interface
			
			PreparedStatement preparedStatement= 
					conn.prepareStatement("update emp set job=?,sal=sal+? where empno=?");
			
			System.out.println("Prepared Statement created : "+preparedStatement);
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
				
			
			System.out.println("Enter NEW job    : ");
			String empJob = scan2.nextLine();
			
			System.out.println("Enter SALARY Upraisal amount : ");
			int salaryUpraisalAmount= scan3.nextInt();
			
			System.out.println("For Which employee number : ");
			int empno = scan1.nextInt();
			
	 
			preparedStatement.setString(1, empJob);
			preparedStatement.setInt(2, salaryUpraisalAmount);
			preparedStatement.setInt(3, empno );
						
			int rows = preparedStatement.executeUpdate();
			System.out.println(rows+" Rows updated ");
		
			preparedStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}