package e_oop;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		while(true){
		//5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장 하여라.
		Scanner sc = new Scanner(System.in); //스캐너 생성
		System.out.println("첫번째 정수를 입력하세요");
		int  firstNum = sc.nextInt();//첫번째 저장
		
		//6. 사용자로부터 부호를 입력 받아 변수 buho에 저장 하여라.
		
		System.out.println("+-/* 중 하나를 입력하세요");
		String buho = sc.next();//연산자 저장
		
		//7. 사용자로부터 정수를 입력 받아 변수 secondNum에 저장 하여라.
		System.out.println("두번째 정수를 입력하세요");
		int secondNum = sc.nextInt();
		
		//8. buho에 저장된 값이 '+'이면 add메서드, '-'이면 substract메서드
		// '*'이면 multiply메서드, '/'이면 divide메서드를 호출하고 결과를 출력하여라. 
		// 단. buho의 저장된 값이 위의 4가지 경우가 아니라면 '연산종료'를 출력하여라.	
		
		Calc ins = new Calc(); //객체생성
		if ("+".equals(buho) ) {
			int result =ins.add(firstNum,secondNum); 
			System.out.println(result);
		}else if("-".equals(buho)){
			int result =ins.substract(firstNum,secondNum);
			System.out.println(result);
		}else if("*".equals(buho)){
			long result =ins.multiply(firstNum,secondNum);
			System.out.println(result);
		}else if( "/".equals(buho)){
			float result =ins.divide(firstNum,secondNum);
			System.out.println(result);
		}else{
			System.out.println("안 되네요");
		}
//		switch (buho) {
//		case "+":
//			System.out.println(ins.add(firstNum, secondNum));
//			break;
//		case "-":
//			System.out.println(ins.substract(firstNum,secondNum));
//			break;
//		case "*":
//			System.out.println(ins.multiply(firstNum,secondNum));
//			break;
//		case "/":
//			System.out.println(ins.divide(firstNum,secondNum));
//			break;
//		default:
//			System.out.println("잘못 입력");
//			break;
//		}
		
		}
	}
}
class Calc{
 //1. 두 개의 int타입 입력받아 두 인자의 합의 결과를 반환하는 인스턴스메서드
 // add를 구현 하여라.
	int add(int a,int b){
		int result = a + b;
		return result;
	}
 //2. 두 개의 int타입 입력받아 앞의 인자에서 뒤의 인자를 뺀 결과를 반환하는
 // 인스턴스메서드 substract를 구현 하여라.
	int substract(int a, int b){
		int result = a-b;
		return result;
	}
 //3. 두 개의 int타입 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스메서드
 // multiply를 구현 하여라. // 단. overflow를 고려하여라.
	long multiply(int a, int b){
		long result = (long)a*b;
		return result;
	}
 //4. 두 개의 int타입 입력받아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는
 // 인스턴스메서드 divide를 구현 하여라. 
 // 단. 결과는 소수점 두 번째 자리에서 반올림하여 젓 번째 자리까지 표현 하여라
	float divide(int a,int b){
		float result = (int)((float)a/b*10+0.5)/10F;
		return result;
	}
		
		
		
		
		
	
}