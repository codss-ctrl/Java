package qu;

public class Qu3_9 {
    public static void main(String[] args) {
        // 6. doubleDice메서드를 호출 하여라.
    	int dis = Qu3_9.doubleDice();//전역변수 dis를 선언하고 Qu3_9클래스의 클래스 메서드 doubleDice()를 클래스명.메서드명() 형식으로 호출하여 반환값을 dis에 대입한다.
        // 7. 총 이동거리를 출력하여라.
        // 예를 들어 주사위 값이 (3,3)이 나오게 되면 한 번 더 던질 수 있는 기회가 주어
        // 지며 두 번째 던진 주사위 값이 (5.2)가 되었다면 총 이동거리는 13이 된다.
    	
    	System.out.println("총 이동거리 : "+ dis);//dis 값 출력
    	
    	
    	
    }

    static int doubleDice() {//메서드 영역에 로드된 클래스 메소드로 매개변수는 없고 반환값이 int이므로 메서드명 앞에 int를 적는다
        // 1. 첫 번째 주사위 : 1~6사이의 임의의 정수를 변수 firstDice에 저장하여라.
    	int firstDice = (int)(Math.random()*6+1);//doubleDice()의 지역변수 firstDice에 1부터 6까지의 난수를 대입한다.
        // 2. 두 번째 주사위 : 1~6사이의 임의의 정수를 변수 secondDice에 저장하여라.
    	int secondDice = (int)(Math.random()*6+1);//doubleDice()의 지역변수 secondDice에 1부터 6까지의 난수를 대입한다.
    	System.out.println(firstDice + "+" + secondDice);//확인용 출력
        // 3. 두 주사위의 합을 변수 result에 저장하여라.
    	int result = firstDice + secondDice;//지역변수 result에 firstDice와 secondDice의 합을 대입한다.
        // 4. 만일 두 주사위의 값이 같다면 주사위 두개를 한 번 더 던지도록 하여라.
    	if (firstDice == secondDice) {//firstDice의 값과 secondDice의 값이 같다면
    		result += doubleDice();//재귀호출을 통해 메서드를 한번 더 실행하고 그 값도 result에 저장한다.
		}//if문 종료
        // 5. 전체 주사위 값의 합을 반환 하여라.
    	return result;//result 값을 반환하고 메서드는 종료된다.
    }
}