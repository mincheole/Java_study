package Chap_7;

import static java.lang.System.out;

class Outer2 {
	int value = 10;
	
	class Inner2 {
		int value = 20;
		
		void method1() {
			int value = 30;
			
			out.println(value);
			out.println(this.value);
			out.println(Outer2.this.value);
		}
	}
}

public class Ex7_8 {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.Inner2 i = o.new Inner2();
		i.method1();

	}

}
