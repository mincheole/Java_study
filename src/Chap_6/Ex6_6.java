package Chap_6;

class Data6 { int x; }

public class Ex6_6 {
	
	static void change(int x) {	// 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	public static void main(String[] args) {
		Data6 d = new Data6();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
}
