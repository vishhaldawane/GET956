
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
}*/
class Tree // - Tree.class
{
	class BirdNest //named inner class -Tree$BirdNest.class
	{
		
	}
	
	//annonymous inner class
	
}

public class LambdaTest {
	
	public static void main(String[] args) {
			
		//MusicalInstrument mi = new Violin(); //loose coupling 
		//mi.play();
		//System.out.println("-------");
		
		MusicalInstrument mi = new MusicalInstrument() //LambdaTest$1.class
		{
			public void play() {
					System.out.println("Playing unnamed class... plucking/playing a Guitar...");
			}
		}; //<-- look at the semicolon  here
		mi.play();
		
		MusicalInstrument mi2 = new MusicalInstrument() //LambdaTest$1.class
				{
					public void play() {
							System.out.println("Playing unnamed class... tinging/playing a Sitar...");
					}
				}; //<-- look at the semicolon  here
				mi2.play();
				
				
				MusicalInstrument mi3 = new MusicalInstrument() //LambdaTest$1.class
						{
							public void play() {
									System.out.println("Playing unnamed class... bowing/playing a Violin...");
							}
						}; //<-- look at the semicolon  here
						mi3.play();
						
				MusicalInstrument	mi4	= () -> {
					System.out.println("Playing lambda function... Playing Veena...");
					
				};
				mi4.play();
		
	}
}
