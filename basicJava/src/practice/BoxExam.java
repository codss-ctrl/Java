package practice;

public class BoxExam {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		box.setObj("hello");//String을 매개변수로 넣었지만 reference타입은 Object로 변경되었음
		String str = (String)box.getObj();
		//변수에 담으려면 Object 타입의 변수에 담아야함
		//->Object에서 자식의 메서드까지는 사용할 수 없으므로 String으로 사용하려면 형변환
		System.out.println(str);
		
		box.setObj(1);//Integer
		int value = (int)box.getObj();
		
	}
}
