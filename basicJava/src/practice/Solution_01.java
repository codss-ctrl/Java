package practice;

import java.util.Arrays;

public class Solution_01 {
	
		/**
		 * 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		 * n은 0 이상 3000이하인 자연수입니다.
		 * 
		 * 입출력 예 #1
			12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.

			입출력 예 #2
			5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
		 */
		
		
	public int Solution(int n) {//0<=n<=3000
		int sum = 0;
		int answer = 0;
		 for (int i = 1; i < n+1; i++) {
			  if (n%i == 0) {
				 sum += i;
				 }//end if
		}//end for
	     answer = sum;
	     return answer;
	 }//end solution
	
}



//		 int yac;
//		 yac = n/1; //n=12 - >12
//		 yac = n/2; // 6
//		 yac = n/3; //4
//		 yac = n/4; //3
//		 yac = n/6; //2
//		 yac = n/n;	//1	 
//	     sum += yac;
