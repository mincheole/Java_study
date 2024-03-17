package Chap_7;

public class Exercise7_12_1 {
	class InstanceInner1 {		// 인스턴스 내부 클래스
		int iv = 100;
//		static int cv = 100;			// 에러! static변수를 선언할 수 없다.
		final static int CONST = 100;	// final static은 상수이므로 허용
	}
	
	static class StaticInner1 {	// static 내부 클래스
		int iv = 100;
		static int cv = 200;	// static클래스만 static멤버를 정의할 수 있다.
								// static 클래스에서는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
//			static int cv = 300;			// 에러! static 변수를 선언할 수 없다.
			final static int CONST = 300; 	// final static은 상수이므로 허용
		}
	}
	public static void main(String[] args) {
		System.out.println(InstanceInner1.CONST);
		System.out.println(StaticInner1.cv);
//		System.out.println(LocalInner1.CONST); 	// 에러. 지역 내부 클래스는 메서드 내에서만 사용가능
	}
}
