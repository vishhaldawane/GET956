import java.sql.CallableStatement;
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
public class ProcedureTest {
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
			
			CallableStatement callableStatement= 
					conn.prepareCall("{ call FundTransfer(?,?,?) }");
			
			System.out.println("Prepared Statement created : "+callableStatement);
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
				
			
			System.out.println("Enter source account  : ");
			int sourceAccountNumber= scan1.nextInt();
			
			System.out.println("Enter target account  : ");
			int targetAccountNumber= scan2.nextInt();
			
			System.out.println("Enter transfer amount : ");
			int transferAmount= scan3.nextInt();
			
			callableStatement.setInt(1, sourceAccountNumber);
			callableStatement.setInt(2, targetAccountNumber);
			callableStatement.setInt(3, transferAmount);
			
			callableStatement.execute(); //run the procedure from oracle
			
			callableStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}