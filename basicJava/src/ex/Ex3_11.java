package ex;


class Init {//메서드 영역에 Init 클래스를 로드하며 클래스 변수 action과 클래스 메서드 Init(int)를 로드한다.  
	//int형 클래스 변수 action 선언
	static int action;//static 붙었으므로 클래스 변수로 메서드영역에 로드된다.
	
	//int형 인스턴스 변수 action2 선언하고 5로 초기화
	 int action2 = 5;//힙영역에 로드되는 인스턴스 변수
	
    static { // 클래스 초기화 블럭//생성자가 호출되기 직전에 초기화 블럭이 호출된다.
    	//action에 4 대입
    	action = 4;// 인스턴스 초기화 블럭//생성자가 호출되기 직전에 초기화 블럭이 호출된다.
        				//인스턴스 변수 action2의 값을 4로 초기화한다.
    }
    { // 인스턴스 초기화 블럭
        //action2에 4 대입
    	action2 = 4;
    }

    Init() {//힙영역에 로드되는 스턴스 메서드로 매개변수는 없으며 반환값이 없으므로 반환타입을 적지않고 void도 생략하였다. 
    	//action2에 7 대입
    	action2 = 7;
    }//}를 만나 메서드가 종료된다.

    Init(int action2) {//힙영역에 로드되는 스턴스 메서드로 매개변수는 int타입 action2 하나이며  반환값이 없으므로 반환타입을 적지않고 void도 생략하였다. 
        //매개변수가 없는 생성자 호출
    	this();//재귀호출로 Init()를 호출하여 콜스택에 로드하고 
    	
    	//인스턴스변수 action2에 전달받은 인자 action2 대입
    	this.action2 = action2;//Init()의 지역변수 action2의 값에 매개변수로 받은 action2의 값을 대입한다.
    }//}를 만나 메서드가 종료된다.
}

public class Ex3_11 {//파일명과 같은 Ex3_11 클래스가 먼저 메서드 영역에 로드된다. 클래스 메서드 main()과 함께 로드된다. 클래스 변수는 없다.
    public static void main(String[] args) {//main()이 호출되어 콜스택에 로드된다.
    	//Init인스턴스를 참조하기 위한 변수 init를 선언 및 9를 인자로 전달하여 Init 인스턴스 생성 후 저장
    	Init init = new Init(9);// Init 클래스를 참조변수 init으로 인스턴스화하여 힙영역에 init주소지를 생성한다. main() 내에 선언된 지역변수 init은 init주소지를 참조한다.Init(int)를 호출하여 인자값으로 9를 대입하고 콜스택에 로드한다.재귀호출로 Init()를 호출하여 콜스택에 로드하고, 지역변수 action2에 인자로 받은 action2의 값을 대입한다. 메서드가 종료되고 콜스택을 나온다.
    }
}