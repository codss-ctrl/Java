package c_sentence;

import java.util.Scanner;



public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문(for, while, do-while)
		 - 어떤 작업을 반복적으로 수행되도록 할 때 사용된다.
		 - 반복문은 주어진 조건을 만족하는 동안 주어진 문장을 반복적으로 수행함으로 조건식을 포함한다.
		 - for문은 반복횟수를 알 때, while문은 반복횟수를 모를 때 사용한다.
		 
		2. for문
		 - 기본구조
		   for( 초기화 ; 조건식 ; 증감식 ){
		     조건식이 만족할 때 수행될 문장
		   } 
		
		     초기화 -> (조건식 -> 수행 -> 증감식) 		
		
		*/
		
		//1.0부터 10까지
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
		
		// 시작:	0,끝: 10	,증가량: 1	 
		//	수행문장 : 	System.out.println(??);
/*		for (int count = 0; count < 11; count++) {
			System.out.println(count);
		}		
		
		//Hello Java 3번 출력
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Hello Java");
		}		
		
		//5에서 17까지의 합
		int i2 = 0;
//		i2 += 5;
//		i2 += 6;
		
		for (int i3 = 5 ; i3 < 18; i3++) {
			i2 += i3;
		}
		System.out.println(i2);
	
	//2-19-1
 	for(int i = 0; i <=5 ;i++){
 		System.out.print(i+" ");
 		}
 	//2-19-2 	
 	for(int i = 5; i >=0;i--){
 		System.out.print(i+" ");
 		}
 	//2-19-3
 	int a =0;
 	for(int b = 2; b <11;b++){
 		a += b;
 				 	
 	}
 	System.out.println(a);
 	
 	//2-19-4
 	long c = 5L;
 	for (int d = 6; d < 15; d++) {
		c = (long)c*d;
		}
 	System.out.println(c);
	
	
	//2-19-5
		int e = 0;
		for(int f=3 ; f<4463 ; f++){
			if (f%2==0) {
				e+=f;
			}}
		System.out.println(e);
		
		
	//2-19-6
		int g = 0;
		for (int i = 8; i < 57; i++) {
			if (i%2==0 || i%3==0) {
				g+=i;
			}
		}
		
		System.out.println(g);
		
		
	//구구단 출력
		int dan = 2;
		for (int gob = 1; gob < 10; gob++) {
			System.out.println(dan+"*"+gob+"="+dan*gob);
		}
		
	//	시작:1 끝:9 증가량:1
	// 반복구문 : 	System.out.println(2+"*"+gob+"="+2*gob);
		
	/*	int dan = 3;
		for (int gob = 1; gob < 10; gob++) {
		System.out.println(dan+"*"+gob+"="+dan*gob);
	}
	시작 2 끝 9 증가량 1 
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
					if (i%2==0 && j%2==1) {
						System.out.println(i+"*"+j+"="+i*j);	
					}
			
			}
		}
		
	/*	
	3. While문
	 - 조건식과 수행해야할 블럭{}만으로 구성되어 있다.
	 - 기본구조
	   while(조건식){
	   		조건식이 true일 때 수행될 문장
	   }
		
		*/
	//0~10 출력
	/*	for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}		
		int i =0;
		while (i<11) {
			System.out.println(i);
			++i;
		}
		
 //5~15 합 while문
		int count2 = 5;
		int t = 0;
		while (count2 <16) {
			t += count2;
			count2++;
			
		}System.out.println(t);
		
		
 //2. 구구단 while
		int go = 1;
		while (go<10 ) {
			int da = 2;
			while ( da<10) {
				System.out.println(go+"*"+da+"="+go*da);
				da++;
				}
			go++;	
		}
		
//3. 7~? 합이 200이상이 될때 ?의 값을 구하시오
		int v = 6;
		int hap = 0;
		while (hap < 200) {
			
			v++;
			hap +=v;
			
		}System.out.println(v);
*/		
/*		int hap2 = 0;
		int num2 = 7;
		
		while (true) {
			hap2 += num2;
			if (hap2>=200) {
				break;
			}//hap2가 200이상이면 나가
			num2++;
		}System.out.println(num2);
		
	*/	
		
		
/*		
	4. do-while
	 - 최초 1회는 반복문을 수행한다.
	 - 구조
	   do{
	   		실행문장
	   }while(조건문);
	 
*/	
		//1. 사용자로부터 문자를 입력받는다.
		Scanner sc = new Scanner(System.in);
		String input = null;//밖에서 먼저 선언
		do{
			System.out.println("문자를 입력해주세요. 단, exit를 입력시 종료됩니다.");
			input = sc.next();
		//2. 입력받은 문자를 출력한다.
			System.out.println(input);
		}while(!"exit".equals(input));	
		//3. 단 입력받은 문자가 exit이면 반복을 멈춘다.
		
		
		
	for (int i = 1; i < 100; i++) {
		if (i%2==0) {
			System.out.println(i);
		}
	}	
	
	for (int i = 1; i < 100; i++) {
		if (i%2!=0) {
			continue;
		}
		System.out.println(i);
	}	
		
		
		
		
		
}
}

