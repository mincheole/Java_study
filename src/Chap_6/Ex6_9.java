package Chap_6;

class MyMath2 {
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long   add()   { return a + b; }  // a, b는 인스턴스 변수
	long   sub()   { return a - b; }
	long   multi() { return a * b; }
	double div()   { return a / b; }
	
	// 인스턴스 변수와 관계없임 ㅐ개변수만으로 작업이 가능하다.
	static long   add(long a, long b)     { return a + b; } // a, b는 지역변수
	static long   sub(long a, long b)     { return a - b; }
	static long   multi(long a, long b)   { return a * b; }
	static double div(double a, double b) { return a / (double)b; }
}

public class Ex6_9 {
	public static void main(String[] args) {
		// 클래스 메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.sub(200L, 100L));
		System.out.println(MyMath2.multi(200L, 100L));
		System.out.println(MyMath2.div(200L, 100L));
		
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.multi());
		System.out.println(mm.div());
	}
}
