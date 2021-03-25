package f_oop2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		DrawShape ds = new DrawShape();
		
	}
	DrawShape(){
		super("밥신청하세요");//생성자 내에서 부모 생성자 호출, frame 생성자
		setSize(500, 500);
		setBackground(Color.MAGENTA); // 색은 static final
		setVisible(true);
		setResizable(false);
		//ds.paint() <<인자값 지정 호출
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	@Override
	public void paint(Graphics g){
		//1. 매개변수가 두개인 생성자를 이용하여 원을 만들어주세요 c
		Point p1 = new Point(100,100);
		Circle c = new Circle(50,p1);
		//2. g.drawOval()를 이용하여 원을 그려주세요
		g.drawOval(c.p.x, c.p.y,p1.x ,p1.y );
		//3. 매개변수가 하나인 생성자를 이용하여 삼각형을 만들어주세요 p
		//100,100 200,200 100,200
		Point p2 = new Point(200,200);
		Point p3 = new Point(100,200);
		Point[] p = new Point[]{p1,p2,p3};
		Triangle t = new Triangle(p);
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		 g.drawLine(t.p[0].x,t.p[0].y,t.p[1].x,t.p[1].y);
		 g.drawLine(t.p[1].x,t.p[1].y,t.p[2].x,t.p[2].y);
		 g.drawLine(t.p[2].x,t.p[2].y,t.p[0].x,t.p[0].y);
	}
}
class Point{
	int x;
	int y;
	
	Point(int a, int b){
		this.x = a;
		this.y = b;
	}
	
}

class Circle{
	//1. 반지름(정수)를 저장할 수 있는 변수 r을 선언해주세요
	int r;
	//2. 중심점을 저장할 수 있는 변수 p를 선언해 주세요
	Point p;
	//3. 매개변수가 두개인 생성자를 만들어주세요
	Circle(int r,Point p){
		this.r=r;
		this.p=p;
	}
	
	//4. 기본생성자를 만들어주세요
	// 단, 매개변수가 두개인 생성자를 이용하여 중심점 100,100 반지름 50으로 초기화해주세요
	Circle(){
		this(50,new Point(100,100));
			
	}	

}	
	
class Triangle{
	//1. 점 3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;
	//2. 매개변수가 한개인 생성자를 만들어주세요
	Triangle(Point[] p){
	this.p=p;
	}
	//3. 매개변수가 세개인 생성자를 만들어 주세요
	Triangle(Point a,Point b,Point c){
		p = new Point[]{a,b,c};
//		p = new Point[3];
//		p[1]=a;
//		p[2]=b;
//		p[3]=c;
	}
			
	
		
	
	
}

	


