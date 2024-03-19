package Chap_7;

class SutdaCard_2 {
	int num;
	boolean isKwang;
	
	SutdaCard_2() {
		this(1,true);
	}
	
	SutdaCard_2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class SutdaDeck_2 {
	final int CARD_NUM = 20;
	SutdaCard_2[] cards = new SutdaCard_2[CARD_NUM];
	
	SutdaDeck_2() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0 || i ==2 || i==7) {
				cards[i] = new SutdaCard_2(i%10+1 ,true);
				continue;
			}
			cards[i] = new SutdaCard_2(i%10+1 ,false);
		}
	}
	
	public void shuffle() {
		for(int i=0; i<CARD_NUM; i++) {
			int j =(int)(Math.random()*10);
			SutdaCard_2 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;		
		}
	}
	
	public SutdaCard_2 pick() {
		return cards[(int)(Math.random()*10)];
		
	}
	
	public SutdaCard_2 pick(int index) {
		return cards[index];
	}
}

public class Ex7_2_1 {
	public static void main(String[] args) {
		SutdaDeck_2 deck = new SutdaDeck_2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));;
	}
}
