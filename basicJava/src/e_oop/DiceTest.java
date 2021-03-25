package e_oop;

public class DiceTest {
	public static void main(String[] args) {
		
		//2. throwDice메서드를 호출
		
		DoubleDice dice = new DoubleDice();//인스턴스화
		
		int res = dice.throwDice();
		System.out.println(res);
		//3. JVM 3-3, 4-4, 3-1 나온 경우
		
	}
}
class DoubleDice{
	
	

	//1. 주사위 두개를 던져서 그 합을 반환하는 throwDice 메서드를 만들어주세요
	//단, 두개의 주사위 값이 같으면 한번더 던진다.
	
	int throwDice(){ 
		
		int a = (int)(Math.random()*6+1); //주사위 1
		int b = (int)(Math.random()*6+1); //주사위 2
		System.out.println(a + "+" + b);
		int result = a+b;
		if (a == b){
			result += throwDice();
		}
		return result;
	}


}






/*	//클래스로
static int a =(int)Math.random()*6+1;;
static int b = (int)Math.random()*6+1;;

int throwDice(){
	int result = 0;
	
	result = a+b; //두수 합 저장
	
	if (a == b) { // 두 수가 같으면
	int	result1 = throwDice(); //메서드 다시
		result+=result1;
	}
	return result;

}

*/	







