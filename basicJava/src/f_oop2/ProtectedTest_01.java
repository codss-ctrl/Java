package f_oop2;

public class ProtectedTest_01 {
	private int a = 10; 
	int b = 20; // 접근제어자가 없다면 default가 생략되어있음
	protected int c = 30; public int d = 40;
	
	int getA(){ // 인스턴스 변수 a에 접근하기 위한 메서드
	 return a;
	}
}
