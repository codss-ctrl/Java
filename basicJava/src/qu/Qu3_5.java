package qu;

import java.util.Scanner;

public class Qu3_5 {//Qu3_5 클래스가 메서드 영역에 로드되어 클래스 메서드인 main()이 같이 로드되ㅑ고 클래스 변수는 없다. 
    public static void main(String[] args) {//클래스 메서드인 main()이 호출되어 콜스택 영역에 로드된다.
        // 5. 사용자로부터 정수를 입력 받아 변수 firstNum에 저장 하여라.
    	Scanner sc = new Scanner(System.in);//사용자로부터 값을 입력받는 스캐너를 변수 sc로 선언 한다.
    	int firstNum =sc.nextInt();//스캐너로 받은 첫번째 정수를 main()의 지역변수 firstNum에 대입한다.
        // 6. 사용자로부터 부호를 입력 받아 변수 buho에 저장 하여라.
    	String buho = sc.next();//스캐너로 받은 부호를 main()의 지역변수 buho에 대입한다.
        // 7. 사용자로부터 정수를 입력 받아 변수 secondNum에 저장 하여라.
    	int secondNum = sc.nextInt();//스캐너로 받은 두번째 정수를 main()의 지역변수 secondNum에 대입한다.
        // 8. buho에 저장된 값이 '+'이면 add메서드, '-'이면 substract메서드
    	// '*'이면 multiply메서드, '/'이면 divide메서드를 호출하고 결과를 출력하여라.
        // 단. buho의 저장된 값이 위의 4가지 경우가 아니라면 '연산종료'를 출력하여라.
    	Calc cc = new Calc();//Calc 클래스를 참조변수 cc로 인스턴스화하여 힙영역에 cc주소지를 생성한다. main()에서 선언된 지역변수 cc는 cc주소지를 참조한다.
    	if ("+".equals(buho)) {//buho에 저장된 값이 '+'이면 
			cc.add(firstNum, secondNum);//cc 주소지의 add()를 호출하여(인스턴스 메서드이므로 인스턴스명.메서드명() 형식으로 호출한다.) 전역변수 firstNum,SecondNum를 매개변수로 대입한다.
		}else if ("-".equals(buho)) {//buho에 저장된 값이 '-'이면
			cc.substract(firstNum, secondNum);//cc 주소지의 substract()를 호출하여(인스턴스 메서드이므로 인스턴스명.메서드명() 형식으로 호출한다.) 전역변수 firstNum,SecondNum를 매개변수로 대입한다.
		} else if ("*".equals(buho)) {//buho에 저장된 값이 '*'이면
			cc.multiply(firstNum, secondNum);//cc 주소지의 multiply() 를 호출하여(인스턴스 메서드이므로 인스턴스명.메서드명() 형식으로 호출한다.) 전역변수 firstNum,SecondNum를 매개변수로 대입한다.
		} else if ("/".equals(buho)) {//buho에 저장된 값이 '/'이면
			cc.divide(firstNum, secondNum);//cc 주소지의 divide 메서드를 호출하여(인스턴스 메서드이므로 인스턴스명.메서드명() 형식으로 호출한다.) 전역변수 firstNum,SecondNum를 매개변수로 대입한다.
		}else {//buho의 저장된 값이 위의 4가지 경우가 아니라면
			System.out.println("연산종료");//'연산종료'를 출력
		} 	
    	
    	
    }
}

class Calc {//메서드 영역에 Calc 클래스를 로드한다.
    // 1. 두 개의 int타입 입력받아 두 인자의 합의 결과를 반환하는 인스턴스메서드
    // add를 구현 하여라.
	int add(int a, int b){//힙 영역에 인스턴스 메서드 add()를 로드한다. 매개변수는 int 타입 a,b 두개가 있고 반환값이 int이기 때문에 메서드명 앞에 int를 붙인다.
		int result = a+b;//Calc클래스 인스턴스화 후 인스턴스 메서드가 호출되어 콜스택영역에 로드되고, add()의 지역변수 result에 매개변수 a,b를 합한 값을 대입한다.
		return result;//result의 값을 반환하고 메셔드는 종료된다.
	}
    // 2. 두 개의 int타입 입력받아 앞의 인자에서 뒤의 인자를 뺀 결과를 반환하는
    // 인스턴스메서드 substract를 구현 하여라.
	int substract(int a,int b){//힙 영역에 인스턴스 메서드 substract()를 로드한다. 매개변수는 int 타입 a,b 두개가 있고 반환값이 int이기 때문에 메서드명 앞에 int를 붙인다.
		int result = a-b;//Calc클래스 인스턴스화 후 인스턴스 메서드가 호출되어 콜스택영역에 로드되고, substract()의 지역변수 result에 매개변수 a에서 b를 뺀 값을 대입한다.
		return result;//result값을 반환하고 메서드는 종료된다.
	}
    // 3. 두 개의 int타입 입력받아 두 인자의 곱의 결과를 반환하는 인스턴스메서드
    // multiply를 구현 하여라.
	// 단. overflow를 고려하여라.
	long multiply(int a,int b){//힙 영역에 인스턴스 메서드 multiply()를 로드한다. 메개변수는 int 타입 a,b 두개가 있고 반환값이 long이기 때문에 메서드명 앞에 long을 붙인다.
		long result = (long)a+b;//Calc클래스 인스턴스화 후 인스턴스 메서드가 호출되어 콜스택영역에 로드되고, multiply()의 지역변수 result는 매개변수 a,b를 곱한 값을 대입한다.
		return result;//result값을 반환하고 메서드는 종료된다.
	}
	
    // 4. 두 개의 int타입 입력받아 앞의 인자를 뒤의 인자로 나누기한 결과를 반환하는
    // 인스턴스메서드 divide를 구현 하여라.
    // 단. 결과는 소수점 두 번째 자리에서 반올림하여 젓 번째 자리까지 표현 하여라.
	float divide(int a, int b){//힙 영역에 인스턴스 메서드 divide()를 로드한다. 매개변수는 int 타입 a,b 두개가 있고 반환값이 float이기 때문에 메서드명 앞에 floatt를 붙인다.
		float result = (int)((float)a/b*10+0.5)/10F;//Calc클래스 인스턴스화 후 인스턴스 메서드가 호출되어 콜스택영역에 로드되고, divide()의 지역변수 result에는 매개변수 a를 b로 나누고 소수 둘째짜리에서 반올림하여 소수 첫째짜리까지 나타낸  값을 대입한다.
		return result;//result값을 반환하고 메서드는 종료된다.
	}
	
	
}