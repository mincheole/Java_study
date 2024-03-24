package JAVA_Programming_4th;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	
	Phone() {}
	
	void setPhone(String name, String num) {
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
	int people;
	boolean state = true;
	
	PhoneBook() {}
	PhoneBook(int num) {
		people = num;
		this.p = new Phone[people];
		for(int i=0; i<num; i++) p[i] = new Phone();
	}
	
	void setPhonebook(int i) {
		System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
		String s = sc.next();
		String name= s.substring(0,2);
		String num = s.substring(3);
//		for(int i=0; i<people; i++) {
		this.p[i].setPhone(name,num);
//		}
	}
	void searchPhone(int i) {
		System.out.print("검색할 이름>>");
		String searchName = sc.next();
		if(searchName.equals("그만")) state = false;
		else if(p[i].getName().equals(searchName))
//		else if(p[i].getName()==searchName)
			System.out.println(p[i].getName()+"의 번호는 " +p[i].getTel()+ " 입니다.");
		System.out.println(searchName+" 이/가 없습니다.");
	}
	void run() {
		for(int i=0; i<this.people; i++) {
			setPhonebook(i);
		}
		System.out.println("저장되었습니다...");
		while(state)
			for(int i=0; i<this.people; i++) {
				searchPhone(i);
		}
	}
}

public class Ex4_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int n = sc.nextInt();
		PhoneBook p = new PhoneBook(n);
		p.run();
	}
}
