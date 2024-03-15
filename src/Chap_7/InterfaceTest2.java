package Chap_7;

class A2 {
	public void method(I2 i) {  // 인터페이스 I2를 구현한 타입만 매개변수로 허용
		i.method();
	}
}
// 클래스의 선언과 구현을 분리
interface I2 {
	public void method();
}

class B2 implements I2 {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C2 implements I2 {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.method(new B2());
		a.method(new C2());
	}
}
