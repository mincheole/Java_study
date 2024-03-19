package Chap_7;

class SutdaCard_1 {
	int num;
	boolean isKwang;
	
	SutdaCard_1() {
		this(1,true);
	}
	
	SutdaCard_1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class SutdaDeck_1 {
	final int CARD_NUM = 20;
	SutdaCard_1[] cards = new SutdaCard_1[CARD_NUM];
	
	SutdaDeck_1() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0 || i ==2 || i==7) {
				cards[i] = new SutdaCard_1(i%10+1 ,true);
				continue;
			}
			cards[i] = new SutdaCard_1(i%10+1 ,false);
		}
	}
}

public class Ex7_1_1 {
	public static void main(String args[]) {
		SutdaDeck_1 deck = new SutdaDeck_1();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
	}
}
