import java.util.Scanner;

public class FinallyTest {
	public static void main(String[] args) {
		try
		{
			Scanner scan = new Scanner(System.in);
			int a=scan.nextInt();
			System.out.println("Open File....");
			System.out.println("Open Network.....");
			System.out.println("Open Database.....");
			
			System.out.println("some stuff1...with file");
			System.out.println("some stuff2...with file");
			if(a>10)
			throw new RuntimeException("Some problem..with files...");
			System.out.println("some stuff3...with file");
			
			System.out.println("\tsome stuff1...with n/w");
			System.out.println("\tsome stuff2...with n/w");
			System.out.println("\tsome stuff3...with n/w");
			
			System.out.println("\t\tsome stuff1...with d/b");
			System.out.println("\t\tsome stuff2...with d/b");
			System.out.println("\t\tsome stuff3...with d/b");
			
			
			/*System.out.println("Closing File....");
			System.out.println("Closing Network.....");
			System.out.println("Closing Database.....");*/
			
		}
		catch(RuntimeException e) {
			System.out.println("Problem : "+e);
		}
		finally {
			System.out.println("Finally runs regardless of the exceptions...");
			System.out.println("finally : Closing File....");
			System.out.println("finally : Closing Network.....");
			System.out.println("finally : Closing Database.....");
		}
	}
}
