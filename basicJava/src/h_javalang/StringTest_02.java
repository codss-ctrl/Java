package h_javalang;

import java.util.Arrays;

public class StringTest_02 {
	public static void main(String[] args) {
		//char charAt(int index) : 문자열에서 지정된 index번째 문자 하나를 돌려준다.
		String s = "Hello";
		char ch = s.charAt(2);
		System.out.println(ch);
		
		//oracle 에서도 사용되는 것
		//String concat(String str) : 기존 문자열에 새로운 문자열을 덧붙인다.
		String s2 = s.concat(" JQuery");
		System.out.println(s2);
		
		//boolean contains(String str) : 기존 문자열이 해당 문자열을 포함하고 있는지 확인한다.
		boolean s3 = s2.contains("JQ");
		System.out.println(s3);
		
		//확장자 처리에 필요한것
		//boolean endswith(String str) : 문자열이 str로 끝나는지 확인한다.
		String s4 = "xx가 외로워하고 있어요 00아..!.hwp";
		boolean re = s4.endsWith(".hwp");
		System.out.println(re);
		
		//그 외
		//1. int lastIndexOf() : 지정된 문자 또는 문자코드 문자열의 오른쪽 끝에서부터 찾아서 
		//						 위치를 반환하여 준다. 못 찾으면 -1을 반환한다.
		System.out.println(s2.lastIndexOf("k"));
	
		//2. String replace(String oldStr,String newStr) 
		// 	  기존 문자열을 새로운 문자열로 변환
		String s5 = s2.replace("JQuery", "Java");
		System.out.println(s5);
		
		//3. String[] split(구분자) : 문자열을 지정한 구분자로 나누어 문자열형 배열에 저장한다.
		String s6 = "100,,,200,,300,400";
		String[] sArr = s6.split(",,");
		System.out.println(Arrays.toString(sArr));
		
		//4. String subString(int start, int end) 
		//   주어진 문자열을 시작부터 끝 위치 범위에 포함된 문자열을 얻는다.
		String s7 = s5.substring(2, 6);//Hello Java
		System.out.println(s7);
		
		//5. String trim() : 주어진 문자열 양 끝의 공백을 제거해준다.
		String s8 = "       eun  seo  ";
		String s9 = s8.trim();
		System.out.println(s9);
		
		//6.int compareTo(String str) : 문자열(str)과 사전순서를 비교한다. 
		//같으면 0을, 사전순으로 이전이면 음수를,이후면 양수를 반환한다.
		int s1 = "String".compareToIgnoreCase("ing");
		System.out.println(s1);
		int i = "aa".compareToIgnoreCase("aaa");
		System.out.println(i);
		int i1 = s5.compareToIgnoreCase("aaa");
		System.out.println(i1);
		
		//7.int indexOf(int ch) : 주어진 문자(ch)가 문자열에 존재하는지 확인하여
		//위치(index)를 알려준다. 못 찾으면 -1을 반환
		int i2 = s5.indexOf("J");
		System.out.println(i2);
		int i3 = s5.indexOf("lo");
		System.out.println(i3);
		int i4 = s5.indexOf("k");
		System.out.println(i4);
		
		//8. int length() : 문자열의 길이를 알려준다.
		int i5 = s5.length();
		System.out.println(i5);
		String s10 = "abc  trg   tgyh";
		int i6 = s10.length();
		System.out.println(i6);
		
		//9. String toLowerCase() : String인스턴스에 저장되어 있는 모든 문자열을
		//소문자로 변환하여 반환한다.
		String s11 = "I Love JAva";
		String s12 = s11.toLowerCase();
		System.out.println(s12);
		
		//10. String toUpperCase() : String인스턴스에 저장되어 있는 모든 문자열을
		//대문자로 변환하여 반환한다.
		String s13 = "i love java";
		String s14 = s13.toUpperCase();
		System.out.println(s14);
		
		//11. static String valueOf(boolean b) : 지정된 값을 문자열로 변환하여 반환한다.
		//참조변수의 경우, toString()을 호출한 결과를 반환한다.(매개변수로 모든 타입이 올 수 있다.)
		
		String s15 = String.valueOf(true);
		String s16 = String.valueOf(100);
		String s17 = String.valueOf('a');
		String s18 = String.valueOf(1256L);
		System.out.println(s15);
		System.out.println(s16);
		System.out.println(s17);
		System.out.println(s18);
			
		
		//12. boolean startWith(str) : 문자열이 지정한 문자로 시작하는지 판단. 
		// 같으면 true 아니면 false 반환(대소문자 구별)
		boolean b1 = s13.startsWith("i");
		System.out.println(b1);
		
		//13. String format(string,obj) : 서식문자열을 이용해서 서식화된 문자열을 반환
		int ii1 = 123456789;
		String str = String.format("%,d",ii1);
		System.out.println("format: "+str);
		
		//14. boolean matches(string) : 지정한 정규 표현과 일치할때 true를 반환한다.
		String str2 = "123456";
		boolean matches = str.matches(str2);
		System.out.println("matches: " +matches);
		
		//15. String replaceFirst : 문자열에 지정한 문자""가 있으면 첫번째만 새로 지정한
		//문자 ""로 바꿔서 출력한다.
		String str3 = str2.replaceFirst("12", "hello");
		System.out.println(str3);
		
		//16.String(String s) : 주어진 문자열(s)을 갖는 String인스턴스를 생성
		

		
		
		
		
	}
}
