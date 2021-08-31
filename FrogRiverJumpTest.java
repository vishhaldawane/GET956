package lesson04;

import java.util.HashSet;
import java.util.Set;

/*
 * X=5
 * 
  	
  		requiredLeavesSet
  		1	2	3	4	5
  		
  		
 * 		0	1	2	3	4	5	6	7
 *      1	3	1	4	2	3	5	4
 * 		                    
 */
public class FrogRiverJumpTest {
	public static void main(String[] args) {
		 int A[]= {1,3,1,4,2,3,5,4};
		 int X=5;
		 FrogRiver frog= new FrogRiver();
		 int earliestTime = frog.solution(X, A);
		 System.out.println("Earliest time : "+earliestTime);
	}
}
class FrogRiver {
	public int solution(int X, int[] A) {
		
		
		Set<Integer> requiredLeavesSet = new HashSet<Integer>();
		for(int i=1;i<=X;i++) {
			requiredLeavesSet.add(i); // creating an array of 1,2,3,4,5
		}
		Set<Integer> currentLeavesSet = new HashSet<Integer>();
		
		//Returns true if this set contains all of the elements of the 
		//specified collection. If the specified collection is also a set
		
	
		for(int position=0;position<A.length;position++) {
			currentLeavesSet.add(A[position]);
			
			if(currentLeavesSet.size() < requiredLeavesSet.size())
				continue;
			
			if(currentLeavesSet.containsAll(requiredLeavesSet)) {
				return position;
			}
		}
		
		return -1;
	}
}
