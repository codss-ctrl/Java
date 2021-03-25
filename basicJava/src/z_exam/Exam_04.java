package z_exam;



public class Exam_04 {
	public static void main(String[] args){

/*
		4-1
		다음의 문장들을 조건식으로 표현하라.
		
//		(1) int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 ->int x= ; x >10 && x<20;
			int x = 15;
			if(x>10 && x<20){
			System.out.println("true");
//		(2) char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 -> char ch = ' ' && ch !='	'
			char ch = ' ';
			if(ch==' '&& ch !='	'){
				System.out.println("true");
			}
//		(3) char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 -> char ch = 'x' || ch = 'X'
			char ch1 ='x';
			if(ch1 =='x'||ch1=='X'){
				System.out.println("true");
			}
//		(4) char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식 -> char ch = ;
			char ch2= (char)1; //한자리 수일 경우엔 '2' 형식 가능
			if(ch2>=(char)0&& ch2<=(char)9){
				System.out.println("true");
			}
//		(5) char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식 
			//char ch >= 'A' ch<='Z'||ch >= 'a' &&ch<='z'
			char ch3 ='A';
			if(ch3>='A'&& ch3<='Z'|| ch3 >='a'&&ch3<='z'){
				System.out.println("true");
			}
//		(6) boolean형 변수 powerOn가 false일 때 true인 조건식 -> boolean powerOn = false
			boolean powerOn = false;
			if(powerOn==false){
				System.out.println("1.(6)="+"true");
			}
			
//		(7) 문자열 참조변수 str이 "yes"일 때 true인 조건식 -> String str = "yes"
			String str = "yes";
			if("yes".equals(str)){
			//	str.equals("yes") -> str이 null일 경우 터짐
				System.out.println("1.(7)="+"true");
			}
			
*/		
		
		/*4-2
		1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int r1 
		
		int r1 = 0; //1<=r1<=20 1+2+3+...
		for (int i = 1; i < 21; i++) {
			 if (!(i%2==0 || i%3==0)) {
				r1+=i;
			}
		}
		System.out.println("4번 "+r1);
		
		
		
		/*4-3
		다음의 for문을 while문으로 변경하시오.*/
		
		/*for (int dan =2; dan < 10; dan++){
			for(int gob = 1; gob <10; gob++){
				System.out.println(dan + "*" + gob + "=" + dan*gob);
				}				
			}
			
		int dan=2;
		int gob=1;
		while (dan<10 && gob<10) {
			
			System.out.println(dan + "*" + gob + "=" + dan*gob);
			dan = ++dan;
			gob = ++gob;			
		}
		
	*/	
		
		
	/*	4-4
		두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		
		int dice1 =(int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		//dice1+dice2=6
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i+j==6) {
					System.out.print(" "+"("+i+","+j+")");
				}
			
		} 
			}
		*/

     	
		
//		4-5
/*		방정식 2x+4y=10의 모든 해를 구하시오. 단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10이다.
		
		for (int i = 0; i < 11; i++) {
		for (int p = 0; p < 10; p++) {
		
		if (2*i+4*p==10){
			System.out.println("("+i+","+p+")");
			
		}
			}
		}	
		
	*/	
			
			
			
		
//		4-6
//		사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)에서 
//      끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
		
/*		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작");
		int num1 = sc.nextInt();
		System.out.println("끝");
		int num2 = sc.nextInt();
		
		long gob1 = 1;
		for (int i = num1; i<= num2; i++) {
			
			gob1 *= i;
			
		}System.out.println(gob1);
*/		
				
/*		
//		4-7
//		1 + (1+2)+(1+2+3)+(1+2+3+4)+ ...+(1+2+3+...+10)의 결과를 계산하시오.
	  //  시작 1 ,끝 10, 증가량 1
		int hab = 0;
 		int d = 0;		
  		for (int j = 1; j <=10; j++) {
			
			 hab = hab+j;
			 d = d+hab;
			 
		}System.out.println(d); 
		
//		추가문제 1 "1 + (1+2)+(1+2+3)+(1+2+3+4)+ ...+(1+2+3+...+10)"가 출력되게 하라
		int hab2 = 0;
		int  a = 0;
		for (int j = 1; j <11; j++) {
			
			  hab2 = hab2+j;
			 a = a+hab2;
			 System.out.print("("+hab2 +"+"+ j +")");
		} 
	//2	int sum3= 0;
		for(int j =1; j<i+1, j++){
			sum3 +=j;
			}
	//3 1*10+2*9+3*8+4*7+5*5...10*1
	 * sum3=0
	 * for(int i =1; i<11; i++){
	 * sum3+=i*(11-i);
	 * }	
	 */
	
		
//		4-8
//		1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상이 되는지 구하시오.
/*		int sum=0;
		int num=0;
		
		while (sum<100) {
			num++;
			
			if (num%2==0) {
				sum-=num;
			}else {
				sum+=num;
			System.out.println(sum);
			}
			System.out.println(num+"일 때,총합이 "+sum+"이 된다");
					
		}		
*/					
	//				System.out.print("("+"-"+j+")"+"+");
					
				
					
					//				System.out.print(j+"+");
	//2 int 				
		
//		4-9
//		 사용자로부터 입력받은 정수의 각 자리의 합을 더한 결과를 출력하는 프로그램을 작성하시오. 
//		 예를 들어 사용자가 53263을 입력하였다면 결과는 19가 되어야 한다.
/*		int num = 0;//입력된 숫자가 저장될 변수를 초기화
		int sum = 0;//입력된 숫자의 각 자리의 합을 저장할 변수를 초기화
 		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		num = sc.nextInt();
		
		while (num!=0) {
			sum+=num%10;//num을 10으로 나눈 나머지를 sum에 더한다
			num/=10;//num을 10으로 나눈 값을 다시 num에 저장한다.
			//num1/10+num1%10
		}
		System.out.println("합은"+sum);
*/		
		 
//		4-10
//		 피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어 나가는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면
//		  그 다음수는 2가 되고 그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다.
//		  1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램으 작성하시오.
//		1 1 / 2 3 5 8 13 21 34 55
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;//3번째 값
		System.out.print(num1+","+num2);
		
		for (int i = 0; i < 4; i++) {
			//num3을 기준으로 새로 시작
			
			num3 = num1+num2;
			num1 = num3;
			num2 = num3+num2;
		System.out.print(","+num1+","+num2);
		}
		
		
//추가문제    pallindrome
//		1-num1%10 //1의 자리 -> 맨앞으로
// 		2-num1/10 //10의 자리부터 -> *10 얘가 다시 num1 ->1,2반복
/* 	int a=12321;	
 	int p=a%12321
 			int re+=p;
 			a/=10;
 			re*=10;
 			p=a%10;
 			...*/
		
//		4-11
//		 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다.(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		/* 
		 String value = "12o34";
		 
		 char ch = ' ';
		boolean isNumber = true;
		//반복문과 charAt(int i)를 이용해서 문자열의 문자를 
		//하나씩 읽어서 검사한다
		 
		 for(int i=0; i < value.length(); i++){
		 // (1)
		 }
		 
		 if(isNumber){
		 	System.out.println(value+"는 숫자입니다.");
		 	}else{
		 	System.out.println(value+"는 숫자가 아닙니다.");	
		 	}
		 	
		 	*/
	/*	
		v ="72A89" 
 -> 자리수	01234
 		v.charAt() // v로부터 char ()번째 
		*/
		
	
	}
	
}