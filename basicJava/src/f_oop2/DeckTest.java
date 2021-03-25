package f_oop2;

import java.util.Arrays;


public class DeckTest {
	public static void main(String[] args){ //기본, 매개변수2개 다이아5
//		//c1 -> 기본생성자 1,1
//		Card c1 =new Card();
//		System.out.println(c1.toString());
//		
//		//c2 -> 매개변수 두 개 2, 5 DIAMOND,5
//		Card c2 = new Card(2,5);
//		System.out.println(c2.toString());
		
		Object obj = new Card();
		System.out.println(obj);

		//8. 카드 한 벌을 만들어주세요 d변수명
		Deck d = new Deck();//기본생성자 호출
		System.out.println(Arrays.toString(d.c));
		//9. d에서 0번째 카드 가져오세요 - method
		//d.c[0];
		Card zero = d.pick(0);
		System.out.println("9. , "+zero);
		//10. d에서 임의의 카드를 한장 꺼내주세요 - method
		Card random = d.pick();
		System.out.println("10. , "+random);
		//11. d를 섞어주세요
		d.shuffle();
		//11.5 d에서 0번째 카드 가져오세요 - method
		Card szero = d.pick(0);
		System.out.println("11.5 , "+szero);
		//12. d를 1000번 섞어주세요 
		 d.shuffle(1000); 
		//12.5 d에서 0번째 카드를 가져오세요 - method 
		 Card s = d.pick(0);
		System.out.println("1000번 셔플 후 , "+ s);
		
//		Deck d1 = new Deck();
//		d1.shuffle(1000);
//		System.out.println(d1.pick(0));
		
	}

}

class Card{
	static final int KIND_MAX = 4;//카드 무늬 수
	static final int NUM_MAX = 13;//무늬별 카드 수
	
	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	Card(){//기본생성자 안에 매개변수 2개짜리 호출 카인드 넘버 1로 초기화
		this(SPADE,1);
	}
	
	@Override
	public String toString(){
		String kind = "";
		String number = "";
		
		switch (this.kind){
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		case 4:
			kind = "CLOVER";	
		}
		
		switch (this.number){
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
		default:
			number += this.number;
		}
		
		
		//위는 스페이스 a 밑은 다이아5
		
		return kind + " : " +number;
	}
	
	
}

class Deck{
	//1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM 을 Card클래스의 상수를 이용하여 초기화해주세요
	static final int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX; //상수는 static final 붙여야 한다
	//2. 카드를 CARD_NUM만큼 저장해주세요. 변수명: c 52장 저장
	Card[] c = new Card[CARD_NUM];
	
	//3. 기본생성자를 만들어 주세요
	//	 단 기본생성자 내에서 c의 모든 방을 카드로 채워주세요 1,1 -> 4,13
	Deck(){
		int row=0;
		for(int i=1 ; i<Card.KIND_MAX+1; i++){
			for (int j =1 ; j< Card.NUM_MAX+1; j++){
			 c[row++] = new Card(i,j);
			}
		}
	}	
//	Deck(){
//		for (int i = 0; i < CARD_NUM.length; i++) {
//			c[i] = new Card(i/Card.NUM_MAX+1,i%Card.NUM_MAX+1)
//		}
//	}
	//4. c에서 인자값으로 받은 번째 방의 카드 한 장을 반환해주세요 pick
	
	Card pick(int a){
	 Card card1 = c[a];
	 return card1;
	}	
	
	//5. c에서 임의의 방번째 카드 한장을 반환해주세요 메서드명 pick
	//	 단, 4번의 pick 메서드를 활용해주세요
	Card pick(){
		Card random = pick((int)(Math.random()*CARD_NUM));
		return random;
	}
	//6. 카드를 섞어주세요. 메서드명 shuffle
	//	 단. 연습문제 5-6번을 활용해주세요
	void shuffle(){
		for (int i = 0; i < CARD_NUM; i++) {
			Card card3 = pick();//랜덤 카드1장
			Card temp = c[i];//card1 -> c[i]번째 카드
			c[i] = card3;
			card3 = temp;
		}
	}
	//7. 카드를 섞어주세요 shuffle 메서드명
	//	 인자값으로 받은 횟수만큼 반복해주세요
	//	 임의의 방의 카드와 또다른 임의의  방의 카드를 바꿔주세요
	void shuffle(int count){
		for (int i = 0; i < count; i++){
			Card card3 = pick();//랜덤 카드1장
			Card card4 = pick();//다른 랜덤 카드1장
			Card temp = card3;
			card3 = card4;
			card4 = temp;
			
		
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}