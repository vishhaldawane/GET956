public class GenericTest2 {//each group leader would check with their member
	public static void main(String[] args) {//and then in chatbox 10 updates
		//declaring
		int x;	int y;		x=10;	y=20;
		printInteger(x,y);	swapInteger(x, y);	decorateInteger(x,y);
		int p;		int q;	p=80;		q=90;
		printInteger(p, q);	swapInteger(p, q);	decorateInteger(p, q);
	}
	public static void printInteger(int ref1, int ref2) {
		System.out.println("x : "+ref1);
		System.out.println("y : "+ref2);
	}
	public static void decorateInteger(int ref1, int ref2) {
		System.out.println("[x : "+ref1+"]");
		System.out.println("[y : "+ref2+"]");
	}
	public static void swapInteger(int ref1, int ref2) {
		System.out.println("swapping...");
		int temp=ref1;		ref1=ref2;		ref2=temp;
		System.out.println("swapped...");
	}
}


