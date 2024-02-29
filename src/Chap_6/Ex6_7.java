package Chap_6;

class Data7 { int x; }

public class Ex6_7 {
	
	static void change(Data7 d) {	// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
	public static void main(String[] args) {
		Data7 d = new Data7();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
}

