package f_oop2;

public class SingleTest_01 {
	public static void main(String[] args) {
		Singleton st = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		System.out.println(st);
		System.out.println(st2);
	}
}

class Singleton{
	static Singleton st;
	private Singleton() {
		
	}
	
	/**
	 * Singleton의 객체를 반환하기 위한 메서드
	 * @return Singletondml 객체
	 * @since 2021.01.14
	 * @author PC25
	 */
	
	static Singleton getInstance(){
		if (st ==null) {
			st = new Singleton();//객체 생성 1회로 제한
		}
		return st;
	}
}


















