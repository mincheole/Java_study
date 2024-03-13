package Chap_7;

class Product8 {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매 시 제공하는 보너스 점수
	
	Product8(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스 점수는 제품 가격의 10%
	}
}

class Tv8 extends Product8 {
	Tv8() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100);
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer8 extends Product8 {
	Computer8() { super(200); }
	
	public String toString() { return "Computer"; }
}

class Buyer8 {	// 고객, 물건을 사는 사람
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	// 보너스 점수
	
	void buy(Product8 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다."); // p = p.toString()
	}
}

public class Exercise7_8_1 {
	public static void main(String[] args) {
		Buyer8 b = new Buyer8();
		
		b.buy(new Tv8());
		b.buy(new Computer8());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}
