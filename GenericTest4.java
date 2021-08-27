import java.util.Scanner;

import com.mysongs.Song;

public class GenericTest4 {//each group leader would check with their member
	public static void main(String[] args) {//and then in chatbox 10 updates
//MyValue is a raw type. References to generic type MyValue<T> should be parameterized
		MyValue<Integer> mv1 = new MyValue<Integer>(10,20); //instance's data 
		mv1.printMyValue();	mv1.swapMyValue(); mv1.decorateMyValue();
		
		System.out.println("-------------------");
		
		MyValue<Float> mv2 = new MyValue<Float>(80.4f, 90.4f); //instance's data 
		mv2.printMyValue();	mv2.swapMyValue(); mv2.decorateMyValue();
		
		System.out.println("-------------------");
		
		MyValue<Double> mv3 = new MyValue<Double>(80.5, 90.5); //instance's data 
		mv3.printMyValue();	mv3.swapMyValue(); mv3.decorateMyValue();
		
		System.out.println("-------------------");
		
		MyValue<String> mv4 = new MyValue<String>("","");
		mv4.acceptMyValue();
		
		mv4.printMyValue();	mv4.swapMyValue(); mv4.decorateMyValue();
		
		System.out.println("-------------------");
		
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		
		MyValue<Song> mv5 = new MyValue<Song>(s1,s2);
		mv5.printMyValue();	mv5.swapMyValue(); mv5.decorateMyValue();
		
		MyValue<Integer> mv6 = new MyValue<Integer>(0,0);
		mv6.acceptMyValue();
		mv6.printMyValue();
		mv6.swapMyValue();
		mv6.decorateMyValue();
	}
}

class MyValue<T> { //is a GENERIC container to hold 2 VALUES OF TYPE T
	
	private	T x;	//content
	private T y;	//conent
	
	public MyValue() { //initialize the container
		super();			
	}
	
	public MyValue(T x, T y) { //initialize the container
		
			super();			this.x = x;			this.y = y;
	}
	public void acceptMyValue() {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter "+x.getClass().getName()+ " type value: ");
		x = (T) scan1.nextLine();
		System.out.println("Enter "+x.getClass().getName()+ " type value: ");
		y = (T) scan2.nextLine();
	}
	public void printMyValue() { //printing it - algorithm
		System.out.println("x : "+x + ":"+x.getClass().getName()); //sop - iterator
		System.out.println("y : "+y + ":"+x.getClass().getName()); //sop - iterator
	}
	public void decorateMyValue() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapMyValue() { //swap it - algorithm
		System.out.println("swapping...");
		T temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}
