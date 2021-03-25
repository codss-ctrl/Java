package h_javalang;

public class cloneTest_01 {
	public static void main(String[] args) {
		CloneEx ce = new CloneEx(10, 20);
		CloneEx ceClone = (CloneEx)ce.clone();
		
		System.out.println(ce);
		System.out.println(ceClone);
		
		ce.x = 50;
		
		System.out.println(ce);
		System.out.println(ceClone);
		
		CloneEx ce2 = new CloneEx(10, 20);
		CloneEx ce3 = new CloneEx(10, 20);
		
	}
		
		
}

class CloneEx implements Cloneable{
	int x;
	int y;
	
	public CloneEx(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			 obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("객체를 복제할 수 없습니다.");
		}
		return obj;
	}



	@Override
	public String toString() {
		return "CloneEx [x=" + x + ", y=" + y + "]";
	}
	
}