package Chap_7;
import static java.lang.System.out;
import static java.lang.Math.random;

class SutdaDeck1 {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	
	SutdaDeck1() {   								   // 생성자
		for (int i=0; i < cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1 || num==3 ||num == 8);
			cards[i] = new SutdaCard1(num,isKwang);			
		}
	}
	public SutdaCard1 pick() {
		return cards[(int)(random()*CARD_NUM)]; 
		
	}
	public SutdaCard1 pick(int index) {
		return cards[index];
	}

	public void shuffle() {
		for(int i=0; i < cards.length; i++) {			
			int j = (int)(random()*CARD_NUM);
			SutdaCard1 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
}

class SutdaCard1 {
	int num;
	boolean isKwang;
	
	SutdaCard1() {		   							   // 생성자
		this(1, true);
	}
	SutdaCard1(int num, boolean isKwang) {		      // 생성자 오버라이딩
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_2 {

	public static void main(String[] args) {
		SutdaDeck1 deck1 = new SutdaDeck1();
		
		out.println(deck1.pick(0));
		out.println(deck1.pick());
		deck1.shuffle();
		
		for(int i =0; i < deck1.cards.length; i++) {
			out.print(deck1.cards[i] + ",");
		}
		out.println();
		System.out.println(deck1.pick(0));


	}

}
