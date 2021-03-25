package f_oop2;

import java.util.Vector;

public class ProductTest_01 {
	public static void main(String[] args) {
		Computer c1 = new Computer(200, "c1");
		HandPhone h1 = new HandPhone(100, "h1");
		Styler s1 = new Styler(400, "s1");
		
		Buyer b = new Buyer("손1", 1000);
		DBclass db = new DBclass();
		boolean result  = db.addBuyer(b);
		System.out.println(result);
		System.out.println("------------------");
		b.buy(s1);
		b.buy(s1);
		b.buy(h1);
		System.out.println("------------------");
		//summary
		b.Summary();
		//refund
		System.out.println("------------------");
		Buyer c = new Buyer("손님1", 600);
		boolean result1  = db.addBuyer(c);
		System.out.println(result1);
		System.out.println("-------------------");
		c.buy(s1);
		System.out.println("-------------------");
		c.Refund(s1);
		System.out.println("------------------");
		boolean result3 = db.removeBuyer(c);
		System.out.println(result3);
				
	}
}

class Product{
	int price;
	String name;
	int mileage;
	
	
	
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
		mileage = price/20;
		
	}

	
}

class Computer extends Product{

	public Computer(int price, String name) {
		super(price, name);
			
	}

	@Override
	public String toString() {
		return "Computer";
	}
}	
class HandPhone extends Product{

	public HandPhone(int price, String name) {
		super(price, name);
		
	}

	@Override
	public String toString() {
		return "HandPhone";
	}
	
}
	
	
class Styler extends Product{

	public Styler(int price, String name) {
		super(price, name);
		
	}

	@Override
	public String toString() {
		return "Styler";
	}
	
}

class Buyer{
	String name;
	int money;
	int mileage;
	
	Vector<Product> item = new Vector<>();//구매내역
	
	public Buyer(String name, int money) {
		this.name = name;
		this.money = money; 

	}

	void buy(Product p){
		if(money<p.price){
			System.out.println("나가");
			return;
		}
		money -= p.price;
		mileage += p.mileage;
		item.add(p);
		
		
		System.out.println(p+" 상품을 구매하셨습니다. 감사합니다.");
	}

	
	void Summary(){
		
		System.out.println("\t영\t수\t증");
		System.out.println("구매내역");
		//물건 가격,
		int sum = 0;
		
		if (item.isEmpty()) {
			System.out.println("구매내역이 없습니다.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum = p.price;
			System.out.print("\t"+p.name+"  "+p.price+ "만원");
			System.out.println();
		}
		System.out.println();
		System.out.println("\t합계"+sum+"만원");
		System.out.println("\t"+name +" 고객님의 남은돈은 "+money +"만원이고, 마일리지는 "+mileage+"입니다.");
		System.out.println("\t호갱님 감사합니다."); 
	}
	
	//반품 refund
	/*
	1. 물건을 구매한 적이 없는 경우 
	
	}
	2. 자신이 구매한 물건일때만 반품이 가능해야 한다. 
	*/
	void Refund(Product p){
		if(item.isEmpty()){
			System.out.println("사기꾼");
		}
		if (item.remove(p)) {//true
			//반납
			money += p.price;
			mileage -= p.mileage;
			System.out.println(p.name+" 반품 완료되었습니다.");
			System.out.println("남은 돈 : " +money+", 마일리지 : "+mileage);
			return;
		}else{
			System.out.println(" 구매하신 물건이 없습니다.");
		}
		
//		if(item.removeElement(p)){//그 물건 삭제
//			money += p.price;
//			mileage -= p.mileage;
//			System.out.println("반품 완료되었습니다.");
//			System.out.println("남은 돈 : " +money+", 마일리지 : "+mileage);
//			return;
//		}
//		System.out.println("여기서 구매하신 물건이 없습니다.");
		
	}
	
	
	
	
}

//1. 물건의 수량을 관리할 수 있도록 해주세요
	
//2. 여러사람을 관리할 수 있도록 해주세요

//3. 구매내역
class Sale{
	static int seq = 1;
	int mount;
	String date;
	String mem_name;
	String pro_name;
	
}

class DBclass{//테이블스페이스
	//1. 사람들 관리
	Vector<Buyer> buyers = new Vector<>();
	
//	public boolean addBuyers(Buyer b) {
//		Buyer buyer1 = new Buyer(b.name,b.money);
//			boolean result = buyers.add(buyer1);
//			return result;
//		}
	public boolean addBuyer(Buyer b){
		boolean result = buyers.add(b);
		return result;
	}
	public boolean removeBuyer(Buyer b) {
		buyers.remove(b);//buyer 벡터에서 고객 b 삭제
		boolean result = buyers.contains(b);
		return result;// 벡터에서 고객이 없으면 false 반환, 있으면(삭제x시) true
	}
	//2. 물건들 관리
	Vector<Product> product = new Vector<>();
		public boolean addProduct(Product p) {
			Product p1 = new Product(p.price, p.name);
			boolean result = product.add(p1);
			return result;
		}
		
	//3. 구매내역
	Vector<Sale> sale = new Vector<>();
		 
//		public boolean addSale(Product p) {
//			
//		}

	
}


