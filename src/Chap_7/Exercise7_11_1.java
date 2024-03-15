package Chap_7;

interface MyInterface_2 {
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2_2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}

class Parent3_2 {
	public void method2() {
		System.out.println("method2() in Parent3");
	}
}

class Child3_2 extends Parent3_2 implements MyInterface_2, MyInterface2_2 {
	public void method1() {		// 오버라이딩
		System.out.println("method1() in Child3");
	}
}

public class Exercise7_11_1 {

	public static void main(String[] args) {
		Child3_2 c = new Child3_2();
		c.method1();
		c.method2();
		MyInterface_2.staticMethod();
		MyInterface2_2.staticMethod();
	}
}
