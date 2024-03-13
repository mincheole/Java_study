package Chap_7;

class Product9 {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	Product9(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스 점수는 제품 가격의 10%
	}
	
	Product9() {}	// 기본 생성자
}

class Tv9 extends Product9 {
	Tv9() {	super(100);	}
	
	public String toString() { return "Tv"; }
}

class Computer9 extends Product9 {
	Computer9() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Audio9 extends Product9 {
	Audio9() { super(50); }
	
	public String toString() { return "Audio"; }
}

class Buyer9 {			// 고객, 물건을 사는 사람
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	// 보너스 점수
	Product9[] cart = new Product9[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;							// Product 배열에 사용될 카운터
	
	void buy(Product9 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
		cart[i++] = p;				// 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {			// 구매한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0;			// 구입한 물품의 가격합계
		String itemList ="";	// 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i < cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class Exercise7_9_1 {
	public static void main(String[] args) {
		Buyer9 b = new Buyer9();
		
		b.buy(new Tv9());
		b.buy(new Computer9());
		b.buy(new Audio9());
		b.summary();
	}
}
