package z_exam;

public class TotalTest {
	//클래스 타입인 TotalTest가 Method Area에 로드 되면서 클래스 친구들인 클래스 메소드 main()가 같이 로드된다. 
	
	public static void main(String[] args) {
		 
		TvMaker.color = "Blue"; 
//		Method Area에 TvMaker 클래스가 로드 되며 TvMaker 내의 클래스친구들과 인스턴스친구들이 같이 로드 된다.
//		Method Area에는 TvMAker 클래스와 클래스 변수인 color가 null로 초기화되어 로드되고, inch는 0으로 초기화되어
//		 로드된다. 
//		Heap 영역에는 인스턴스 친구들인 name이 " "로 초기화되어 로드되고, age가 0으로 초기화되어 로드된다.
//		또한 TvMaker()인스턴스 메서드와 TvMaker(String, int)가 함께 로드된다.
//		TvMaker 클래스 로드 후 클래스 변수인 color에 "Blue"라는 값을 대입한다.
		TvMaker tm = new TvMaker();
//		TvMaker 클래스 내의 main() 지역변수인 tm을 인스턴스로 선언하고 힙영역의 tm주소지에서 인스턴스메서드인
//		TvMaker()를 호출한다.이 TvMaker()메서드는 매개변수를 갖지 않으며 tm 주소지의 name을 "man"으로,
//		age는 25로 변경하고 메서드를 종료한다.
		tm.age = 30; //
//		객체화 되어 있는 tm주소지의 age 변수를 30으로 변경한다.
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);
		TvControll.volumeDown();
		System.out.println(TvControll.channel);
//		print 메서드가 콜스택 영역에 호출되며 먼저 TvControll 클래스를 로드한다. 
//		Method Area 영역에  TvControll 클래스와 함께  클래스 친구들인 
//		클래스 변수 MAX_CHANNEL가 50으로 초기화되어 로드되고,
//		MIN_CHANNEL 가 1로 초기화되어 로드되며,
//		channel 이 15로 초기화되며 로드된다.;
//		또한 클래스 메서드인 volumeDown()이 같이 로드된다.
		
//		힙영역에는 인스턴스 변수인 MAX_VOLUME 이 100으로 초기화되어 로드되고
//		MIN_VOLUME가 0으로 초기화되어 로드,volume이 99로 초기화되어 로드된다.
//		인스턴스 메서드인 volumeUp()도 함께 로드된다.
		
//		로드된 클래스의 클래스 변수인 channel을 출력하면 15가 console에 입력된다.
//		println()메서드는 콜스택 영역에서 지워진다.
		
//		TvControll 클래스의 클래스메서드인 volumeDown()을 호출하였으므로 
//		콜스택 영역에 volumeDown()이 호출되며, 이 메서드는 매개변수를 갖지 않는다.
//		volumeDown() 메서드는 channel의 값이 MAX_CHANNEL 값과 같으면 
//		channel = MIN_CHANNEL 를 수행하고,
//		그렇지 않으면 channel++을 수행하고 channel의 값을 리턴한다.
//		channel은 15, MAX_CHANNEL은 50으로 두 변수의 값이 다르므로 channel++를 수행하여 channel변수의
//		값을 16으로 바꾸고, 이 값을 리턴하고 메서드는 종료된다.
		
//		TvControll 클래스의 클래스변수  channel의 값을 print하는 메서드가 호출되어 console에 16이 입력된다.
//		println()메서드는 콜스택 영역을 빠져나온다.
		// 3.2
		TvControll tc; // TvControll 클래스의 tc 참조변수를 선언한다.
		tc = new TvControll(); //인스턴스 영역에 tc주소지를 인스턴스화하고, tc는 인스턴스 영역의 tc주소지를 참조한다.
		System.out.println(tc.volume);
//		tc주소지의 volume의 값을 출력한다. console에 99가 입력된다.
		tc.volumeUp();
//		tc주소지의 volumeUp() 를 호출하여 콜스택에 volumeUp()메서드가 로드되고
//		매개변수는 갖지않으며 이 메서드는 volume의 값이 MAX_VOLUME 값과 같으면 
//		volume = MIN_VOLUME 를 수행하고,
//		그렇지 않으면 volume++을 수행하고volume의 값을 리턴한다.
//		tc주소지의 volume의 값은 99이고, MAX_VOLUME은 100으로 두 값이 같이 않으므로 volume++를 수행하여
//		volume의 값을 100으로 변환한뒤 메서드는 콜스택 영역을 빠져나온다.
		
		
	
		System.out.println(tc.volume);
//		tc주소지의 인스턴스 변수 volume의 값을 출력한다.console에 100이 입력된다.
		tc.volumeUp();
//		tc주소지의 인스턴스 메서드인 volumeUp()을 호출하여 콜스택에 volumeUp() 메서드가 로드된다. 
//		이 메 같으면 
//		volume = MIN_VOLUME서드는 매개변수가 없으며,이 메서드는 volume의 값이 MAX_VOLUME 값과 를 수행하고,
//		그렇지 않으면 volume++을 수행하고volume의 값을 리턴한다.
//		volume의 값은 100, MAX_VOLUME의값이 100으로 두 값이 같으므로 volume = MIN_VOLUME 을 수행하여
//		volume에 MIN_VOLUME의 값인 0을 대입한다. volume의 값을 반환하며 메서드는 종료되고 volumeUp()은
//		콜스택을 빠져나온다.
		System.out.println(tc.volume);
//		tc주소지의 인스턴스 변수 volume의 값을 출력한다.console에 0이 입력된다.		
//
		Calc cc = new Calc();
//		Calc 클래스를 로드한다. Calc 클래스 내에 클래스변수와 클래스 메서드는 없으므로
//		Method Area 영역에 Calc 클래스만이 로드된다. 
//		힙영역에는 인스턴스 변수인 add(int , int ),
//		add(long , int ) ,
//		minus(int , int )가
//		로드된다.
		
//		로드된 클래스를 참조변수 cc로 객체화를 선언하여 참조변수 cc는
//		힙영역의 cc주소지를 참조한다.
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
//		cc주소지의 add(int , int) 메서드가 매개변수에 
//		Integer.MAX_VALUE, 4를 인자로 받으며 콜스택에 로드된다.
//		이 메서드는 인자값 두개를 더한 값을 반환하며 종료되므로 104를 반환하며 메서드는 종료되어 콜스택을 나온다.
//		출력하면 console에는 104가 입력된다.
//		오버플로우
		System.out.println(cc.add(3L, Integer.MAX_VALUE));
//		cc주소지의 add(long , int) 메서드가 매개변수에 
//		3L, Integer.MAX_VALUE를 인자로 받으며 콜스택에 로드된다.
//		이 메서드는 인자값 두개를 더한 값을 반환하며 종료.
		
//		오버플로우
	}
}

class TvMaker {
	// 1.
	// 1.1
	static String color;
	static int inch;
	// 1.2
	String name = "";
	int age;

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);
	}

	// 2.2
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 50;
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}