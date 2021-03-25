package practice;



public class Prac_03 {
	public static void main(String[] args){
	//q2-14 1.2.
		boolean power = true;
		if (power==true) {
			System.out.println("켜져있습니다.");
		}
		
	//2-15
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자 입력해주세요");
//	 	int num1 = sc.nextInt();
//	 	if (num1%2==0) {
//	 		System.out.println("2의 배수입니다.");
//		}else{
//			System.out.println("2의 배수가 아닙니다.");
//		}
		
	//2-13
	 	for (int i = 0; i < 3; i++) {
			System.out.println("Hello Java");
		}
		
	//2-19-1
	 	for(int i = 0; i <=5;i++){
	 		System.out.println(i);
	 		}
	//2-19-2 	
	 	for(int i = 5; i >=0;i--){
	 		System.out.println(i);
	 		}
	//2-19-3 여기부터!!!
	 	int a =0;
	 	for(int b = 2; b <11;b++){
	 		a += b;
	 				 	
	 	}
	 	System.out.println(a);
	 	
	 	
	//2-20
	 //짝수단 구구단 2*1 2*2 2*3 4*1 
	 	for(int y = 1; y<10 ; y++){  
	 	for (int i = 1; i < 10; i++) {
	 		if (i%2==0) {
	 			System.out.println(y+"*"+i+"="+y*i);
	 			
			}
	 		
	 		}
	 	}
/*	 	int dan2 = 1;
	 	int k = 2;
	 	while (dan2 % 2 ==0 && dan2<10) {
	 		System.out.println(dan2+"*"+k+"="+dan2*k);
			++k;
		}
	*/ 	
		
		//2-20-2 짝수 단의 홀수 곱
	 	for (int i = 1; i < 10; i++) {
	 		for (int j = 1; j < 10; j++) {
				if (i%2==1 && j%2==0) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
		}
	 	
	 	//2-21
//		String st = "*";
//		String st = "**";
//		String st = "***";
//		String st = "****";
//		String st = "*****";
	 	
	 		
	 		for (int j = 1; j <=5 ; j++) {
	 			for (int p = 1; p<=j; p++) {
	 				System.out.print("*");
				}System.out.println();
			}	
		
		
	 /*	
	 	
	 	for (int i = 0; i < 3; i++) {
	 		for (int j = 0; j < 3; j++) {
	 			System.out.print("*");
			}
	 		System.out.println();
		}
	 	
	 	*/
	 		
	 		
//	 	q2-22 1~100 hap
	 		int i =0;
	 		int hap=0;
	 		while (i<100) {
	 			i++; //99+1로 100까지 세짐
				hap+=i;
			}System.out.println(hap);
	 		
	 		
//		q2-23 1부터 1씩 증가하는 정수들을 더하였을때 합계가 200을 넘게 되는 최초의
//			값과 합계
			
			int ap = 0;
			int hap2 = 0;
			while (hap2<200) {
				ap++;//1~
				hap2+=ap;
			}System.out.println(hap2); //hap2=210
			System.out.println(ap);//ap=20
			
			
//		q2-24
			
//			Scanner sc = new Scanner (System.in);
//			System.out.println("go");
//			int num1 = sc.nextInt();
			
//		q2-16 
	/*		int input=0;
			int answer = (int)(Math.random()*100+1);
			Scanner sc1 = new Scanner(System.in);
			
			do {
				System.out.println("1와 100 사이의 정수를 입력하세요.:");
				input = sc1.nextInt();
				
				if (input<answer) {
					System.out.println("더 큰 수를 입력해주세요");
				}else if (input<answer) {
					System.out.println("더 작은 수를 입력해주세요.");
				}
			} while (input !=answer);{
			System.out.println("정답입니다.");
			}	
			*/
//		q2-17
			int count = 1;
			int sum = 0;
			while (true) {
				sum+=count;
				if (sum>200) {
					break; //가장 가까운 반복문을 벗어난다.
				}
				count++;
			}
			System.out.println("합계가 200을 넘는 정수는 : "+count+"이다.");
		
//		q2-18
			for (int j = 3; j <21; j++) {
				if (j%2 !=0) {
					continue;
					//조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동한다.
//					break문과 달리 반복문을 벗어나지 않는다.
				}System.out.println(j);
			}
			
			
			
	}		
}
