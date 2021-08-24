
public class FunctionOverridingTest {
	public static void main(String[] args) {
		
		/*Doctor d = new Doctor();
		
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
			
		}*/
		
		/*
		 * 	1. inherited method
		 *  2. overridden method /overriding method
		 *  3. exclusive method
		 *  4. implemented method
		 */
		
		Doctor d = new Doctor();	d.diagnose(); // binding of Doctor's diagnose() method with d at compile time
		
		System.out.println("----------");
		
		Surgeon s = new Surgeon();	s.diagnose();  // binding of Surgeon's diagnose() method with s at compile time
		
		System.out.println("----------");
		
		HeartSurgeon hs = new HeartSurgeon();	hs.diagnose(); // binding of HeartSurgeon's diagnose() method with hs compile time
		
		System.out.println("=============");

		Doctor dd = new Doctor();	dd.diagnose(); // binding of Doctor's diagnose() method with dd at compile time
						// but at runtime verification would take place
		
		System.out.println("----------");
		
		dd = new Surgeon();			dd.diagnose();  // binding of Doctor's diagnose() method with dd at compile time
							//but at the runtime binding would be Surgeon's diagnose
		
		System.out.println("----------");
		
		dd = new HeartSurgeon();	dd.diagnose(); // binding of Doctor's diagnose() method with dd
		Person p = new Person();
		Patient pt = new Patient();
		System.out.println("----------");
		generalCheckupDoor(pt,d);
		generalCheckupDoor(pt,s);
		generalCheckupDoor(pt,hs);
		System.out.println("----------");
		//generalSurgeryDoor(p,d);
		generalSurgeryDoor(pt,s);
		generalSurgeryDoor(pt,hs);
		System.out.println("----------");
		//heartSurgeryDoor(p,d);
		//heartSurgeryDoor(p,s);
		heartSurgeryDoor(pt,hs);
		
	}
	public static void generalCheckupDoor(Patient p, Doctor x) {
		System.out.println("General checkup going on...");
		x.diagnose();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
	}
	public static void generalSurgeryDoor(Patient p,Surgeon x) {
		System.out.println("Surgical checkup going on...");
		x.diagnose();
		System.out.println("#########################");
	}
	public static void heartSurgeryDoor(Patient p,HeartSurgeon x) {
		System.out.println("Heart Surgical checkup going on...");
		x.diagnose();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
class Person { }
class Patient extends Person { }

class Magician extends Person { }


class Doctor {
	void diagnose() {
		System.out.println("Doctor: diagnose()....ENT checkup");
	}
}
class Surgeon extends Doctor { 
	void diagnose() { //now the surgeon would like to hide/override its parent method
		System.out.println("Surgeon: diagnose()....CT scan checkup");
	}
}
class HeartSurgeon extends Surgeon {
	void diagnose() { //now the surgeon would like to hide/override its parent method
		System.out.println("HeartSurgeon: diagnose()....CardioGraph scan checkup");
	}
}




