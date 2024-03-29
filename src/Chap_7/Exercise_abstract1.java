package Chap_7;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /* 현재 위치에 정지 */ }
}

class Marine extends Unit {
	void move(int x, int y) { /* 지정된 위치로 이동 */  }
	void stimPack()			{ /*  스팀팩을 사용한다. */ }
}

class Tank extends Unit {
	void move(int x, int y) { /* 지정된 위치로 이동 */   }
	void changeMode()		{ /* 공격 모드를 변환한다. */ }
}

class Dropship extends Unit {
	void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void load()				{ /*  선택된 대상을 태운다. */}
	void unload()			{ /* 선택된 대상을 내린다. */}
}

public class Exercise_abstract1 {

}
