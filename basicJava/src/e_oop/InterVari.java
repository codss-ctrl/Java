package e_oop;

class Data{
	int x;
}
public class InterVari {
	public static void main(String[] args) {
		//1. Data 클래스의 객체를 만들어 주세요. - d1
		Data d1 = new Data();
		//2. d1의 x값을 10으로 변경해주세요
		d1.x = 10;
		//3. d1의 x값을 출력해주세요 -> main() 기본형 : x
		System.out.println("main() 기본형 : "+d1.x); //호출 전이기 때문에 d1주소에서 x=10
		//4. change 메서드를 호출해 주세요 인자값으로 d1의 x값을 주세요
		InterVari.change(d1.x); //change(int x) 호출해서 메서드의 지역변수x가 10으로 바뀌고 출력됨
		//4.5. d1의 x값을 출력해주세요 -> change() 기본형 :x
		System.out.println("change() 기본형 : "+d1.x); //호출 전이기 때문에 d1주소에서 x 
		//5. Data 클래스의 객체를 만들어 주세요. - d2
		Data d2 = new Data(); 
		//6. d2의 x값을 10으로 변경해주세요. // d2 주소의 인스턴스 변수 값 변경
		d2.x = 10;
		//7. d2의 x값을 출력해주세요 -> main() 참조형 : x
		System.out.println("main() 참조형 : "+d2.x); // 메서드 호출 전이기 때문에 d2주소에서 x=10
		//8. change 메서드를 호출해 주세요 인자값으로 d2의 x값을 주세요
		InterVari.change(d2); // 
		//.8.5 d2의 x값을 출력해주세요 => change() 참조형 : x //메서드 호출 안했으므로 d2주소의 인스턴스 변수 x=10
		System.out.println("change() 참조형 : "+d2.x);		
		
		
	}
	static void change(int x){
		x =1000;
		System.out.println(x);
	}
	static void change(Data d1){ //int 형 매개변수 받지 못함
		d1.x = 1000;
		System.out.println(d1.x);
	}
	
}


















