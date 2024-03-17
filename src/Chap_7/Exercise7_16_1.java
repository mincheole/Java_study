package Chap_7;

class Outer16 {
	int value = 10; 	// 외부 클래스의 iv, Outer15.this.value
	
	class Inner {
		int value = 20;	// 내부 클래스의 iv, this.value
		
		void method1() {
			int value = 30;
			System.out.println("             value : "+value);
			System.out.println("        this.value : "+this.value);
			System.out.println("Outer16.this.value : "+Outer16.this.value);
		}
	} // Inner 클래스 끝
} // Outer 클래스 끝

public class Exercise7_16_1 {
	public static void main(String[] args) {
		Outer16 outer = new Outer16();
		Outer16.Inner inner = outer.new Inner();
		inner.method1();
	}
}
