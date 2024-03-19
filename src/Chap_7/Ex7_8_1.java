package Chap_7;

class Outer_8 {
	int value = 10;
	
	class Inner_8 {
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer_8.this.value);
		}
	}
}

public class Ex7_8_1 {

	public static void main(String[] args) {
		Outer_8 oc = new Outer_8();
		Outer_8.Inner_8 inner = oc.new Inner_8();
		inner.method1();
	}
}
