package Chap_7;

class Car7 {
	String color;
	int door;
	
	void drive() {	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {	// 멈추는 기능
		System.out.println("stop!!!");
	}
}

class FireEngine7 extends Car7 {
	void water() {
		System.out.println("water!!!");
	}
}

public class Exercise7_7_1 {
	public static void main(String[] args) {
		Car7 car = null;
		FireEngine7 fe = new FireEngine7();
		FireEngine7 fe2 = null;
		
		fe.water();
		car = fe;	// car = (car)fe;에서 형변환 생략
//		car.water();  // 컴파일 에러 Car타입의 참조변수로는 water() 호출불가
		fe2 = (FireEngine7)car;	// 자손타입 <- 조상타입.  형변환 생략 불가
		fe2.water();
	}
}
