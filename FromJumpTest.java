package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FromJumpTest {
	public static void main(String[] args) {
		FrogJump frogJump = new FrogJump();
		int jumps1 = frogJump.solution(10,85,30); System.out.println(jumps1);
		//1..1,000,000,000
		int jumps2 = frogJump.solution(1000000000,1000000000,1000000000); System.out.println(jumps2);

	}
}
class FrogJump
{							//10   85     30
	public int solution(int X, int Y, int D)
	{
		int distanceToJump = Y - X;  //85 - 10 = 75
		int jumpsRequired   = distanceToJump / D;  // 75 / 30
		if(distanceToJump % D !=0 ) {
			jumpsRequired++;
		}
		return jumpsRequired;
	}
}