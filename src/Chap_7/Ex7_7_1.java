package Chap_7;

class Outer_7 {
	static class Inner_7 {
		int iv=100;
	}
}

public class Ex7_7_1 {
	public static void main(String[] args) {
		Outer_7.Inner_7 ic = new Outer_7.Inner_7();
		System.out.println(ic.iv);
	}
}
