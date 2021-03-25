package ex;

import ex.Ex;

public class Ex3_5 {//클래스 Ex3_5를 메서드 영역에 로드하며 클래스 메서드인 main()을 같이 로드한다. 클래스 변수는 없다.
	public static void main(String[] args) {//클래스 메서드인 main()을 호출하여 콜스택 영역에 로드한다.
		//클래스 메서드 classMethod()를 호출하며 인자로 5를 전달
		Ex.classMethod(5);//클래스 메서드를 호출하기 위해 '클래스명.메서드명()'형식으로 Ex.classMethod(5)를 호출하여 콜스택에 인자값 5를 대입하여 로드한다. 메서드의 처리에 따라 입력된 값은 a(인자값) 이다. 를 출력한다. 메서드는 종료되어 콜스택을 빠져나온다.
		//Ex인스턴스를 참조하기 위한 변수 e를 선언하고 Ex인스턴스를 생성 후 저장
		Ex e = new Ex();//Ex 클래스를 참조변수 e로 인스턴스화하여 힙영역에 e주소지를 생성한다. main()에 선언된 지역변수 e는 e주소지를 참조한다.
		//반환값을 저장할 int형 변수 re를 선언하고 인자로 5, 8을 Ex인스턴스의 instanceMethod() 메서드에 전달하고 반환값을 저장
		int re = e.instanceMethod(5, 7);//반환값이 있기 때문에 반환타입과 일치하는 변수에 저장하기위해 int 타입 변수 re를 main()의 지역변수로 선언하였으며 인스턴스메서드인 instanceMethod(int, int) '참조변수명.메서드명()'으로 호출한다. 콜스택 영역에 인자값 5,7을 대입하여 로드된 뒤, 메서드 내 지역변수 result에 인자값 5와 7의 곱인 35가 저장된다. 결과값을 반환하고 메서드는 종료되어 콜스택을 빠져나온다.
		
		System.out.println(re); // 5와 7의 곱인 35를 출력
	}
}

class Ex {//Ex 클래스를 메서드 영역에 로드하면서 클래스 메서드인 classMethod를 함께 로드한다.
	static void classMethod(int a) {//static이 붙은 클래스 메서드로 매개변수는 int 타입 a 하나를 갖고 반환값이 없으므로 반환타입을 적지않고 void를 적었다.
		System.out.println("입력된 값은 " + a + "이다.");//입력된 값은 a(인자값) 이다. 를 출력한다.
	}//}를 만나 메서드가 종료된다.

	int instanceMethod(int a, int b) {//힙영역에 로드되는 인스턴스 메서드로 매개변수는 int 타입 a,b 두개를 갖고 반환값이 int 이므로 반환타입은 int를 적는다.
		//int형 변수 result를 생성하여 a와 b를 곱한 값을 저장
		int result = a * b;//지역변수 result에 인자값으로 받은 a와 b의 곱을 대입한다. int끼리의 곱셈으로 결과값은 int 타입이다.
		
		//result를 반환
		return result;//값을 반환하고 메서드가 종료된다.
	}
}