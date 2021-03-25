package ex;

public class Ex3_2 {//Ex3_2 클래스를 메서드 영역에 로드하며 클래스 메서드인 main()도 같이 로드한다.
    public static void main(String[] args) {//클래스 메서드인 main()을 호출하여 콜스택 영역에 로드한다.
        //Tv인스턴스를 참조하기 위한 변수 t를 선언
    	Tv t ;
    	
        //Tv인스턴스를 생성 후 참조변수 t에 저장
    	t = new Tv();
    	
        //Tv인스턴스의 멤버변수 channel의 값을 7로 변경
    	t.channel = 7;
        //Tv인스턴스의 메서드 channelDown()를 호출
        t.channelDown();
        
        System.out.println("현재 채널은 " + t.channel + "입니다.");
    }
}

class Tv {//메서드 영역에 Tv 클래스를 로드한다. 클래스변수와 클래스 인스턴스는 없다.
	//String형 인스턴스 변수 color 선언
	String color; //인스턴스 변수로 힙영역에 로드될때 기본값 null로 초기화된다. 
	
	//boolean형 인스턴스 변수 power 선언
	boolean power;//인스턴스 변수로 힙영역에 로드될때 기본값 false로 초기화된다. 
	
	//int형 인스턴스 변수 channel 선언
	int channel;//인스턴스 변수로 힙영역에 로드될때 기본값 0으로 초기화된다.

    void power() { // 전원을 켜고 끄는 메서드 // 인스턴스 메서드로 힙영역에 로드된다.
        power = !power;//인스턴스변수 power 값 의 부정을 power에 대입한다.
    }//}를 만나 메서드가 종료된다.

    void channelUp() { // 채널을 하나 증가시키는 메서드 // 인스턴스 메서드로 힙영역에 로드된다.
        channel++; //인스턴스 변수 channel의 값에 1을 더한다.
    }//}를 만나 메서드가 종료된다.

    void channelDown() { // 채널을 하나 감소시키는 메서드 // 인스턴스 메서드로 힙영역에 로드된다.
        channel--; //인스턴스 변수 channel의 값에서 1을 뺀다.
    }//}를 만나 메서드가 종료된다.
}
