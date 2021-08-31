package lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class OddOccuranceInArrayTest {
	public static void main(String[] args) {
		OddOccuranceInArray oddOccuranceArray = new OddOccuranceInArray();
		int array1[]= {9,3,9,3,9,7,9};

		int oddValue1 = oddOccuranceArray.solution(array1); System.out.println(oddValue1);	
		
		int array2[]= {1,3,1,3,1,1000000000,1};

		int oddValue2 = oddOccuranceArray.solution(array2); System.out.println(oddValue2);	

	}
}
class OddOccuranceInArray
{
	public int solution(int[] A)
	{
		HashMap<Integer,Integer>  numbersMap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<A.length;i++) {
			if(numbersMap.containsKey(A[i]))
			{
				int countOfOccurences = numbersMap.get(A[i]);
				countOfOccurences++;
				numbersMap.put(A[i], countOfOccurences);
				
			}
			else 
				numbersMap.put(A[i],1); //{9, 4}, {3,2}, {7,1} 
		}
		
		int keyToReturn=-1;
		
		Set<Integer> allKeys = numbersMap.keySet();
		for (Integer key : allKeys) {
			int occurences = numbersMap.get(key);
			if(occurences%2!=0) {
				keyToReturn = key;
				break;
			}
		}
		return keyToReturn;
	}
}