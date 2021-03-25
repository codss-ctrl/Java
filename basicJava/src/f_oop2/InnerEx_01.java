package f_oop2;

public class InnerEx_01 {
	public static void main(String[] args) {
		
		System.out.println(InnerEx_01.StaticInner.cv);
		
		InnerEx_01.StaticInner sc = new InnerEx_01.StaticInner();
		
		InnerEx_01 ie = new InnerEx_01();
		
		InnerEx_01.InstanceInner li = ie.new InstanceInner();
		
	}
	
	static class StaticInner{
		static int cv = 300;
		int iv = 200;
	}
	
	class InstanceInner{
		int iv = 50;
		static final int ccc = 70;
	}
	
	void method(){
		class LocalInner{
			int iv = 20;
//			static int = 60;
		}
	}
}

