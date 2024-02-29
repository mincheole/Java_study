package Chap_7;

class Ex7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv19());
		b.buy(new Computer());
		b.buy(new Tv19());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product19[] cart = new Product19[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product cart index 배열 에 사용될

	void buy(Product19 p) {
		if(this.money < p.price) {
			System.out.println("잔액이 부족하여" + p + "을/를 살 수 없습니다.");
			return;
		}
		this.money -= p.price;
		add(p);
	}

	void add(Product19 p) {
		if(i < cart.length) {
			cart[i++] = p;
		}
		Product19[] tmp = new Product19[cart.length*2];
		System.arraycopy(cart,0,tmp,0,cart.length);
		cart = tmp;
	}
	void summary() {
		int total=0;
		System.out.print("구입한 물건:");
		for(int i=0; i<cart.length;i++) {
			if(cart[i]==null) break;
			System.out.print(cart[i]+",");
			total += cart[i].price;
		}
		System.out.println("");
		System.out.println("사용한 금액:"+total);
		System.out.println("남은 금액:"+this.money);
	} // summary()
}

class Product19 {
	int price; // 제품의 가격

	Product19(int price) {
		this.price = price;
	}
}

class Tv19 extends Product19 {
	Tv19() { super(100); }

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product19 {
	Computer() { super(200); }

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product19 {
	Audio() { super(50); }

	public String toString() {
		return "Audio";
	}
}
