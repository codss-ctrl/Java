package g_exception;

public class Exception_04 {
	public static void main(String[] args) {
		
		Exception ee = new Exception("이유");
		
		try {
			throw ee;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		RuntimeException re = new RuntimeException("ㅎ");
		
		try{
			throw re;
	
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. 
		//2.
		
	}
}
