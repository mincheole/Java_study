package Chap_7;

class Outer1 {
	static class Inner1 {
		int iv = 20;
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		//Outer1 o = new Outer1();
		Outer1.Inner1 i = new Outer1.Inner1();
		System.out.print(i.iv);

	}
}
