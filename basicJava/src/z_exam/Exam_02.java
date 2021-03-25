package z_exam;

public class Exam_02 {
	public static void main(String[] args) {
		
		/* 과제 풀이 예시
		  2-4 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우 괄호 안에 '오류'라고 적어주제요
		  System.out.println("1"+"2"); // String+String => String "12"
		  System.out.println('A'+'B'); 
		  // char(2byte) +char(2byte) => int(4) + int(4byte) -> int(4by) (예외)
		   * 피연산자 중 하나도 4byte가 넘는 타입이 없으면 4byte인 int로 간주된다
		  // 'A' + 'B' => 65 + 66 -> 131
		  
		  System.out.println("1"+"2");
		  System.out.println('A'+'B');
		 */
		
		
		/*
		  2-1 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
		  
		   [종류   \크기] 	1byte		2byte	4byte	8byte
			
			논리형		boolean
			문자형				    char
			정수형		byte		short	int		long			
			실수형							float	double
		  
		  		 	  
		 */
		
		/*
		 $$$$$2-2 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오
		  
		  int i = 100;
		  long l = 100L;
		  final float PI = 3.14f;
		  
		  -리터럴: 100,100L,3.14f ->값을 의미
		  -변수: i, l, PI 
		  -키워드: int, long, final, float
		  -상수 : PI
		  
		 */
		
		/*
		  2-3 다음 중 기본형(primitive type)이 아닌 것은?
		  	1.int 
		  	*2.Byte ->byte가 기본형, Byte는 wrapper class
		  	3.double
		  	4.boolean 
		  	
		  	->기본형 : boolean, byte, char, short, int, long, float, double
	
		 */
		
		/*
		  2-4 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 '오류' 라고 적으시오.
		 	
		 	<byte->short->int->long->float->double
		 	          char->int >  
		 	System.out.println("1"+"2"); 
		 	=>String + String => String "12"
		 	
		 	System.out.println(true + ""); 
		 	=> boolean + String => String "true "
		 	
		 	System.out.println('A'+'B'); 
		 	=>char + char =>int 65+ int 66=>int 131
		 	
		 	System.out.println('1'+ 2); 
		 	=>char + byte/int => int 49 + int 2 => int 51
		 	
		 	System.out.println('1'+'2'); 
		 	=>char + char =>int 49 + int 50 =>int 99
		 	
		 	System.out.println(4 + 24.3715F); 
		 	=> byte/int + float =>float 4 + float 24.3715 = float 28.3715
		 	
		 	System.out.println('A' + 3.14); 
		 	=> char + double => double 65.0 + double 3.14 => double 68.14
		 	
		 	System.out.println('J' + "ava"); 
		 	=>char(2byte) + String(4byte) => String + String 
		 	                              =>"J" + "ava"
		 						          =>String "Java"
		 						       
		 	System.out.println(true + null); 
		 	=> boolean + 참조형
		 	=> null은 참조형에만 저장되므로 오류.  null은 계산 변수의 어떤 값으로도 초기화되지 않는다.
		 	
		 	
		 	
		 */
		/*
		char y='2';
		int u= y;
		System.out.println(u);
		
	/*
		char q='A';
		char w='B';
		int e=q;
		int r=w;
		System.out.println(e);
		System.out.println(r);
		
		/*
		 char ot = '1';
		int at = ot;
				System.out.println(at);
				
				*/
				
				
		
		System.out.println("1"+"2");
	 	System.out.println(true + "");
	 	System.out.println('A'+'B');
	 	System.out.println('1'+2);
	 	System.out.println('1'+'2');
	 	System.out.println(4 + 24.3715F);
	 	System.out.println('A' + 3.14);
	 	System.out.println('J' + "ava");
	  //System.out.println(true + null);
		
	 	
		/*
		  2-5 다음 중 키워드가 아닌 것은?(모두 고르시오)
		  	1.if
		  	*2.True 클래스. 소문자여야 키워드
		  	*3.NULL 클래스. 소문자여야 키워드
		  	*4.Class class가 키워드
		  	*5.System 키워드 아님
		 */
	 	
	 		
	 		 	
		/*
		  2-6 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
		  	
		  	*1. $ystem 
		  	2. channel#5 ->$,_ 외 특수문자 불가
		  	3. 7eleven ->숫자로 시작 불가
		  	*4. If -> 대문자라 가능
		  	*5. 자바 
		  	6. new -> 예약어
		  	*7. $MAX_NUM
		  	8. heelo@com->$,_ 외 특수문자 불가
		  
		  
		*/
		
		/*
		  2-7 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고르시오)
		  	[Hint] 참조형 변수의 크기는 4byte이다.
		  	
		  	*1. int
		  	2. long -> 8byte
		  	3. short -> 2byte
		  	*4. float 
		  	5. double -> 8byte
		  	
		  	
		 */
		
		/*
		  2-8 다음 중 형변환을 생략할 수 있는 것은?(모두 고르시오)
		  	byte b = 10;
		  	char ch = 'A'
		  	int i = 100;
		  	long l = 1000L
		  	
		  	1. b = (byte)i;
		  	2. ch = (char)b;
		  	3. short s = (short)ch;
		  	*4. float f = (float)l; long->float
		    *5. i = (int)ch; char->int
		    
		    *<byte->short->int->long->float->double
		 	          char->int > 
		  
		 */
		
		/*
		  2-9 char타입의 변수에 저장될 수있는 정수 값의 범위는?
		  	  
		  char -> 2byte -> 16bit -> 문자이기에 부호 자리 없으므로 16칸 모두 쓰기 가능 -> 0~2^16-1
		  
		 */
		
		/*
		  2-10 다음 중 변수를 잘못 초기화 한 것은?(모두 고르시오)
		  	1. byte b = 256; 256=2^8 byte는 1byte->8bit->부호자리를 제외한 15칸 표현 가능 ->-2^15~2^15-1 까지 표현가능
		  	*2. char c = ''; char는 문자를 저장하는 타입으로, 0~2^16 개를 저장할 수 있지만 공백은 저장하지 못한다.
		  	*3. char answer = 'no'; char는 문자 하나만을 저장할 수 있다. no는 두글자이므로 초기화할 수 없다.
		  	*4. float f = 3.14; float는 기본형 double과 차이를 두기 위해 리터럴 뒤에 F를 써야한다.
		  	5. double d = 1.4ef; f는 float의 리터럴 넘버이므로 double에는 사용할 수 없다.
		  	
		  	
		  	
		  	
		  	
		 */		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
	}
}
