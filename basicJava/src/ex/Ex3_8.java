package ex;

class TestData_1 {//class 타입의 TestData_1가 메서드영역에 로드될때 클래스변수, 클래스 메서드가 없으므로 같이 로드되지 않는다.
	int value;//TestData_1 클래스 인스턴스화 후 호출되어 콜스택에 로드되면, 인스턴스 변수 value를 기본값인 0으로 초기화하여 로드된다.
}

class TestData_2 {//class 타입의 TestData_2
	int value;//TestData_2 클래스 인스턴스화 시, 인스턴스 변수 value를 기본값인 0으로 초기화하여 로드된다.

	TestData_2(int x) {//TestData_2 클래스 내에 존재하는 인스턴스 메서드로 int 타입 매개변수 x를 가진다.
		value = x;// 인스턴스 메서드인 TestData_2() 인스턴스화 후, 호출되어 콜스택에 로드되면 지역변수 value에 매개변수 x를 대입한다. 
	}//중괄호를 만나 메서드 종료
}

public class Ex3_8 {//class 타입의 Ex3_8가 public으로 선언되었으므로 가장 먼저 메서드 영역에 로드된다. 클래스 변수는 없으며, 클래스 메서드인 main()이 같이 로드된다.
	public static void main(String[] args){ //클래스 메서드인 main()이 호출되어 콜스택에 로드된다.
		TestData_1 td1 = new TestData_1();//TestData_1 클래스를 메서드 영역에 로드한다. 로드 후 참조변수 td1으로 인스턴스화하여 힙영역에 td1 주소지를 생성한다. main() 내 지역변수로 선언된 td1은 힙영역의 td1주소지를 참조한다.
										  
		TestData_2 td2 = new TestData_2(3); // 컴파일 에러 //TestData_2 클래스를 메서드영역에 로드하고 참조변수 td2로 인스턴스화하여 힙영역에 td2주소지를 생성한다.main() 내 지역변수로 선언된 td2은 힙영역의 td1주소지를 참조한다.
											//위와 달리 class TestData_2의 TestData_2(int x) 메서드를 호출한 것이다. 콜스택에 TestData_2(int x)가 로드되어야 하는데 매개변수 값을 주지않아 오류가 났다.
											//정상적으로 실행되면 TestData_2(3)이 콜스택 영역에 호출되어 TestData_2의 전역변수 value에 매개변수 값으로 받은 3을 대입하고 메서드가 종료되어 콜스택을 떠난다.
	}
}