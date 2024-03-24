package JAVA_Programming_4th;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	Day[] d;
	int dayNum;
	boolean state = true;
	
	MonthSchedule() {}
	
	MonthSchedule(int num) {
		dayNum = num;
		d = new Day[dayNum];
		for(int i=0; i<num; i++) d[i] = new Day();
	}
	
	void getSchedule() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		if(day < 1 || day > 30) {
			System.out.println("날짜를 잘못입력하셨습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		System.out.print("할일(빈칸없이입력)?");
		String todo = sc.next();
		d[day-1].set(todo);
		System.out.println();
	}
	
	void showSchedule() {
		System.out.print("날짜(1~30)?");
		int day = sc.nextInt();
		System.out.print(day+"일의 할 일은 ");
		d[day-1].show();
		System.out.println();		
	}
	
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		state = false;
	}
	
	void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		while(state) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int mode = sc.nextInt();
			if(mode==1) getSchedule();
			else if(mode==2) showSchedule();
			else exit();
		}
	}	
}

public class Ex4_7 {
	public static void main(String[] args) {
		MonthSchedule m = new MonthSchedule(30);
		m.run();
	}
}
