public class InheritanceTest {
	public static void main(String[] args) {
		
		//final double PI=3.14;
		//System.out.println("PI is "+PI);
		//PI=3.18;
		//System.out.println("PI is "+PI);
		
		
		GrandFather gf = new GrandFather(111);
		gf.farming();
		//gf.banking();
		//gf.coding();
		
		System.out.println("-------");
		
		Father f = new Father(222);
		f.farming();
		f.banking();
		//f.coding();
		
		System.out.println("-------");
		
		Child c = new Child(333);
		c.farming();
		c.banking();
		c.coding();
		
	}
}
class GrandFather
{
	GrandFather(int a){
		//super //IT IS A DEFAULT LINE 
		System.out.println("GrandFather()..."+a);
	}
	void farming() {
		System.out.println("GrandFather is farming.....");
	}
}
class Father extends GrandFather //single level
{
	//Implicit super constructor GrandFather() is undefined. 
	//Must explicitly invoke another constructor
	Father(int b){
		super(112); //The constructor GrandFather() is undefined
		System.out.println("Father()..."+b);
	}
	void farming() {
		System.out.println("Father is farming.....");
	}
	void banking() {
		System.out.println("Father is banking.....");
	}
}

class Child extends Father //multi-level
{
	Child(int c){
		super(223); //IN ORDER TO VALIDATE TEH DATA STRUCTURE OF ITS PARENT 
		System.out.println("Child()..."+c);
	}
	void farming() {
		System.out.println("Child is farming.....");
	}
	void banking() {
		System.out.println("Child is banking.....");
	}
	void coding() {
		System.out.println("Child is coding.....");
	}
}
/*
 * Person		F  REETA  22
 * |
 * Student	8686  EEE  BHARATHI VIDYAPEETH
 * |
 * Employee - 19822 LTI  DEVELOPER 5000
 * 
 */





