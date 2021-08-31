package lesson3;

import java.util.*;


public class PermutationMissingElementTest {
	public static void main(String[] args) {
		PermutationMissingElement permuteMissElement = new PermutationMissingElement();
		int array[]= {2,3,1,5};
		int missingElement = permuteMissElement.solution(array);
		System.out.println("missing element : "+missingElement);
	}
}
class PermutationMissingElement
{							
	 public int solution(int[] A)
	{
		// write your code in Java SE 8
        Set<Integer> incompleteNumbersSet = new HashSet<Integer>();
        for(int i=0;i< A.length; i++) {
            incompleteNumbersSet.add(A[i]);
        }
        final int MAX_VALUE=A.length + 1;
        //System.out.println("MAX_VALUE:"+MAX_VALUE);

        for(int i=1; i< MAX_VALUE+1; i++) {
             if( ! incompleteNumbersSet.contains(i)) {
                return (i);
             }
        }
        return -1;
	}
}