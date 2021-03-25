package h_javalang;

public class StringTest_01 {//클래스 로드 뒤 동시에 문자열 리터럴 로드
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";//문자열 리터럴만 heap에 자동으로 로드.리터럴 같으면 같은 주소 참조
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3 == str4);//
		System.out.println(str3.equals(str4));//값을 비교 -> String 클래스는 equals()가 오버라이드되어있다.
		
	
	
	}
}
