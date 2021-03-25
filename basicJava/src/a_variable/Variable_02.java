package a_variable;

public class Variable_02 {
		public static void main(String[] args) {
			
			/*
			변수의 타입
			
			1.기본형 타입(primitive type)
				- 8개
				- boolean, char, byte, short, int, long, float, double
			
			2.참조형 타입(reference type)
				- 주소를 저장한다.
				
			3. 기본형 변수의 종류
				- 논리형 : boolean -> true, false
				- 문자형 : char
				- 정수형 : byte, short, int(기본), long
				- 실수형 : float, double(기본)
				
			4. 기본형 변수의 크기
				- 1byte : boolean, byte
				- 2byte : char, short
				- 4byte : int, float
				- 8byte : long, double
				
				
			5. 논리형 - boolean : 기본값 false
				- boolean형 변수에는 true 또는 false의 값만을 저장할 수 있다.
				- boolean형 변수는 대답(yes/no), 스위치(ON/OFF) 등의 논리 구조에 주로 사용된다.
				
				
				Run Ctrl+F11
				
			6.	문자형 - char
				- 문자 하나를 저장하는 용도로 사용한다.
				- Java는 unicode문자 체계를 이용한다.
				- 3가지 표현방법 '' (single quote)
				char sung = 'A';
				char sung1 = 65;
			    char sung2 = '\u0041';
			    
			    short-2byte-8bit-15칸 -2^15~2^15-1 까지 가능
			    int-4byte-32bit- 
			    
		
			 */
			
			//1.변수 power를 선언하고 true의 값으로 초기화 하여라.
			//  변수타입 변수명 = 값;
			
			//boolean power = true;
			//System.out.println(power);
			
			//1. 자신의 성을 변수 sung에 저장해주세요
//			char sung = 'A';
//			char sung1 = 65;
//		    char sung2 = '\u0041';
//	
//			System.out.println(sung);

			
			/*
			
			7.정수형 - byte, short, int, long
				- 기본자료형은 int이다
				- 저장하려는 정수값의 크기에 따라 4개의 정수형 중 하나를 선택하면 된다.
				-
				
			
				
			*/
			//1. 변수 b2에 50의 값을 저장해주세요
			
			byte b2 = 50;
			
			//2. 변수 s2에 32000의 값을 저장해주세요
			
			short s2 = 32000;
			
			//3. 변수 i2에 40만의 값을 저장해주세요
			
			int i2 = 400000;
			
			//4. 변수 l2에 100억의 값을 저장해주세요
			
			long l2 = 10000000000L;
					//long의 끝에는 L을 붙여줘야한다
			
			System.out.println(b2);
			System.out.println(s2);
			System.out.println(i2);
			System.out.println(l2);
			
			/*
			 8. 실수형 - float, double
			 	- 기본 자료형은 double이다.
			 	- 자료형을 선택할 때 크기도 중요하지만, 정밀도가 더 중요하다.
			 	- float -> 1:8:23 -> 0부호0 8 0(e) 2^23-1 0
			 	- double ->l:11:52 -> 0부호0 11 0 (e) 2^52-1
			 
			 */
			//1. float 타입형 변수 f1에 3.1415923456789의 값을 저장해주세요.
			
			float f1=3.1415923456789F;
			//기본형인 double로 생각하기 때문에 뒤에 F를 붙여야 한다.
			
			System.out.println(f1);
			
				
			//2. double 타입형 변수 d1에 3.1415923456789의 값을 저장해주세요.
			
			double d1=3.1415923456789;
			
			System.out.println(d1);
			
			/*
			  9.String
			  	-문자열을 다루기 위해 만들어진 클래스이다.(double quote) 
			  	-참조형으로, 주소를 저장한다.
			 */
			String name="dfjkawfoijgmiojgoirkjego";
			System.out.println(name);
			
			String name1="==========\n------------";
			System.out.println(name1);
			
			String name2="";
			System.out.println(name2);
			
			//int i3 = 20;
			//String str = "3";
			
			 String result = "i3 + str"; 
			 // int + String => String + String => String
			 //20 + "3" = "20" + "3" = "203"
			 
			 System.out.println(result);
			 /*
			  1+"" -> 1 + 공백
					
			  3+17+"hi" -> "20hi"

			 'J' + "ava" + 18 -> "Java18"
			 
			 
					
			// ""; -> 주소는 있는데 안에 든게 없다. 
			// 주소가 없다 -> String name=null;
			
			/*
			  10.overflow
			  	-변수가 자신이 저장할 수 있는 범위를 넘었을 때 최솟값부터 다시 표현하는 현상
			 */
			
			byte b3 = 126;
			System.out.println(b3);
			
			b3++;
			System.out.println(b3);
			
			b3++;
			System.out.println(b3);
			//128을 저장할 수 없어서 최소값 -128로 돌아감.
			
		
						
				/*
			 11.캐스팅(casting)
			 	- 변수 또는 리터럴의 타입을 다른 타입으로 변환하는 것이다.
			 	- 작성방법
			 		-> (타입)피연산자
		 		-byte->short->int->long
			 				char->int					
			 */
			
			char c ='a';
			int ii = c;
			System.out.println(ii);
			
			byte bb = (byte)ii;
			System.out.println(bb);
			
			
			//overflow 위험성이 있으면 (타입)을 써줘야 한다.
			//rename f2
		}

}























