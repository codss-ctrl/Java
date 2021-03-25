package qu;

public class Qu3_8 {//메소드 영역에 Qu3_8 클래스를 로드하면서 클래스 메서드인 main()를 함께 로드한다.
	public static void main(String[] args) {//클래스 메서드인 main()를 호출하고 콜스택에 로드한다.
		//7. 3번의 add메서드를 호출하여라.
		MyAdd.add(1);//MyAdd 클래스를 메서드 영역에 로드하고 클래스 메서드인 add(int)를 호출하여 매개변수 c에 1을 대입하여 콜스택에 로드한다. add(int) 의 지역변수 result에 클래스변수 a와 매개변수 c의 값 1을 더하여 대입한다. 값을 반환하고 메서드는 종료되어 콜스택을 나온다.
		//8. 4번의 add메서드를 호출하여라.
		MyAdd my = new MyAdd(); //Myadd 클래스를 참조변수 my로 인스턴스화하여 힙영역에 my주소지를 생성한다. main()의 지역변수로 선언된 my는 my 주소지를 참조한다.
		my.add(1, 1);//my 주소지의 add(int,int)메서드를 호출하고 인자값을 1,1을 대입하여 콜스택에 로드한다.add(int,int)의 지역변수 result에 인자값 1과 1의 합을 대입한다. 값을 반환하고 메서드는 종료된다. 
		//9. 5번의 add메서드를 호출하여라.
		my.add(1, 1L);//my주소지의 add(int,long)메서드를 호출하고 인자값을 1,1L을 대입하여 콜스택에 로드한다. add(int,long)의 지역변수 result에 인자값 1과 1L을 더한값을 대입한다. int타입과 long타입을 더하면서 오버플로우가 발생하여 최종값은 long값이 된다. 값을 반환하고 메서드는 종료되어 콜스택을 나온다.
		//10. 6번의 add메서드를 호출하여라.
		my.add('a', 1F);//my주소지의 add(char,float)메서드를 호출하고 인자값을 'a',1F을 대입하여 콜스택에 로드한다. add(char,float)의 지역변수 result에 인자값 'a'와 1F를 더한값을 대입한다. char타입과 float타입을 더하면서 오버플로우가 발생하여 최종값은 float타입이 된다. 값을 반환하고 메서드는 종료되어 콜스택을 나온다.
	}
}

class MyAdd {//MyAdd클래스가 메서드 영역에 로드된다.
	//1. 클래스변수 a를 선언하고 20의 값으로 초기화 하여라.
	static int a = 20;//MyAdd 클래스가 메서드 영역에 로드되면서 클래스 변수 a가 20으로 초기화되어 함께 로드된다.
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.
	int b = 15;//힙 영역에 인스턴스 변수 b가 15로 초기화되어 로드된다.
	//3. int타입의 매개변수가 하나이며 변수 a와 합을 반환하는 클래스메서드를 add를 작성
	// 하여라.
	static int add(int c){//MyAdd 클래스가 메서드 영역에 로드되면서 클래스 메서드 add(int)가 함께 로드된다.매개변수는 int 타입 c 하나이며 반환타입이 int이므로 메서드명 앞에 int를 적는다.
		int result = a + c;// 호출 되어 콜스택에 인자값과 함께 로드되면 지역변수 result에 클래스변수 a의 값과 인자값 c의 합을 대입한다.
		return result;//값을 반환하고 메서드는 종료된다.
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드를 add를
	// 작성 하여라.
	int add(int a, int b){//힙영역에 인스턴스 메서드 add(int,int)가 로드된다.매개변수는 int 타입 a,b 두개이며 반환타입이 int이므로 메서드명 앞에 int를 적는다.
		int result = a+b;//MyAdd 클래스 인스턴스화 후 호출되어 콜스택에 인자값과 함께 로드 되면 지역변수 result에 매개변수 인자값 a와 b의 합을 대입한다. 
		return result;//값을 반환하고 메서드는 종료된다.
	}
	//5. int타입, long타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라.
	long add(int a,long b){//힙영역에 인스턴스 메서드 add(int,long)가 로드된다.매개변수는 int 타입 a,long 타입 b 두개이며 반환타입이 long이므로 메서드명 앞에 long을 적는다.
		long result = a+b;////MyAdd 클래스 인스턴스화 후 호출되어 콜스택에 인자값과 함께 로드 되면 지역변수 result에 매개변수 인자값 a와 b의 합을 대입한다. int 타입과 long타입의 합에서 오버플로우가 발생해 result값은 long타입이 된다.
		return result;//값을 반환하고 메서드는 종료된다.
	}
	//6 char타입, float타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라.
	float add(char a, float b){//힙영역에 인스턴스 메서드 add(char,float)가 로드된다.매개변수는 char 타입 a,float 타입 b 두개이며 반환타입이 float이므로 메서드명 앞에 float을 적는다.
		float result = a+b;////MyAdd 클래스 인스턴스화 후 호출되어 콜스택에 인자값과 함께 로드 되면 지역변수 result에 매개변수 인자값 a와 b의 합을 대입한다. char  타입과 float타입의 합에서 오버플로우가 발생해 result값은 float이 된다.
		return result;//값을 반환하고 메서드는 종료된다.
	}
	
	
	
}