package qu;

public class CardTest {//클래스 CardTest method area에 로드, 클래스메소드인 main()도 method area에 로드
    public static void main(String[] args) {//main() 호출되며 callstack 영역에 main() 로드
        // 1. Card클래스의 폭을 출력하여라. 
    	System.out.println(Card.width);//다른 클래스에 있는 클래스 변수는 해당 클래스명.변수명 으로 호출한다.
        // 2. Card클래스의 높이를 출력하여라.
    	System.out.println(Card.heigh);//다른 클래스에 있는 클래스 변수는 해당 클래스명.변수명 으로 호출한다.
        // 3. Card클래스의 객체를 생성해 주세요. 변수명 : cd1
    	Card cd1 = new Card();//Card 클래스를 cd1 참조변수를 선언하여 객체화하고, main()의 지역변수로 선언된 콜스택의 cd1은 힙영역의 cd1주소지를 참고한다.
        // 4. 변수 cd1의 이름을 "Daniel"로 변경하여라.
    	cd1.name = "Daniel";//heap 영역의 cd1 주소지에 있는 인스턴스 변수인 name은 참조변수명.변수명으로 표현한다. "Daniel"을 cd1 주소지의 인스턴스 변수 name에 대입한다.
        // 5. 변수 cd1의 직원 번호를 "19961210"로 변경하여라.
    	cd1.number = 19961210;//heap 영역의 cd1 주소지에 있는 인스턴스 변수인 number는 참조변수.변수명으로 표현한다.19961210을 cd1 주소지의 인스턴스 변수 number에 대입한다.
        // 6. Card클래스의 객체를 생성해 주세요. 변수명 : cd2
    	Card cd2 = new Card();//Card 클래스를 cd2 참조변수를 선언하여 객체화하고, main()의 지역변수로 선언된 콜스택의 cd2은 힙영역의 cd2주소지를 참고한다.
        // 7. 변수 cd2의 이름을 "nayeon"로 변경하여라.
    	cd2.name = "nayeon";//heap 영역의 cd2 주소지에 있는 인스턴스 변수인 name는 참조변수.변수명으로 표현한다. "nayeon"을   cd1 주소지의 인스턴스 변수 name에 대입한다.
        // 8. 변수 cd2의 직원 번호를 "19950922"로 변경하여라.
    	cd2.number = 19950922;//heap 영역의 cd2 주소지에 있는 인스턴스 변수인 number는 참조변수.변수명으로 표현한다.19950922을 cd2 주소지의 인스턴스 변수 number에 대입한다.
        // 9. 결과의 출력1과 같이 출력하여라.
    	System.out.println("1번 카드의 이름은 "+cd1.name+", 직원번호 "+ cd1.number+", 폭은 "+Card.width+", 높이는 "+Card.heigh+"이다.");
    	System.out.println("2번 카드의 이름은 "+cd2.name+", 직원번호"+ cd2.number+", 폭은 "+Card.width+", 높이는 "+Card.heigh+"이다.");
        // 10. Card클래스의 폭을 70으로 변경하여라.
    	Card.width = 70;//Card 클래스의 클래스 변수인 width의 값을 70으로 변경한다.
        // 11. Card클래스의 높이를 100으로 변경하여라.
    	Card.heigh = 100;//Card 클래스의 클래스 변수인 heigh의 값을 100으로 변경한다.
        // 12. 결과의 출력2와 같이 출력하여라.//모든 인스턴스는 공통된 저장공간(변수)를 공유하게 된다.그러므로 클래스변수의 값을 공유하여 같은 값을 출력한다.
    	System.out.println("1번 카드의 이름은 "+cd1.name+", 직원번호 "+ cd1.number+", 폭은 "+Card.width+", 높이는 "+Card.heigh+"이다.");
    	System.out.println("2번 카드의 이름은 "+cd2.name+", 직원번호 "+ cd2.number+", 폭은 "+Card.width+", 높이는 "+Card.heigh+"이다.");
    }
}

class Card {//클래스 친구들과 함께 메서드 영역에 로드된다.
    String name; // 이름 //인스턴스 변수,기본값 null로 초기화되어 heap영역에 로드된다.
    int number; // 직원번호 // 인스턴스 변수,기본값 0으로 초기화되어 heap영역에 로드된다.
    static int width = 100; // 폭 // 클래스 변수,기본값 0으로 초기화되어 method area 영역에 로드된다.
    static int heigh = 250; // 높이//클래스 변수,기본값 0으로 초기화되어 method area 영역에 로드된다.
}