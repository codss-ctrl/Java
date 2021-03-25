package ex;


class Car {//메서드 영역에 로드된다. 클래스변수와 클래스 인스턴스는 없다.
	//String 형식의 변수 color 선언
	String color;//인스턴스 변수로 힙영역에 로드될때 기본값 null로 초기화된다. 
	
	//String 형식의 변수 gearType 선언
	String gearType;//인스턴스 변수로 힙영역에 로드될때 기본값 null로 초기화된다. 

	//int 형식의 변수 door 선언
	int door;//인스턴스 변수로 힙영역에 로드될때 기본값 0으로 초기화된다.

	Car() {// 인스턴스 메서드로 힙영역에 로드된다.
		//String, String, int형의 매개변수를 사용하는 생성자를 이용하여
		//"black", "stick", 4로 값 초기화
		 this("black", "stick", 4);
	}//}를 만나 메서드가 종료된다.

	Car(String color) {
		//매개변수가 없는 기본 생성자 호출
		 this();
		
		//인스턴스의 color를 인자로 전달받은 color로 변경
		 this.color = color;
	}//}를 만나 메서드가 종료된다.

	Car(String color, String gearType, int door) {
		//인스턴스의 color를 인자로 전달받은 color로 변경
		 this.color = color;
		
		//인스턴스의 gearType를 인자로 전달받은 gearType로 변경
		 this.gearType = gearType;
		
		//인스턴스의 door를 인자로 전달받은 door로 변경
		 this.door = door;
		
	}//}를 만나 메서드가 종료된다.
}

public class Ex3_10 {
	public static void main(String[] args) {
		//Car인스턴스를 참조하기 위한 변수 c1 선언 및 Car인스턴스를 생성 후 저장
		 Car c1 = new Car(); // 기본차량
		
		//Car인스턴스를 참조하기 위한 변수 c2을 선언 및 "red"를 인자로 전달하여 Car인스턴스를 생성 후 저장
		
		 Car c2 = new Car("red"); // 색상을 red로 변경한 차량
		//Car인스턴스를 참조하기 위한 변수 c3을 선언 및 "blue", "auto", 2를 인자로 전달하여 Car인스턴스를 생성 후 저장
		 Car c3 = new Car("blue", "auto", 2);
		
		System.out.println("기본차량");
		System.out.println("\t차량색상 : " + c1.color + ", 기어타입 : " + c1.gearType
				+ ", 문의 개수 : " + c1.door);
		System.out.println("색상변경 차량");
		System.out.println("\t차량색상 : " + c2.color + ", 기어타입 : " + c2.gearType
				+ ", 문의 개수 : " + c2.door);
		System.out.println("풀옵션 차량");
		System.out.println("\t차량색상 : " + c3.color + ", 기어타입 : " + c3.gearType
				+ ", 문의 개수 : " + c3.door);
	}
}