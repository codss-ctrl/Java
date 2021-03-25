package d_array;

public class Array_01 {
	public static void main(String[] args) {
/*
	1.배열(Array)
	 - *같은 타입*의 여러 변수를 하나의 묶음으로 다루는 것
	    int math;
		int eng;
		int soc;
		
	2. 배열의 선언	
	 - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙이면 된다.
	 - 구조(참조형)
	 	변수타입[] 변수명; int[] score 
		변수타입 변수명[]; int score[] 
	
	3. 배열의 생성
	 - 배열을 생성하기 위해서는 연산자  'new' 와 함께 배열의 타입과 크기를 지정해 주어야 한다.
	  ex) score = new int[3]; 
	 - 배열은 한번 생성되면 크기를 변경할 수 없다.
	  
	
	  
	*/
		
	int[] score = new int[5];// {0,0,0,0,0}
//	System.out.println(score[0]);
//	System.out.println(score[1]);
//	System.out.println(score[2]);
//	System.out.println(score[3]);
//	System.out.println(score[4]);
	//시작 :0 끝:4 증가량:1
	//System.out.println(score[??]);
	for (int index = 0; index < score.length; index++) { //score.length
		System.out.println("System.out.println("+index+");");
	}

	score[0]=10;
	score[1]=20;
	score[2]=30;
	score[3]=40;
	score[4]=50;
	//시작0 끝 4 증가량 1
	//반복 score[?] = (?+1)*10
	
	for (int index = 0; index < score.length; index++) {
		System.out.println((index+1)*10);
	}
	
//	4. 배열의 선언 및 초기화 원하는 값으로 하기
	 int[] score2 = new int[]{10,20,30,40,50}; //뒤에 값이 존재해야만 방으로 인정
//	 int[] score2 = {10,20,30,40,50}; 도 가능 
	 for (int index = 0; index < score2.length; index++) {
		 System.out.println(score2[index]);
	}
	 int[] ss; 
	 ss = new int[2];
	 int[] ss2;
	 ss2 =new int[]{2,3,4};
	 
	 int[] ss3 = {5,6,7};
	 //이건 new int 생략 불가능
	
//	5. 변수 names에 같은 팀원의 이름들을 저장해주세요.
	  String[] names = new String[]{"조유진", "김대호","홍유리"};
//	 String[] names = {"조유진", "김대호","홍유리"};
	System.out.println(names[1].length());//1번 방 문자가 몇 글자인가
	
	
		
//1단계
		for (int index = 0; index < names.length; index++) {
			//names[0] => "이영훈"
			for (int i = 0; i < names[index].length(); i++) {
				System.out.println(names[index].charAt(i));
			}
			System.out.println("-----");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

	
	
	
	
	
	
	
	
	
	
		
	

