//package Chap_6;
//
//class Student2{
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	
//	Student2(String name, int ban, int no, int kor ,int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	
//	int getTotal() {
//		return kor + eng + math;
//	}
//	
//	double getAvg() {
//		return getTotal() / 3.0;
//	}
//	
//	String info() {
//		return name + ","
//				+ ban + ","
//				+ no + ","
//				+ kor + ","
//				+ eng + ","
//				+ math + ","
//				+ getTotal() + ","
//				+ String.format("%.1f", getAvg());	
//	}
//
//}
//
//public class Exercise6_2 {
//	
//	public static void main(String[] args) {
//		Student2 s = new Student2("홍길동",1,1,100,60,76);
//		
//		String str = s.info();
//		System.out.println(str);
//
//	}
//}
