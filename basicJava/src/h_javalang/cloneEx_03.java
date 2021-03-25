package h_javalang;

public class cloneEx_03 {
	public static void main(String[] args) {
		Circle c = new Circle(50, new Point(100,100));
		
		System.out.println(c);
		Circle cCopy = (Circle)c.deepCopy();
		System.out.println(cCopy);

		c.r = 300;
		c.p.x = 1000;
		System.out.println(c);
		System.out.println(cCopy);
	}
}


class Circle implements Cloneable{
	
	int r;
	Point p;
	
	public Circle(int r, Point p) {
		this.r = r;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", p=" + p + "]";
	}

	protected Object shallowCopy(){
		Object obj=null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("원을 복제할 수 없습니다.");
		}
		return obj;
	}
	
	protected Object deepCopy(){
		Object obj = null;
		 
		//원의 원본과 카피가 분리되어 포인트 값이 분리 => p가 주소지를 공유하지 않게
		try {
			obj = super.clone();//obj에 super의 복사본 저장
//			Circle c = (Circle)obj;//obj를 circle로 다운캐스팅해서 c로 참조
//			Point p = c.p; //circle(obj) 타입 c의 포인트를 다른 포인트에 저장
//			
//			Circle c1 = new Circle(c.r,new Point(c.p.x,c.p.y));//c의 반지름, c의 포인트로 새로운 원 생성
//			c.p.x //c 주소지의 x 원본과 같은값으로 초기화
//			c.p.y //c 주소지의 y 원본과 같은값으로 초기화
//			
//			return c1;
					
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("원을 복제할 수 없습니다.");
		}
		//문제점 : 점을 공유
		Point newP = new Point(p.x,p.y);
		((Circle)obj).p = newP;
		return obj;
	}
	
	
	
	
	
}