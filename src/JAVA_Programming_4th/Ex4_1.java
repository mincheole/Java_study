package JAVA_Programming_4th;

class TV {
	String company;
	int year;
	int size;
	
	TV() {}
	
	TV(String company, int year, int size) {
		this.company = company;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(this.company + "에서 만든" + this.year + "년형 "
								+ this.size + "인치 TV");
	}
}

public class Ex4_1 {
	public static void main(String args[]) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
	}	
}
