package JAVA_Programming_4th;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;

	Phone() {
	}

	Phone(String name, String num) {
		this.name = name;
		this.tel = num;
	}

	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}
}

class PhoneBook {
	Scanner sc = new Scanner(System.in);
	Phone[] p;
	int num;
	String name;
	String tel;

	PhoneBook() {
	}

	void getNum() {
		System.out.print("인원수>>");
		num = sc.nextInt();
		this.p = new Phone[num];
	}

	void setPhonebook() {
		for (int i = 0; i < num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			name = sc.next();
			tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}

	void searchPhone() {
		boolean state = true;
		while (true) {
			System.out.print("검색할 이름>>");
			String name = sc.next();
			if (name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			for (int i = 0; i < this.num; i++) {
				if (p[i].getName().equals(name)) {
					System.out.println(p[i].getName() + "의 번호는 " + p[i].getTel() + " 입니다.");
				}
				if (state == false)
					System.out.println(name + " 이/가 없습니다.");
			}
		}
	}
}

public class Ex4_8 {
	public static void main(String[] args) {
		PhoneBook p = new PhoneBook();
		p.getNum();
		p.setPhonebook();
		p.searchPhone();
	}
}
