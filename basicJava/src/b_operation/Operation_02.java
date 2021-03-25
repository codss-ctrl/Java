package b_operation;

public class Operation_02 {
	public static void main(String[] args){
		/*
	     1. 증감연산자( ++, --)
	     	-증가연산자(++) : 피연산자의 값을 1 증가시킨다.
	     	-감소연산자(++) : 피연산자의 값을 1 감소시킨다.
		
		
		
		
		
		*/
	

	int i = 3;
	i++;
	System.out.println(i);
	++i;
	System.out.println(i);
	
	//1. 변수 c에 'A'를 저장해 주세요
	
	char c = 'A';
	c++;
	System.out.println(c);
	
	int i1=5;
	int i2=10;
	
	int i3= ++i1 + i2;
	//		6+10		
	System.out.println("i3:"+i3);
	System.out.println(i3);
	/*
	int i4= i1++ + i2;
	System.out.println(i4);
	System.out.println("i4:"+i4);
	System.out.println("i1:"+i1); //++ 위치에 따라 답 변함
	
	//문제 2-6 
	
	int number= 30;
	char ch ='C';
	
	int result = number++ + 3 + ++ch + ++number;
	System.out.println("number:"+number);
	System.out.println("ch:"+ch);
	System.out.println("result:"+result);

	/*
	 2. 부호연산자 (+,-)
	  - boolean, char 형에는 사용할 수 없다.
	  
     3. 비트 전환 연산자 ( ~ )
      - boolean형과 실수형에는 사용할 수 없다.
      - 컴퓨터가 알아 듣는 음수. (보수와 관련)
      - 피연산자를 2진수로 표현하였을 때 0은 1로 1은 0으로 바꾼다.
		10 : 00001010
	   ~10 : 11110101(-11, 10의 1의 보수)
	 ~10+1 : 11110110(-10, 10의 2의 보수)
	
	*/
	int i4= 10;
	System.out.println(~i4+1);
	
	
	
	/*
	  4. 논리부정 연산자(!)
	   - boolean형에만 사용가능하다.
	   - true -> false, false -> true
	   
	 
      */
    //1. 변수 power를 false의 값으로 초기화 하여라.
		boolean power = false;
		
	//2. power의 값을 부정하여 power에 저장하여라.
		power = !power;
		System.out.println(!!!power);
	
	
	
	
	
	
	
	
	}
}











