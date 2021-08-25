/*
 * 		Exception = runtime error
 * 
 * 
 * 						Errors
 * 						|
 * 		---------------------------------------------
 * 		|		|		|		|		|		 |
 * 		syntax	runtime	link	fatal	logical  testing error
 * 		|			|	  |		|			|
 * 		|			|	  |     |		logical mistake in the program
 * 		|			|	  |	  death of an appliaction
 * 	compilation	Exception missing library
 * 					|
 * 				we are here to discuss runtime errors
 * 
 * 
 * 						Object
 * 							|
 * 					---------------------
 * 						|
 * 					  Throwable
 * 							|
 * 				-----------------------------
 *					|				|can be caught
 * 				Error			Exception 
 * 								   |checked exceptions<- - javac
 * 				----------------------------------
 * 				|			|				|
 * 	RuntimeException		IOException	SQLException .....
 * 		| unchecked exceptions <-JRE
 * -------------------------
 *     |			   |  |
 * ArithmeticException | NullPointerException	
 * 	IndexOutOfBoundsException
 * 				|
 * 	--------------------------
 *   |					|
 *   |		ArrayIndexOutOfBoundsException
 *  StringIndexOutOfBoundsException
 * 
 * 
 * The class Exception and 
 * any subclasses that are 
 * not also subclasses of 
 * RuntimeException 
 * are checked exceptions
 * 
 * 			100kg				  100kg
 * 			||					   ||
 * 			||					   ||
 * 			||=====================||
 * 			||					   ||
 * 			||					   ||
 * 		-------------------------------------------
 * 
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
	
		System.out.println("Begin main");
			Calculator myCalci= new Calculator();
			
			int a = myCalci.divide(10,0);
			System.out.println("a "+a);
			
			int b = myCalci.divide(100,0);
			System.out.println("b "+b);
			
			int c = myCalci.divide(50,0);
			System.out.println("c "+c);
			
			int d = myCalci.divide(90,0);
			System.out.println("d "+d);
			
			
		System.out.println("End main");
		
	}
}

class Calculator
{
	int divide(int num, int deno) 
	{
		System.out.println("num  : "+num);
		System.out.println("deno : "+deno);
		System.out.println("Trying to divide..."+num+ " by "+deno);
		int div=0;
		try {
		//if(deno!=0)
			 div = num / deno; //BL
		//else 
			//System.out.println("Cannot divide by zero ..."); //EL
		}
		catch(ArithmeticException e) { //EL
			//System.out.println("Problem : "+e);//exception classname + message
			System.out.println("Cannot divide by zero");
		}
		catch(RuntimeException e) {
			System.out.println("Some Problem : "+e);
		}
		catch(Exception e) {
			System.out.println("Problem : "+e);
		}
		
		System.out.println("Division done...");
		return div;
	}
}
/*
 *   if deno is 0 then JVM
 *   ArithmeticException ae =  new ArithmeticException("/ by zero");
 *   throw ae;
 *   
 *   
 *   
 * 
 */


