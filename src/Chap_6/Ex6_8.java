package Chap_6;

class Data8 { int x; }

public class Ex6_8 {
	
	static Data8 copy(Data8 d) {
		Data8 tmp = new Data8();	// 새로운 객체 tmp를 생성한다.
		tmp.x = d.x;				// d.x의 값을 tmp.x에 복사한다.
		return tmp;					// 복사한 객체의 주소를 반환한다.
	}
	
	public static void main(String[] args) {
		Data8 d = new Data8();
		d.x = 10;
		
		Data8 d2 = copy(d);
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);
	}

}
