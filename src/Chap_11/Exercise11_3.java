package Chap_11;

import java.util.*;
/*
class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," 
				+ ban + "," 
				+ no + "," 
				+ kor + "," 
				+ eng + "," 
				+ math + "," 
				+ getTotal() + "," 
				+ getAverage();
	}

	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Student)) return -1;
		
		Student s = (Student)o;
		return name.compareTo(s.name);
	}
	
}

class Exercise11_3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바", 2, 1, 70, 90, 70));
		list.add(new Student("안자바", 2, 2, 60, 100, 80));
		list.add(new Student("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student("김자바", 1, 2, 80, 80, 90));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
*/