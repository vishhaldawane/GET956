import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class SelectTest2 {
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
					conn.prepareStatement("select * from emp where job=?"); 
			System.out.println("Prepared Statement created : "+preparedStatement);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter job to search : ");
			String v_job = scan.nextLine();
			preparedStatement.setString(1, v_job); //fill up the first question mark
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println("Emp number  : " + resultSet.getInt(1) );
				System.out.println("Emp name    : " + resultSet.getString(2) );
				System.out.println("Emp Job     : " + resultSet.getString(3) );
				System.out.println("Emp Manager : " + resultSet.getString(4) );
				System.out.println("Emp Joining : " + resultSet.getString(5) );
				System.out.println("Emp Salary  : " + resultSet.getInt(6) );
				System.out.println("Emp Comm    : " + resultSet.getInt(7) );
				System.out.println("Emp Dept    : " + resultSet.getInt(8) );
				System.out.println("-----------------------");
			}
			System.out.println("=============================================");
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter starting date : ");
			String fromDate = scan2.nextLine();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter ending date   : ");
			String toDate = scan3.nextLine();
			
			//ResultSet dateRs = statement.executeQuery("select * from emp where hiredate between '01-Jan-81' and '31-Dec-81'");
			//ResultSet dateRs = statement.executeQuery("select * from emp where hiredate between "+"'"+fromDate+"'"+" and "+"'"+toDate+"'");
			PreparedStatement preparedStatement2 = conn.prepareStatement("select * from emp where hiredate between ? and ?");
			preparedStatement2.setString(1, fromDate);
			preparedStatement2.setString(2, toDate);
			ResultSet dateRs = preparedStatement2.executeQuery();
			
			while(dateRs.next()) {
				System.out.println("Emp number  : " + dateRs.getInt(1) );
				System.out.println("Emp name    : " + dateRs.getString(2) );
				System.out.println("Emp Job     : " + dateRs.getString(3) );
				System.out.println("Emp Manager : " + dateRs.getString(4) );
				System.out.println("Emp Joining : " + dateRs.getString(5) );
				System.out.println("Emp Salary  : " + dateRs.getInt(6) );
				System.out.println("Emp Comm    : " + dateRs.getInt(7) );
				System.out.println("Emp Dept    : " + dateRs.getInt(8) );
				System.out.println("-----------------------");
			}
			
			
			resultSet.close();
			dateRs.close();
			preparedStatement.close();
			preparedStatement2.close();
			conn.close();
			System.out.println("DB resources are closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}