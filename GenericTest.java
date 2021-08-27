import java.util.ArrayList;

/*
 *primitive   Wrapper
 * char    - Character
 * float   - Float
 * double  - Double
 * long    - Long
 * int     - Integer
 * short   - Short
 * byte    - Byte
 * boolean - Boolean
 * 
 * 					Collection(i)					Map(i)		Comparable(i)  Comparator(i)
 * 						|							|key+value
 * 				---------------------		----------------
 * 				|				    |			|			|
 * 				List(i)			   Set(i)		TreeMap	HashMap <-- containers
 * 				|duplicates			 | unique
 * 		---------------				----------
 * 		|			|				|		|
 * 	ArrayList LinkedList  		TreeSet	HashSet	<-- these are containers
 * 	logs	    ----  ----  ----			
 * ----			|  |->|  |->|  | 	
 * |100|0		| 6|<-| 5|<-| 3| ...90th
 * ----			----  ----  ----
 * |800|1			100
 * ----				
 * |  |2			rollno name  marks
 * ----				500
 * |  |3
 * ----							flno flname seats
 * |  |4						800
 *   | <-- append is faster
 *  \ /    search is faster
 *   |
 *   
 * 	Components Orthogonal Space
 * 
 * 				Content		Container*  Iterator    Algorithm
 * 				|				|		 |			|
 * 				ButterMilk - Glass -   Straw		drink()
 * 				ColdDrink  - Bottle -  Straw		drink()
 * 				FriedRice  - Plate  -  Spoon        eat()
 * 				Noodles    - Bowl   -  ChopStiks    eat()
 * 			 PaneerChilly  - Bowl   -  Fork         eat()
 *              Pickle     - Plate  -  finger       lick()
 *            CoconutWater -Coconut -  straw		drink
 *              
 *              			WaterBottle+inbuilt with Straw 
 *              		label : Rajesh Sharma STD: IV -A-21
 * 
 * 				Tea		 Cup+Saucer -  mouth        sipIt()
 * 				
 * 						  Content
 * 							 | Buttermilk, int*, float
 * 							 |
 * 				Container----+-----Algorithm - drink()
 * 				|			 |				|	
 * 			Glass		  Iterator		sort(int[]),   search(int item, int[])*
 * 			|				Straw		sort(float[])  search(float item, float[])
			Array*			for()*
		int   array[]
		flaot array[]
		
				Generic Glass    Content      		specific container
					|				 |				|
					morning glass -> Water			copper container 
					breakfast     -> Tea			tea cup
					during lunch -> ButterMilk		steel container
					evening ->      Juice			typical juice glass
					late evening->  ???				Y shape glass
					night       ->  Milk			glass 
				
 				TreeSet
 				
 	23  30   12   80   6  19  75  90  9  23      8   4   7
 	                          ^
 	non-linear
 				rootNode
 					|23
 		-----------------------
 			|12			|30
 			leftchild	rightchild
 			|					|80
 		----------			-----------
 		|6		|19			|75		|90
 		L		R			L		R	
 		|
 	-----------
 	|4		|9
 	     -------
 	     |
 	     8
 	     |
 	  ------
 	  |
 	  7
 	  
 	  HashSet
 	  
 	  -----------------------
 	  |	comics	|	science |
 	  |	1		|			|
 	  |---------+		3	|
 	  |	novel	|			|
 	  |	4		+-----------|
 	  |			| textbook	|
 	  |			|	2		|
 	  -----------------------
 	  |		fiction		5	|
 	  +---------------------+
 	  
 	  
 	  Fruiter
 	  -----------------------
 	  |	apple	|	mango   |
 	  |	1		|			|
 	  |---------+		3	|
 	  |	kiwi	|			|
 	  |	4		+-----------|
 	  |			| banana	|
 	  |			|	2		|
 	  -----------------------
 	  |		orange		5	|
 	  +---------------------+
 			
 *
 *
 */
class MyInteger //no need to make this class, already java.lang.Integer wrapper is present 
{
	private int value;
	
	MyInteger(int x) {
		value = x;
	}
	int valueOf() {
		return value;
	}
	int preIncrement() {
		return ++value; 
	}
	int postIncrement() {
		return value++;
	}
}
public class GenericTest {
	public static void main(String[] args) {
		int num=100; //primitive;
	
		System.out.println("1num : "+num);
		num++;
		System.out.println("2num : "+num);
		++num;
		System.out.println("3num : "+num);
		System.out.println("4num : "+num++);
		System.out.println("5num : "+num);
		
		MyInteger mi = new MyInteger(200); // your primitive inside a cage 
		System.out.println(mi.valueOf());
		mi.preIncrement();
		System.out.println(mi.valueOf());
		mi.postIncrement();
		System.out.println(mi.valueOf());
		
		ArrayList<Integer> myNumberList = new ArrayList<Integer>();
		
	}
}




