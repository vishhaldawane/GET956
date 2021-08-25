import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest2 {
	public static void main(String[] args) {
		
		ArrayList <Person>personList = new ArrayList<Person>();

		try {
			Person p1= new Person('M',23,"Jack");
			Person p2 = new Person('F',22,"Jane");
			personList.add(p1);
			personList.add(p2);
			personList.add(new Person('F',21,"Julie"));
			personList.add(new Person('M',22,"Jackie"));
			
			for(Person x : personList) {
				System.out.println(""+x);
			}
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
