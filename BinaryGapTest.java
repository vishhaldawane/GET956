package lesson01;

import java.util.ArrayList;

public class BinaryGapTest {
	public static void main(String[] args) {
		BinaryGap binaryGap = new BinaryGap();
		int g1 = binaryGap.solution(529);	System.out.println("longest gap "+g1);
		int g2 = binaryGap.solution(5);		System.out.println("longest gap "+g2);
		int g3 = binaryGap.solution(20);	System.out.println("longest gap "+g3);
		int g4 = binaryGap.solution(32);	System.out.println("longest gap "+g4);
		int g5 = binaryGap.solution(2140048367);	System.out.println("longest gap "+g5);
	}

}
/*      0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
 * 		0 0 1 0 0 1 0 0 0 1 0   0 0  0  0  0  0   1 1 0 0 0 1 1 0 0 0 0 1 0 1 1  <-- ? <--N
 * 			|     |       |                       |
 */
class BinaryGap
{
	public int solution(int N)
	{
		String binaryStringRepresentation = Integer.toBinaryString(N);
		System.out.println(N+"'s binary representation : "+binaryStringRepresentation );
		
		ArrayList<Integer> listOfAllOnes = new ArrayList<Integer>();
		
		for(int i=0;i <binaryStringRepresentation.length();i++) {
			char character = binaryStringRepresentation.charAt(i);
			
			if(character=='0')
				continue;
			
			listOfAllOnes.add(i);
		}
		int longestBinaryGap=0;
		for(int i=0;i<listOfAllOnes.size()-1;i++) {
			int differenceOfIndices = listOfAllOnes.get(i+1) - listOfAllOnes.get(i) - 1;
			longestBinaryGap = Math.max(longestBinaryGap, differenceOfIndices);
		}
		return longestBinaryGap;
	}
}