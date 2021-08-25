import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		Person p[] = new Person[3];
		
		try {
			p[0] = new Person('M',23,"Jack");
			p[1] = new Person('F',22,"Jane");
			p[2] = new Person('F',21,"Julie");
			p[3] = new Person('M',22,"Jackie");
			
			for(int i=0;i<p.length;i++) {
				System.out.println(p[i]);
			}
		} catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
