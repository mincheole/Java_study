package Chap_7;

class Outer_6 {
	class Inner_6 {
		int iv=100;
	}
}

public class Ex7_6_1 {
	public static void main(String[] args) {
		Outer_6 oc = new Outer_6();
		System.out.println(oc.new Inner_6().iv);
	}
}
