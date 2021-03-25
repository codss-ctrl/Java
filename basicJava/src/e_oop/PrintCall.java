package e_oop;

public class PrintCall {
	public static void main(String[] args) {
		
		//7. 3번의 add메서드를 호출하여라.
		int result = MyAdd.add(1);
		System.out.println(result);
		//8. 4번의 add메서드를 호출하여라.
		MyAdd m = new MyAdd();
		int res =m.add(10, 45);
		System.out.println(res);
		//9. 5번의 add메서드를 호출하여라.
		long re = m.add(10, 50L);
		System.out.println(re);
		//10. 6번의 add메서드를 호출하여라	
		float r = m.add('a', 50.23F);
		System.out.println(r);
		//11. 8번 add
		float r1 = m.add(4, 85L, 52.3F);
		System.out.println(r1);
		//12. 7번 add
		long r2 = m.add2(50, 89) ;
		System.out.println(r2);
		
	}
}
class MyAdd{
	//1. 클래스변수 a를 선언하고 20의 값으로 초기화 하여라.
	static int a = 20;
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.
	int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a와 합을 반환하는 클래스메서드를 add를 작성
	// 하여라.//a 사용가능, 인스턴스  b 사용불가
	static int add(int b){
		int result = a + b;
		return result;
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드를 add를
	// 작성 하여라.//다 사용 가능
	
	int add(int c, int d){
		int result = c + d;
		return result;
	}
	//5. int타입, long타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라. // 다 사용가능
	long add(int a, long b){
		long result = a + b;
		return result;
	}
	//6 char타입, float타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스
	// 메서드 add를 작성 하여라.	//다 사용가능
	float add(char a, float b){
		float result = a + b;
		return result;
	}
	//추가문제 
	//7. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 반환 타입이 long인
	//	인스턴스메서드 add를 작성하여라	
	// 메서드명은 같은데 매개변수 개수,타입이 같기 때문에 오버로딩 불가
	// long타입으로 자동형변환됨
	long add2(int a, int b){
		int result = a + b;
		return result;
	}
	//8. int,long,float타입 각 한개의 매개변수, 
	// 매개변수의 합을 반환하는 클래스메서드 add 작성
	// class 내용물 쓰지 않기 때문에 인스턴스로 쓰는게 나음
	// 메서드명 같고 매개변수 개수 다름
	float add(int a, long b, float c){
		float result = a + b + c;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
}