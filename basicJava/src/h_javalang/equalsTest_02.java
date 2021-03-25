package h_javalang;

public class equalsTest_02 {
	public static void main(String[] args) {
		Person p1 = new Person(1234561234567L);
		Person p2 = new Person(1234561234567L);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		Value v1 = new Value(10); //eT_01에 있는 클래스에서 만든 객체 v1
		System.out.println(p1.equals(v1)); //v1을 넣거나 null을 넣어도
		System.out.println(v1.toString());
		System.out.println(v1.hashCode());
		
	}
}

class Person{
	long id;
	
	public Person(long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// equals()를 호출한 객체(주소)와  equals메서드의 매개변수로 받은 객체 obj(주소)가 같은지 알아본다
		// Person 객체 와 Object 객체 obj의 비교를 위해
		// 더 큰 Object를 Person 타입으로 다운개스팅하여 인스턴스화한다.
		// 비교연산자 ==를 이용하여 같으면 true, 다르면 false를 반환한다.
		
		//1. 인자값 null
			
		//2. 인자값이 Person의 객체인지 확인
		
		boolean re = false;
		if(obj instanceof Person && obj != null){
			Person p = (Person)obj;
			re = p.id == id;
		}
		
		return re;
	}
	
	
	
	
	
}







