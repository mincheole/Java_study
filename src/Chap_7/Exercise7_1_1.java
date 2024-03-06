package Chap_7;

class Tv1 {
	boolean power; // 전원상태(on/off)
	int channel;   // 채널
	
	void power()       { power = !power; }
	void channelUp()   { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv1 extends Tv1 {				// SmartTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;					// 캡션상태(on/off)
	void displayCaption(String text) {
		if(caption) {					// 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class Exercise7_1_1 {

	public static void main(String[] args) {
		SmartTv1 stv = new SmartTv1();
		stv.channel = 10;					// 부모 클래스로부터 상속받은 멤버
		stv.channelUp();					// 부모 클래스로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;					// 캡션(자막) 기능을 킨다.
		stv.displayCaption("Hello, World");
	}
}
