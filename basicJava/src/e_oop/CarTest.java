package e_oop;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("white","auto",4);
		Car c3 = new Car("auto");
		Car c4 = new Car("red","auto");
		System.out.println(c3.door);
	}
}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		color = "black";
		gearType = "stick";
		door = 4;
	}
	Car(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door =door;
	}
	Car(String gearType){
		this(); //이건 무조건 첫줄에 옴
		this.gearType = gearType;
	}
	Car(String color, String gearType){
		this();
		this.color = color;
		this.gearType = gearType;
	}
}


