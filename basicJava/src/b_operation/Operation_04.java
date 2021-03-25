package b_operation;

import java.util.Scanner;

public class Operation_04 {
 public static void main(String[] args){
	 /*
	   1. 삼항연산자
	    - 세 개의 피연산자를 필요로 하기 때문에 삼항 연산자라고 한다.
	    - 삼항연산자의 조건식에는 연산결과가 true 또는 false인 식이 사용되어야 한다.
	    - 기본구조
	      (조건식)? 식1 : 식2 ;
	 
	 
	 */
	 int x = -10;
	 int absx = x>0? x : -x;
	 System.out.println(absx);
	 
	 //1. 변수 k를 선언하고 50의 값으로 초기화 하여라
	 	int k = 50;
	 //2. 변수 k의 값이 0보다 크면 "양수", 0보다 작으면 "음수", 0이면 "0"의 결과를 re에 저장해주세요
	 	String re = k>0? "양수": k<0? "음수":"0";
	 	System.out.println(re);
	 
	 
	 /*
	  2. 대입연산자 (=, op=)
	  	- 변수에 값 또는 수식의 연산결과를 저장하는데 사용한다.
	  	- 연산우선순위가 가장 낮다.
	 
	 	 */
	 	int i = 0;
	 	 i = i + 3;//i +=3;
		 	
	 	 System.out.println(i);
	 	 
	 	 char c = 'A';
	 	 c += 3; // c = c+3는 불가
	 	System.out.println(c);
	 	
	 	/*
	 	  1.반올림
	 	   - 43p
	 	 
	 	
	 	*/
	 	double pi = 3.141592; // float pi = 3.141592F;
	 	float f = (int)(1000*pi+0.5)/1000F;
	 	System.out.println(f);
	 	//pi*1000 ==> 3141.592
	 	//+0.5 ==> 3142.092
	    // (int) ==> 3142
        // /1000f ==>3.142
 
	 	/*
	 	 2. Math.random
	 	  - 0 <= Math.random < 1
	 	  - 주사위
	 	   => 1 <= (int)(6*Math.random+1) < 7
	 	  
	 	 */
	 	 	 	 
	  int dice = (int)(Math.random()*6+1);
	  System.out.println(dice);
	  
	  // 1~25 사이의 임의의 정수값
	  int ddice = (int)(Math.random()*25+1);
	  System.out.println(ddice);
	 	 	 	  		 	
	 	
	 	int q213 = (int)(Math.random()*100); // 0,100 => 100개, 0
	 	System.out.println(q213);
	 	int q12 = (int)(Math.random()*331+44); // 44,375 ==> 331개, 44
	 	System.out.println(q12); 
	 	
  //47,314 ==> 47,315 => 268,47 -> Math.random()*268+47
 
	 	
	 	/*
	 	 3. 사용자로부터 입력받기
	 	   
	 	
	 	*/
	 	Scanner sc = new Scanner(System.in);
	 	/*
	 	System.out.println("첫번째 문자 입력해");
	 	String input = sc.next();
	 	System.out.println(input);
	 	
	 	System.out.println("두번째 문자 입력해");
	 	String input2 = sc.next();
	 	System.out.println(input+input2);
	 	*/
	 	
	 	System.out.println("첫번째 숫자 입력해주세요");
	 	int num1 = sc.nextInt();
	 	System.out.println("두번째 숫자 입력해주세요");
	 	int num2 = sc.nextInt();
	 	System.out.println("두 수의 합계는"+(num1+num2));
	 	
	 	
	 	
	 	
 }      
  }












