public class GenericTest3 {//each group leader would check with their member
	public static void main(String[] args) {//and then in chatbox 10 updates
		MyInteger mi1 = new MyInteger(10, 20); //instance's data 
		mi1.printInteger();	mi1.swapInteger(); mi1.decorateInteger();
		
		System.out.println("-------------------");
		
		MyInteger mi2 = new MyInteger(80, 90); //instance's data 
		mi2.printInteger();	mi2.swapInteger(); mi2.decorateInteger();
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


