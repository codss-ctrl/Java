package i_reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_01 {

	public static void main(String[] args) {
		/*
		1. 정규식이란?
		  - 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾기 위해 만들어졌다.
		  - 정규식의 구성
		    : Pattern 클래스를 이용하여 정규식을 정의한다.
		    : Matcher 클래스를 이용하여 데이터를 비교한다.
		    
		 
		 */
//		Pattern p = Pattern.compile("[a-z]*");
//		Matcher m = p.matcher("asdgg");
//		
//		System.out.println(m.matches());
		
		
		/*
		 ^ 문자열의 시작
		 $ 문자열의 끝
		 . 임의의 한문자 단,\는 제외
		 * 앞 문자가 없을수도 무한정 있을수도 있다.
		 + 앞 문자가 한번 이상
		 ? 앞 문자가 없거나 하나
		 [] 문자의 집합이나 범위를 표현한다. [^a-z ]-> not의 의미.소문자가 아닌것
		 {} 횟수 또는 범위를 나타낸다. {2,3}-> 2 또는 3회 {2,}->2회 이상
		 () 소괄호 안의 문자를 하나의 문자로 인지 (010)
		 |  패턴 안에서 or의 의미를 가진다. (010|016)
		 
		 \s 공백문자
		 \S 공백문자를 제외한 모든 문자
		 \w 알파벳 또는 숫자
		 \d 숫자 [0-9]와 동일 // 문자열 안에서는 \\d로 써야 \d로 인지
		
		 */
		//1. 영어 소문자 2개 또는 3개로 이루어진 정규식
		 
//		Pattern p1 = Pattern.compile("[a-z]{2,3}");
//		Matcher m1 = p1.matcher("i");
//		System.out.println(m1.matches());
//		
		String regEx1 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx1, "sdfgga"));
		
		//2. 영문자가 3회, 숫자가 없을수도 무제한 있을수도 있다.
		String regEx2 = "[a-zA-Z]{3}[0-9]*";
		System.out.println(Pattern.matches(regEx2, "asd55"));
		//3. "숫자3개 - 숫자4개 - 숫자4개"
		String regEx3 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx3, "010-111-1111"));
		//4. 010        - 0이 올 수 없다. 숫자 3개 - 숫자4개
		//     1,6,7,8,9
		String regEx4 = "(01)[016789]-[1-9][0-9]{2}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx4, "011-088-9696"));
		//5. 주민번호 
		/*
		 년          월    		일		성별		고유번호
		 숫자 2개  0 1-9	0 1-9 - 1-4 	숫자 6자리
		       1 0-2	1 0-9
		       			2 0-9
		       			3 0-1
		*/
		String regEx5 = "[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[01])-[1-4][0-9]{6}";
		System.out.println(Pattern.matches(regEx5, "000309-1151615"));
		
		//6. 이메일주소
		/*
		 1. 영문자로 시작해야 한다.
		 2. 영문자 또는 숫자 특수문자(-_)
		 3. @이후에 영문자 또는 숫자가 3~7자.
		 4. .이후에 영문자 또는 숫자가 2~3자
		 5. .kr 올 수도 있다.
		 */
		String regEx6 = "[a-zA-Z][\\w-_]@\\w{3,7}.\\w{2,3}(.kr)?";
		System.out.println(Pattern.matches(regEx6, "asfsf@ds.com"));
		       
		String text = "야이 개나리 십장생아 이런 조카신발 같은 경우를 봤나...";
		
		String result = filter(text);
		System.out.println(result);
		
//		String patternUPw = "(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$%^&*+]).{8,15}";
//		
//		String text1 = "asdf056~";
//		System.out.println("1   "+Pattern.matches(patternUPw, text1));
	}

		
	private static String filter(String text) {
		
		Pattern p = Pattern.compile("개나리|십장생|조카신발|병일신", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		StringBuffer sb = new StringBuffer();
		
		while (m.find()) {
			String group = m.group();
			String re = maskword(group);
			m.appendReplacement(sb, re);
		}
		m.appendTail(sb);
		return sb.toString();
	}

	private static String maskword(String group) {//개나리 -> 개♡♡
		char[] gg = group.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<gg.length ; i++){
			if (i==0) {
				sb.append(gg[i]);
			}else{
				sb.append("♡");
			}
		}
		
		
		return sb.toString();
	}

}
