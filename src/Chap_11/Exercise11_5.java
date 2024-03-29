package Chap_11;

import java.util.*;

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
	
	public boolean equals(Object obj) {
		if(obj instanceof SutdaCard) {
			SutdaCard c = (SutdaCard)obj;
			return num == c.num && isKwang == c.isKwang;
		} else return false;
	}
	
	public int hashCode() {
		return Objects.hash(this.num, this.isKwang);
	}
	
//	public int hashCode() {
//		return toString().hashCode();
//	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}
public class Exercise11_5 {

	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		SutdaCard c3 = new SutdaCard(1, true);
		
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		
		System.out.println(set);
	}
}
