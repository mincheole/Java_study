package Chap_7;

class Outer{
	class Inner {
		int iv = 100;
	}
}

public class Ex7_6 {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		System.out.print(i.iv);

	}

}
