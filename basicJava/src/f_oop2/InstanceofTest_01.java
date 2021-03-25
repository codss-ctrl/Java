package f_oop2;

public class InstanceofTest_01 {
	public static void main(String[] args) {
		FireCar fc = new FireCar();
		
		if (fc instanceof FireCar) {
			System.out.println("fc는 FireCar의 인스턴스이다.");
			FireCar ff = fc;
		}
		if (fc instanceof Car) {
			System.out.println("fc는 Car의 인스턴스이다.");
			Car c = fc;
//			Car c = (Car)fc;
		}
		if (fc instanceof Object) {
			System.out.println("fc는 Object의 인스턴스이다.");
			Object o = fc;
		}
		
		Car c = new Car();
		
		if (c instanceof FireCar) {
			System.out.println("c는 FireCar의 인스턴스이다.");
			FireCar ff = (FireCar)c;//문법으로는 맞으나 불가능
		}
		
		Car cc = new FireCar();//부모 타입의 참조변수로 자식 타입의 인스턴스를 참조할 수 있다.
		
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.stop();
		cc.drive();//인스턴스메서드 오버라이드로 자식 것이 우선
		
	}
}

class Car{
	static int a = 20;
	int b = 30;
	
	static void stop(){
		System.out.println("끼익~!");
	}
	void drive(){
		System.out.println("부릉~!");
	}
	
}

class FireCar extends Car{
	static int a = 50;
	int b = 70;
	
	static void stop(){
		System.out.println("소방차 끼익~!");
	}
	void drive(){
		System.out.println("소방차 부릉~!");
	}
}