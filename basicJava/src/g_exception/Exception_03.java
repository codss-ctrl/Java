package g_exception;

public class Exception_03 {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;
		
		System.out.println(a);//오류 상관 x
		try {
			System.out.println(a/b);//오류 상관o
			System.out.println(b);
		} catch (ArithmeticException e) {
//			e.printStackTrace();//에러 발생 부분 출력하는 메서드
			System.out.println(e.getMessage());//에러 발생 이유만 출력하느 메서드
		}catch (Exception e) {

		}
		System.out.println("완료");
	}
}
