package practice;

import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("상단에 표시되는 글자");
		f.setSize(300, 200);//창의 크기 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.EXIT_ON_CLOSE => x버튼을 누르면 프레임은 닫히지만 프로그램은 종료되지 않아서 프로그램도 종료하기위해
		f.setVisible(true);//false시 창이 안 뜸
	}
}

class Frame2 extends JFrame{
	public Frame2(){
		 setTitle("상단에 표시되는글자(상속이용)");
	        setSize(300, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);

	}
}