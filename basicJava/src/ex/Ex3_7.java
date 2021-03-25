package ex;

public class Ex3_7 {//메서드영역에 클래스 Ex3_7을 로드하고 클래스 메서드인 main()과 factorial(int)를 함께 로드한다.
    public static void main(String[] args) {//main()을 호출하여 콜스택에 로드한다.
    	//반환값을 저장할 int형 변수 result를 선언하고 인자로 4를 factorial() 메소드에 전달하여 그 반환값을 저장
    	 int result = factorial(4);//클래스 메서드 factorial(4)의 결과를 저장할 main()의 지역변수 result를 선언한다. 클래스 메서드 factorial(int)는 같은 클래스 내에 존재하므로 클래스명.을 생략하고 메서드명()만으로 호출한다. 인자값 4를 대입하여 콜스택에 호출하고
    	
        System.out.println(result);//출력한다
    }

    static int factorial(int n) {//클래스 메서드인 factorial은 매개변수는 int 타입 n 하나이고 반환값은 int이므로 메서드명 앞에 int를 적는다
    	//int형 변수 result를 선언하고 0으로 초기화
    	int result = 0;//지역변수 result를 0으로 초기화한다
        if (n == 1) {//매개변수 n의 인자값이 1이라면
            result = 1;//지역변수 result에 1을 대입한다.
        } else {//매개변수 n의 인자값이 1이 아니라면
            result = n * factorial(n - 1); //지역변수 result에 재귀호출을 하여 인자값 n * factorial(n - 1)을 처리한다.
        }
        return result;//결과값을 리턴한다.
    }
}