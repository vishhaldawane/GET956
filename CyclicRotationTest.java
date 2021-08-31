package lesson02;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicRotationTest {
	public static void main(String[] args) {
		
		int array1[]= {3,8,9,7,6};
		CyclicRotation cyclicRotation = new  CyclicRotation();
		int foundArray1[] = cyclicRotation.solution(array1, 3);
		System.out.println(Arrays.toString(foundArray1));
		
		int array2[]= {0,0,0};
		
		int foundArray2[] = cyclicRotation.solution(array2, 3);
		System.out.println(Arrays.toString(foundArray2));
		
		int array3[]= {1,2,3,4};
		
		int foundArray3[] = cyclicRotation.solution(array3, 4);
		System.out.println(Arrays.toString(foundArray3));
		
		int array4[]= {-1000,50,90,1000};
		
		int foundArray4[] = cyclicRotation.solution(array4, 2);
		System.out.println(Arrays.toString(foundArray4));
		
		int array5[]= {1,2,3,4,5,6,7,8,9,10};
		
		int foundArray5[] = cyclicRotation.solution(array5,100);
		System.out.println(Arrays.toString(foundArray5));
	}

}
/*
 * K=3
 * 			            i
 * 			0  1  2  3  4
 * 			3, 8, 9, 7, 6
 * 			------>
 * 
 * 			7  6  3  8  9
 * 
 * rotationIndex = ( i + K ) % A.length
 * 				 = ( 0 + 3 ) % 5 --------> 3
 * 
 * 					( 1 + 3 ) % 5 -------> 4
 * 
 * 					( 2 + 3 ) % 5 ------> 0
 * 
 * 					( 3 + 3 ) % 5 ---> 1
 * 
 * 					( 4 + 3 ) % 5 --> 2
 * 
 */

class CyclicRotation
{
	public int[] solution(int[] A, int K)
	{
		int rotatedArray[] = new int [ A.length ]; //copy the length 
		
		for(int i=0;i< A.length; i++) {
			int rotationIndex = ( i + K ) % A.length;
			rotatedArray [ rotationIndex ] = A [ i ];
			System.out.println("==>"+Arrays.toString(rotatedArray));
		}
		
		return rotatedArray;
	}
}