package f_oop2;

public class OverTest {
	public static void main(String[] args) {
		OverGo og = new OverGo();
		String result = og.upMethod();
		System.out.println(result);//자식 것이 우선
//		og.??? 써서 부모 메서드 호출해오기 ->"OverUpmethod" 콘솔에 나오게
		
//		OverUp ou = new OverUp();
//		String result1 = ou.upMethod();
//		og.upMethod().equals(result1);
//		System.out.println(result1);
		String res = og.upMethod1();
		System.out.println(res);
	}
}

class OverUp{
	
	String upMethod(){
		return "OverUpmethod";
	}
	
}


class OverGo extends OverUp{
	@Override
	String upMethod(){
		return "OverGoMethod";//오버라이드
	}
	
	
	String upMethod(int a){
		return a+"OverGo";//오버로딩
	}
	
	String upMethod1(){
		return super.upMethod();
	}
}












