package h_javalang;

import static java.lang.Math.*; 
public class MathTest_01 {
	public static void main(String[] args) {
				
		double d = 3.1415926535;
		
		//반올림
		System.out.println(Math.round(d));
		
		//올림
		System.out.println(Math.ceil(d));
		
		//버림
		System.out.println(floor(d));
		
		//제곱
		System.out.println(pow(3, 2));
		
		//루트
		System.out.println(sqrt(4));
		
		//Point2 클래스의 getDistance메서드를 호출하여 두 점 사이의 거리를 구해주세요
		
		Point2 p = new Point2(10, 20);
		 
		float b = p.getDistance(new Point2(50, 20));
		System.out.println(b);
		
		
		
	}//end main
	
	
}


class Point2{
	int x;
	int y;
	
	public Point2(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	
		
	public float getDistance(Point2 p2){
		float dis = round(sqrt(pow(x-p2.x,2)+pow(y-p2.y,2))*10)/10F;
		return dis;
		
	}
}



