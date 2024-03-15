package Chap_7;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다."); }
}

interface Fightable2 {
	public void move(int x, int y);	// public abstract가 생략됨
	void attack(Fightable2 f);		// public abstract가 생략됨
}

class Fighter2 extends Unit2 implements Fightable2 {
	// 오버라이딩 규칙: 부모(public)보다 접근 제어자의 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable2 f) {
		System.out.println(f+"를 공격");
	}
}

public class FighterTest2 {
	public static void main(String[] args) {
//		Fighter2 f = new Fighter2();
		Unit2 u = new Fighter2();
		Fightable2 f = new Fighter2();
		u.move(100, 200);
//		u.attack(new Fighter2()); // Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f.move(100,200);
//		Fighter2 f2 = new Fighter2();
//		f.attack(f2);
//		위 두 문장을 아래의 문장처럼 요약 가능
		f.attack(new Fighter2());
//		f.stop();	// Fightable2에는 stop()가 없어서 호출 불가	
	}
}
