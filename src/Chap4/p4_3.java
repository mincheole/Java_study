package Chap4;

public class p4_3 {
	public static void main(String[] args) {
		int sum=0,total=0;
		for(int i=0;i<=10;i++) {
			sum += i;
			total+=sum;
		}
		System.out.print(total);
	}

}
