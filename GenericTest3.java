import com.mysongs.Song;

public class GenericTest3 {//each group leader would check with their member
	public static void main(String[] args) {//and then in chatbox 10 updates
		MyInteger mi1 = new MyInteger(10, 20); //instance's data 
		mi1.printInteger();	mi1.swapInteger(); mi1.decorateInteger();
		
		System.out.println("-------------------");
		
		MyInteger mi2 = new MyInteger(80, 90); //instance's data 
		mi2.printInteger();	mi2.swapInteger(); mi2.decorateInteger();
		
		System.out.println("-------------------");
		
		MyDouble md1 = new MyDouble(80.5, 90.5); //instance's data 
		md1.printDouble();	md1.swapDouble(); md1.decorateDouble();
		
		System.out.println("-------------------");
		
		MyString ms1 = new MyString("Julia","Robert");
		ms1.printString(); ms1.swapString(); ms1.decorateString();
		System.out.println("-------------------");
		
		Song s1 = new Song("My Heart Will Go On","Celine D","Titanic",1994);
		Song s2 = new Song("I want it that way","Backstreet Boys","Millenium",1998);
		
		MySong jukeBox = new MySong(s1,s2);
		jukeBox.printSong();
		jukeBox.swapSong();
		jukeBox.decorateSong();
		
		
	}
}
//11:20 
class MyInteger { //is a container to hold 2 integers
	
	private	int x;	//content
	private int y;	//conent
	
	public MyInteger(int x, int y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printInteger() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateInteger() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapInteger() { //swap it - algorithm
		System.out.println("swapping...");
		int temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}

class MyDouble { //is a container to hold 2 integers
	
	private	double x;	//content
	private double y;	//conent
	
	public MyDouble(double x, double y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printDouble() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateDouble() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapDouble() { //swap it - algorithm
		System.out.println("swapping...");
		double temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}

class MyString { //is a container to hold 2 integers
	
	private	String x;	//content
	private String y;	//conent
	
	public MyString(String x, String y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printString() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateString() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapString() { //swap it - algorithm
		System.out.println("swapping...");
		String temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}

class MySong { //is a container to hold 2 integers
	
	private	Song x;	//content
	private Song y;	//conent
	
	public MySong(Song x, Song y) { //initialize the container
			super();
			this.x = x;
			this.y = y;
	}
	public void printSong() { //printing it - algorithm
		System.out.println("x : "+x); //sop - iterator
		System.out.println("y : "+y); //sop - iterator
	}
	public void decorateSong() { //decoare it - algorithm
		System.out.println("[x : "+x+"]");
		System.out.println("[y : "+y+"]");
	}
	public void swapSong() { //swap it - algorithm
		System.out.println("swapping...");
		Song temp=x;		x=y;		y=temp;
		System.out.println("swapped...");
	}
}