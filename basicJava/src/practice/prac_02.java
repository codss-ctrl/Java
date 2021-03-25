package practice;

public class prac_02 {
	public static void main(String[] args){
		int result = 5+15+7;
		System.out.println(result);
		int result2 = 2+3*4;
		System.out.println(result2);
		int result3 = 3* (4+2);
		System.out.println(result3);
		
		int number = 4;
		++ number;
		System.out.println(number);
		number++;
		System.out.println(number);//6
		
		int number2=++number;
		System.out.println("number:"+number);//7
		System.out.println("number2:"+number2);//7
		
		int number3=number++;
		System.out.println("number:"+number);//8
		System.out.println("number3:"+number3);//7
		
		//1.
		int num = 30;
		char ch = 'C';
		int result1 = num++ +3 + ++ch + ++num;
		System.out.println(result1);//133
		System.out.println("ch:"+ch);//68
		System.out.println("result1:"+result1);//133
		
		
		//2-5
		//byte b = 10;
		//byte b2= (byte)~b;//-11
		
		//2-7
		boolean power = false;
		System.out.println(power);
		power = !power;
		System.out.println(power);
		
		System.out.println("5/2값:"+5/2);// 5/2 ->int 이므로 2
		System.out.println("(float)5/2값:"+(float)5/2); //float이므로 2.5f
		
		//2-7
		int x = 18;
		int y = 7;
		int res= x % y; //2
		System.out.println(res);
		
		//2-10
		float f01 = 0.1f;
		float f02 = 10.0f;
		double do01 = 0.1;
		double do02 = 10.0;
		String str1 = "화이팅";
		
		System.out.println(f01 == do01);// false
		System.out.println(f02 == do02); // true
		System.out.println(str1 == "화이팅");//true	
		
		boolean b1 = true;
		boolean b3 = false;
		System.out.println(b1&&b3);//false
		int in01 = 10;
		boolean re1 = in01 % 2 == 0; // int0이 2의 배수인지 확인 true
		System.out.println(re1);
		boolean re2 = in01 % 4 == 0; // int01이 4의 배수인 확인. 
		System.out.println(re2); //false
		System.out.println(re1||re2);//int01이 2 또는 4의 배수인지 확인. true
		
		
		int num1 = -10;
		int resul = num1 >= 0? num1:-num1;
		System.out.println(resul);
		
		char x1 = 'B';
		String reefr1 = x1 > 0? "대문자": "소문자";
		System.out.println(reefr1);
		
		int red = 6;
		red = red+ 7;
		System.out.println(red);
		
				
		
		
		
		
		
		
		
		
	}
}










