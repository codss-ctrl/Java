package h_javalang;

import java.util.StringTokenizer;

public class StringTokenizerTest_01 {
	public static void main(String[] args) {
		String text = "100,,,200,,300,400";
		String[] sp = text.split("0,");//split -> 안 들어 있어도 빈 칸 인지해서 출력
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		System.out.println("==================================");
		StringTokenizer st = new StringTokenizer(text, "0,");//구분자 2개로 인지 
		
		while (st.hasMoreTokens()) {//안 들어있으면 token으로 인지 안함
			System.out.println(st.nextToken());
		}
		
		
	
	}
}
