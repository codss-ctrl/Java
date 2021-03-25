package z_exam;

public class Exam_03 {
	public static void main(String[] args){
		
		/*
		3-1 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
		
		byte b = 10;
		char ch = 'A';
		int in = 100;
		long lo = 1000L;
		
		(1) b = (byte) in;
		(2) ch = (char) b;
		(3) short s = (short) ch;
		*(4) float f = (float) lo;
		*(5) in = (int) ch;
		
		[byte->short->int->long->float->double
		        char->int                     ]
		*/  
		
		/*
		3-2 다음 연산의 결과를 적으시오.
		
		class Evercise3_2
		 public static boid main(String[] args){
		  int x = 2;
		  int y = 5;
		  char c = 'A'; //A의 문자코드는 65
		  
		  System.out.println(1 + x << 33); // 6
		  System.out.println(y >== 5 || x <0 && x >2);
		  System.out.println(y+=10-x++);
		  System.out.println(x+=2);
		  System.out.println(!('A'<=c&&c<='Z'));
		  System.out.println('C'-c);//char 'C' - char 'A' = int 67 - int 65 = int 2
		  System.out.println('5'-'0');
		  System.out.println(c+1);//66
		  System.out.println(++c);//66
		  System.out.println(c++);//65
		  System.out.println(c);//65
		  }
		*/
		 int x = 2;
		  int y = 5;
		  char c = 'A';
		  
		  System.out.println(1 + x << 33);// 1+4<<33=> 3*2^33 는 int의 표현범위를 넘는다.
		  //32bit인 int에서 자리수를 32번 바꾸면 2^1의 자리로 돌아온다.=> 3*2=>10
		  System.out.println(y >=5 || x <0 && x >2);//true || false && false ->true && true
		  												//true
		  System.out.println(y+=10-x++);//5+=(10-2) => 13//y*=10-x++는 5*8=40
		  System.out.println(x+=2);//3+=2 =>5
		  System.out.println(!('A'<=c&&c<='Z'));//c는 대문자 A이므로 사이에 들어간다.true ->의 not !=> false
		  System.out.println('C'-c);//char 'C' - char 'A' = int 67 - int 65 = int 2
		  System.out.println('5'-'0'); // char -char = int -int =5-0 = int 5
		  System.out.println(c+1);//66 =>char+int 1=> int+ int =>int 66
		  System.out.println(++c);// B 
		  System.out.println(c++);// B 
		  System.out.println(c);// C ->B++=B+1
		 
		  
		/*
		3-3 아래는 변수 num의 값에 따라 "양수", "음수", "0" 을 출력하는 코드이다. 
		     삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		     
		     class Exercise3_2{
		      public static void main(String[] args){
		       int num = 10;
		       String result = *(1)*;
	         System.out.println(result);}}
		      	num>0?"양수":"음수"
		      	양수 || 0  음수
		      	양수냐? "양수" : 음수냐? "음수 : "0"
		      	(1) num>0? "양수" : num<0?"음수": "0";
		      	*/
		  
		  int num2 = 10;
	      	String re = num2>0? "양수" : num2<0?"음수": "0";
	 	  System.out.println(re);
		      
		
		      	
		/*
		 
		3-4
		아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 
		만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
		(1)에 알맞은 코드를 넣으시오.
		
		class Exercise3_4{
			public static void main(String[] args){
			int apples = 123; //사과의 개수
			int bucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
			int numOfBucket = ( (1) ); // 모든 사과를 담는데 필요한 바구니의 수
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
			
			}
		
		}
	
		*/
		  int apples = 123; //사과의 개수
			int bucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
			int numOfBucket = (apples/10 + apples%bucket == 0? +0:+1); // 모든 사과를 담는데 필요한 바구니의 수 123%10
			System.out.println("필요한 바구니의 수 :"+numOfBucket);
			//apples/(bucket-1)/10f
		       
		  /*
		    3-5 아래의 코드는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
		        만일 변수 num의 값이 '456'이라면 '400' 이 되고,
		    '111'이라면 '100'이 된다. (1)에 알맞은 코드를 넣으시오.
		    class Exercise3_5{
		    	public static void main(String[] args){
		    	 int num = 456;
		    	 int result = (1) (int)(num/100);
		    	 System.out.println(result);
    	 		  
    	 		   (num-num%100)으로도 가능
    	 		   
		    	}
		    	*/
						    	
		    	 int num = 456;
		    	 int result = (num/100)*100;
		    	 System.out.println(result);
		    	 		    	
		    /*
		      3-6 아래 코드의 문제점을 수정해서 실행 결과와 같은 결과를 얻도록 하시오.
		      class Exercise3_6
		       public static void main(String[] args){
		       byte a =10;
		        byte b = 20;
		        byte c = a+b;
		        char ch = 'A';
		        ch = ch + 2 ;
		        float f = 3/2;
		        long l = 3000*3000*3000;
		        float f2 = 0.1f;
		        double d = 0.1;
		        boolean result1 = d == f2;
		        System.out.println("c="+c);
		        System.out.println("ch="+ch);
		        System.out.println("f="+f);
		        System.out.println("l="+l);
		        System.out.println("result="+result);
		      */ 
		       
		       
		   
			byte a = 10;
			byte b = 20;
	        byte c1 = (byte)(a+b); //byte +byte=>int가 됨
	        char ch = 'A';
	        ch = (char)(ch + 2) ; // char +int => (char)(int + int)
	        float f = 3/2F;//1.5 ===> 사용자 지정변수일 경우가 많으므로 캐스팅이 나음 (float)3/2
	        long l = (long)3000*3000*3000;//27000000000 최종 타입은 int이므로 표현범위 overflow. long으로. 
	        float f2 = 0.1F;//0.1
	        double d = 0.1;
	        boolean result1 = (boolean)((float)d == f2);
	        
	        System.out.println("c="+c1);
	        System.out.println("ch="+ch);//int 65 + 2 =>ch=c
	        System.out.println("f="+f);// 1.5
	        System.out.println("l="+l);// 27000000000
	        System.out.println("result="+result1);
			
		    /*
		    3-7 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 
		       예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다. 19의 경우 20이고, 81의 경우 90이 된다.
		     30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		     class Exercise3_7{
		     public static void main(String[] args){
		     	int num = 24;
		     	int result = (1)
		     	System.out.println("result3:"+result);
		     	
		     	((int)(num3/10)*10) -num3
		     }
		     }
		     
		    		     		   
		*/
	        
	        int num3 = 24;
	      int result3 = (num3/10 + 1)*10-num3;
	     			
	     	// int result3 = 10-num%10;
	     	
	     	
	     	System.out.println("result3:"+result3);
	     	
		/*
		 3-8 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
		    변환공식이 'C = 5/9 x (F-32)'라고 할 때, (1)과 (2)에 알맞은 코드를 넣으시오.
		    단, 변환 결과값은 소수점 셋째 자리에서 반올림해야 한다.
		    
		    class Exercise3_8{
		    	public static void main(String[] args{
		    	 
		    	 int fahrenheit = 100; //화씨 = F
		    	 
		    	 float formula = ((1)); //변환공식 활용
		    	 	    	  C = 5/9F x (fahrenheit-32)
		    	 	    	  
		    	 float celcius = ((2)); //formula 소수점 셋째자리에서 반올림
		    	 (int)(1000*formula)/1000F
		    	 
		    	 System.out.println("Fahrenheit:"+fahrenheit);
		    	 System.out.println("Celcius:"+celcius);
		    	
		    	}
		    }
		    
		  
		 */
	        int fahrenheit = 100; //화씨 = F
	    	 
	    	 float formula = 5/9F *(fahrenheit-32); //37.77777
	       	 float celcius = (int)(100*formula+0.5)/100F; 
	    	 
	    	 
	    	 System.out.println("Fahrenheit:"+fahrenheit);
	    	 System.out.println("Celcius:"+celcius);
	}
}
