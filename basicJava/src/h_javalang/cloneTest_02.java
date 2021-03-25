package h_javalang;

import java.io.Serializable;
import java.util.Arrays;

public class cloneTest_02 {
	public static void main(String[] args) {
		// 1. 점 3개를 저장해주세요 100,100 200,200 100,200
		
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);
		
		Point[] p = new Point[]{p1,p2,p3};
		Point[] pCopy = p.clone();//실제로 array에는 clone이 배열형태로 있음 주소지를 복사해서 값을 공유하게 됨. 얕은 복사
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(pCopy));
		
		p[0].x = 700;
		
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(pCopy));
		
	}
}

class Point implements Serializable{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}