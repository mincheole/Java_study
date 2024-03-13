package Chap_7;

abstract class Unit1 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine1 extends Unit1 {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank1 extends Unit1 {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship1 extends Unit1 {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   { /* 선택된 대상을 태운다. */ }
	void unload() { /* 선택된 대상을 내린다. */ }
}

public class Exercise7_10_1 {

	public static void main(String[] args) {
		Unit1[] group = { new Marine1(), new Tank1(), new Dropship1() };
		// 객체 배열(참조 변수 묶은것)
		for(int i =0; i < group.length; i++)
			group[i].move(100, 200);
	}
}
