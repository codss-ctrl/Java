package c_sentence;


public class Sentence_01 {
	public static void main(String[] args){
		/*
		 1. 조건문 if, switch-case
		  - 조건식과 문자를 포함하는 블럭{}으로 구성되어 있다.
		  - 조건식의 결과에 따라서 프로그램의 실행흐름을 변경할 수 있다.
		 
		 2. if문
		  - 구조
		   (1) 기본 
		   		if(조건식){
		   			조건식의 결과가 true일 때 수행될 문장.
		   		  }
		 
		   (2) 1단변형
		   	  	if(조건식1){
		   			조건식1의 결과가 true일 때 수행될 문장.
		   		  }else{
		   		  	조건식1의 결과가 false일 때 수행될 문장.
		   		  }
		   		  
	  		(3) 2단변형
		   	  	 if(조건식1){
		   			조건식1의 결과가 true일 때 수행될 문장.
		   		   
		   		  }else if(조건식2){
		   		        조건식1 의 결과가 false이고, 조건식2가 true일 때 수행될 문장.
		   		  }else{
		   		  	조건식1과 2의 결과가 모두 false일 때 수행될 문장. 
		   		  }
		   		  
		 3. swith문
		  - 조건의 경우의 수가 많을 때는 if문보다 switch문을 사용한다.	 
		  - 간결해서 알아보기가 쉽다.
		  - 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		  - 구조
		  	 switch(조건식){
		  	 	 case1 값1:
		  	 	 	조건식과 값1이 같을때 수행될 문장
		  	 	 	break;
		  	 	 case2 값2:
		  	 	 	조건식과 값2이 같을때 수행될 문장
		  	 	 	break;
		  	 	 case3 값3:
		  	 	 	조건식과 값3이 같을때 수행될 문장	
		  	 		break;
	  	 		default : 
	  	 			조건식과 만족하는 case없을 때 수행될 문장
	  	 			break;
		  	 }
		 	 
		 	 
		 	 
		 
		
		*/
		int num = 10;
		if (num>0) {
			System.out.println("양수이다");
		}else if (num==0) {
			System.out.println("0이다");
			
		}else {
			System.out.println("음수이다");
		}
		
		
		//Q2-16
		int score = (int)(Math.random()*101+0);
						//정수 101개, 시작:0
		System.out.println(score);
		if (score>=90){
			System.out.print("A");
			if(score>=95){
				System.out.println("+");
			}else {
				System.out.println("-");
			}
						
		}else if (score >=80 ) {
			System.out.print("B");
			if(score>=85){
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}else if (score >=70 ) {
			System.out.print("C");
			if(score>=75){
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}else if (score >=60 ) {
			System.out.print("D");
			if(score>=65){
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}else {
			System.out.println("F");
		}
	
		/*
		if (score>=90){
			System.out.println("A");
		}else if (score >=80 && score <90) {
			System.out.println("B");
		}else if (score >=70 && score <80) {
			System.out.println("C");
		}else if (score >=60 && score <70) {
				System.out.println("D");
		}else {
			System.out.println("F");
		}
	
	*/
	
	//	Q2-17

	int random = (int)(Math.random()*5+1);
	switch(random){
	    case 1 :System.out.println("32평 아파트 당첨");
		break;
		case 2 : System.out.println("자동차 당첨");
		break;
		case 3: System.out.println("노트북 당첨");
		break;
		case 4: System.out.println("자전거 당첨");
		break;
		default: System.out.println("다음 기회에");
		break;
	}
	/*
	int random1 = (int)(Math.random()*101);
	switch (random1) {
		case random>=80:
			System.out.println("A");
		break;
		case random>=70:
			System.out.println("B");
		break;
		
		case random>=60:
			System.out.println("C");
			break;

	default: System.out.println("D");
		break;
	}
	*/
	//1. season변수를 선언하고 1~12 사이의 임의의 정수값으로 초기화 하여라
	
	//2. season의 값이 12,1,2의 경우에는 "겨울" 출력, 3,4,5인 경우에는 "봄"을 출력 6,7,8의 경우 "여름"을 출력
	//9,10,11의 경우 "가을"을 출력
	int season = (int)(Math.random()*12+1);
	switch(season) {
	   case 12 :	case 1 :		case 2 : 
			System.out.println("겨울");	
			break;	
		case 3 :	case 4 : 		case 5 : 
			System.out.println("봄");
			break;	
		case 6 :	case 7 : 	case 8 : 
			System.out.println("여름");
			break;	
			}
	
	
}
}
	

	

		


