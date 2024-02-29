package Chap_7;
import static java.lang.System.out;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	
	SutdaDeck() {   								   // 생성자
		for (int i=0; i < cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1 || num==3 ||num == 8);
			cards[i] = new SutdaCard1(num,isKwang);			
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {		   							   // 생성자
		this(1, true);
	}
	SutdaCard(int num, boolean isKwang) {		      // 생성자 오버라이딩
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}



public class Ex7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i =0; i < deck.cards.length; i++) {
			out.print(deck.cards[i] + ",");
		}

	}

}
