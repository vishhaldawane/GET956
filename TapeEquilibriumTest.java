package lesson3;
/*
 * 				0	1	2	3	4
 * 				3	1	2	4 	3 --------> 13
 * 				I	<----II------>
 * 				3		 10					7
 * 
 * 				<-I->   <-II----->
 * 				  4			9				5		
 * 
 * 				<---I--->   <-II->
 * 					6		  7				1
 * 
 * 				<---I-------><-I-> 
 * 					10		   3			7
 * 
 * 
 * 
 */
public class TapeEquilibriumTest {
	public static void main(String[] args) {
		int array[]= {3,1,2,4,3};
		TapeEquilibrium tape = new TapeEquilibrium();
		int minValue = tape.solution(array);
		System.out.println("min "+minValue);
	}
	
}
class TapeEquilibrium {
	public int solution(int[] A) {
        // write your code in Java SE 8
        long sumOfAllElemnts =0;
        for(int i=0;i<A.length;i++) {
            sumOfAllElemnts+=A[i];
        }
        //System.out.println(sumOfAllElemnts);
        long sumOfFirstPart=0;
        long sumOfSecondPart=0;
        int runningDifference=Integer.MAX_VALUE;
        int minimumDifference=Integer.MAX_VALUE;

        for( int i=0 ; i<A.length-1 ; i++) {
            sumOfFirstPart = sumOfFirstPart + A[i];
            sumOfSecondPart = sumOfAllElemnts - sumOfFirstPart;
           // System.out.println("I part sum  : "+sumOfFirstPart);
            //System.out.println("II part sum : "+sumOfSecondPart+"\n");
            runningDifference = (int) Math.abs(sumOfFirstPart - sumOfSecondPart);
           // System.out.println("running diff "+runningDifference);
            minimumDifference = Math.min(runningDifference,minimumDifference);
           // System.out.println("min diff : "+minimumDifference);
           // System.out.println("--------------");
        }

        return minimumDifference;
    }
}
