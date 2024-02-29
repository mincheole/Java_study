package Chap_6;

class Student2 {
	String name;	// 학생이름
	int ban;		// 반
	int no;			// 번호
	int kor;		// 국어 점수
	int eng;		// 영어 점수
	int math;		// 수학 점수
	
	Student2() {}
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		int total = this.kor + this.eng + this.math;
		double avg = Math.round(total / 3.0*10)/10.0;
		// Math.round() 메서드를 이용해 둘째 자리에서 반올림
		return this.name + "," + this.ban + "," + this.no
				+ "," + this.kor + "," + this.eng + "," + this.math+ "," + total + "," + avg;
	}
}

public class Exercise6_2_1 {
	public static void main(String[] args) {
		Student2 s = new Student2("홍길동",1, 1, 100, 60, 76);
		String str = s.info();
		System.out.println(str);
	}
}
