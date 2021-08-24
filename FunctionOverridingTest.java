
public class FunctionOverridingTest {
	public static void main(String[] args) {
		
		Doctor d = new Doctor();
		
		if(d instanceof Doctor) {
			System.out.println("Yes, d is pointing to an instance of Doctor");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of Doctor");
			
		}
		System.out.println("---------");
		
		d = new Surgeon();
		
		if(d instanceof Doctor) {
			System.out.println("Yes, d is pointing to an instance of Doctor");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of Doctor");
			
		}
		
		if(d instanceof Surgeon) {
			System.out.println("Yes, d is pointing to an instance of Surgeon");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of Surgeon");
			
		}
		
		System.out.println("---------");
		
		d = new HeartSurgeon();
		
		if(d instanceof Doctor) {
			System.out.println("Yes, d is pointing to an instance of Doctor");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of Doctor");
			
		}
		
		if(d instanceof Surgeon) {
			System.out.println("Yes, d is pointing to an instance of Surgeon");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of Surgeon");
			
		}
		
		if(d instanceof HeartSurgeon) {
			System.out.println("Yes, d is pointing to an instance of HeartSurgeon");
		}
		else {
			System.out.println("No, d is NOT pointing to an instance of HeartSurgeon");
			
		}
	}
}

class Doctor { }
class Surgeon extends Doctor { }
class HeartSurgeon extends Surgeon { }

