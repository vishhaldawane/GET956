
//interface with one abstract method - functional interface
interface MusicalInstrument {
	void play(); //by default abstract method
}
/*class Guitar implements MusicalInstrument {
	public void play() {
		System.out.println("Playing Guitar....");
	}
	public void pluck() {
		System.out.println("Plucking guitar....");
	}
}
class Sitar implements MusicalInstrument {
	public void play() {
		System.out.println("Playing Sitar....");
	}
	public void ting() {
		System.out.println("Tinging Sitar....");
	}
}
class Violin implements MusicalInstrument {
	public void play() {
		System.out.println("Playing Violin....");
	}
	public void bowing() {
		System.out.println("Bowing Violin....");
	}
}
class Cello extends Violin {

}
*/
class Tree // - Tree.class - outer class only be public, abstract or final
{
	private class BirdNest //named inner class -Tree$BirdNest.class
	{
		
	}
	
	//annonymous inner class
	
}

abstract class BankAccount { 
	private int bankAccount;
	
} //meant for inheritance
final class Chess {} //cannot be extended

//The class BankChess can be either abstract or final, not both
//abstract final class BankChess { }

class UseAnnonymousInnerClass
{
	static void callMeIMAnnonymous(MusicalInstrument x) {
		System.out.println("Annonymous...started");
		x.play();
		System.out.println("Annonymous...over");
	}
}
interface A {
	void foo(); //promise or mandate of its implementation
}
public class LambdaTest {
	
	
	void fun() {
		
		
	/*class A*/	
		A a = ()-> 
		{
			System.out.println("lambda function invoked...");	
			
		};
		//A a = new A();
		a.foo();
	}
	
	
	public static void main(String[] args) {
		LambdaTest lt = new LambdaTest();
		lt.fun();
			//A a = new A();
			
		//MusicalInstrument mi = new Violin(); //loose coupling 
		//mi.play();
		//System.out.println("-------");
		
		//Guitar is named class, and below in unNAMED class
		
		MusicalInstrument mi = new MusicalInstrument() //LambdaTest$1.class
		{ //child class of MusicalInstrument interface
			public void play() {
					System.out.println("Playing unnamed class... plucking/playing a Guitar...");
			}
			public void fun() { }
		}; //<-- look at the semicolon  here
		mi.play();
		
		UseAnnonymousInnerClass.callMeIMAnnonymous(mi);
		//mi.fun();
		
		MusicalInstrument mi2 = new MusicalInstrument() //LambdaTest$2.class
				{
					public void play() {
							System.out.println("Playing unnamed class... tinging/playing a Sitar...");
					}
				}; //<-- look at the semicolon  here
				mi2.play();
				
				
				MusicalInstrument mi3 = new MusicalInstrument() //LambdaTest$3.class
						{
							public void play() {
									System.out.println("Playing unnamed class... bowing/playing a Violin...");
							}
						}; //<-- look at the semicolon  here
						mi3.play();
						
		//is it as if a function of the LambdaTest.java file 
				MusicalInstrument	mi4	= () -> 
				{
					System.out.println("Playing lambda function... Playing Veena...");
					
				};
				mi4.play();
		
	}
}
