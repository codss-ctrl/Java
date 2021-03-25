package h_javalang;

public class WrapperTest_01 {

	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));//Integer 객체의 값만 비교한다. Integer 는 equals()가 오버라이드되어있다.
		System.out.println(i1);//toString() 오버라이드
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);//모두 대문자 -> 상수
		
		System.out.println(Integer.SIZE);//int 비트 수
		
		//JDK1.8
		// Integer.BYTES
		
		Integer[] i3 = new Integer[3];
		i3[0] = new Integer(10);
		i3[1] = new Integer(20);
		i3[2] = 30;//auto-boxing -> 자동
		
		int i6 = i3[1];//unBoxing -> 자동
		
		Object[] obj = new Object[1];
		obj[0] = new Integer(10); //인티저를 오브젝트 타입으로 업캐스팅
		obj[0] = 10;
		
		int o2 = (int)obj[0]; //2단 다운캐스팅도 자동
		
		
		
		
		
		
	}

}
