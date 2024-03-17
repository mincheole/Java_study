package Chap_7;

class Outer15 {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner {
			int i = 400;
		}
	}
}

public class Exercise7_15_1 {
	public static void main(String[] args) {
		// 인스턴스 클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		Outer15 oc = new Outer15();
		Outer15.InstanceInner ii = oc.new InstanceInner();	// 내부 클래스의 객체 생성
		
		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer2.staticInner.cv : "+Outer15.StaticInner.cv);
		
		// 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer15.StaticInner si = new Outer15.StaticInner();	// 외부 클래스 이름 붙여줘야함
		System.out.println("si.iv : "+ si.iv);
	}
}
