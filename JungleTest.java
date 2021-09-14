package com.lti.java;

public class JungleTest {
	public static void main(String[] args) {
		Sparrow theSparrow = new Sparrow();
		theSparrow.layEggs();
		
		Parrot theParrot = new Parrot();
		theParrot.fly();
		
		Crow theCrow = new Crow();
		theCrow.watching();
	}
}
class Tiger { }
class Lion { }
class Elephant {}

class Cow {}
class Goat { }
class Hen { }

class Parrot { 
	public void fly() {
		System.out.println("parrot is flying...");
	}
}
class Sparrow { 
	public void layEggs() {
		System.out.println("Sparrow is laying eggs...");
	}
	
}
class Crow { 
	public void watching() {
		System.out.println("Crow is watching...");
	}
}

class Crocodile {}
class Lizart { }
class Snake { }

class RosePlant { }
class LillyPlant { }
class LotusPlant { }

/*

1. after compilation of the above code

2. goto the properties of this project

3. copy the project folder path [/Users/apple/eclipse-workspace/JunitProject]

4. start a new command prompt [ assuming jdk/bin is already added in system path]

5. at the command prompt> cd /Users/apple/eclipse-workspace/JunitProject/bin <--- watch this

6. notepad manifest.mf -> Main-Class: com.lti.java.JungleTest [ENTER KEY] <-- save this file

7. jar -cvfm Bird.jar manifest.mf com/lti/java/Crow.class com/lti/java/Parrot.class 
		com/lti/java/Sparrow.class com/lti/java/JungleTest.class

8. java -jar Bird.jar <-- this will run the main program [ JungleTest ]
 

*/