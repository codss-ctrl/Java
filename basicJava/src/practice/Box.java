package practice;

public class Box {
	private Object obj;
	
	public void setObj(Object obj){//매개변수가 Object라는 것은 Object뿐만 하니라 OBject의 후손이라면 무엇이든 다 들어올수 있음
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}
