import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
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
public class FunctionTest {
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
					conn.prepareCall("{ ? = call CALC_SAL(?) }");
			
			System.out.println("Prepared Statement created : "+callableStatement);
			
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("Enter employee number  : ");
			int employeeNumber= scan1.nextInt();
			
			callableStatement.setInt(2, employeeNumber);
			callableStatement.registerOutParameter(1, Types.INTEGER); //return value is integer
			
			callableStatement.execute(); //run the procedure from oracle
			int salary = callableStatement.getInt(1);
			System.out.println("Total salary : "+salary);
			
			callableStatement.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}