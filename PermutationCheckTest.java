package lesson04;

import java.util.HashSet;

public class PermutationCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,100000002,100000003};
		Permutation p=new Permutation();
		int ans=p.solution(A);
		System.out.println(ans);
	}

}

class Permutation {
	public int solution(int A[]) {
		
		int n=A.length;
		int temptotal=(n*(n+1))/2;
		int total=0;
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<A.length;i++) {
			hs.add(A[i]);
			total+=A[i];
		}
		if(hs.size()==A.length && total==temptotal) { 
			return 1;
		}
		return 0;
	}
}
