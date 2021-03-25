package f_oop2;

public class Interface_01 {
	public static void main(String[] args) {
				
		Fightable f = new Fight();
		
		System.out.println(f instanceof Fight);
		System.out.println(f instanceof Unit);
		System.out.println(f instanceof Object);
		
		System.out.println(f instanceof Fightable);
		//f는 Fightable 인터페이스의 구현체이다.
		System.out.println(f instanceof Movable);
		Fightable ff = f;
		Movable mv = new Fight();
	}
}

class Fight extends Unit implements Fightable{

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	
}
interface Fightable extends Movable, Attackable{
	
}



interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}







































