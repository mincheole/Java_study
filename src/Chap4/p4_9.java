package Chap4;

public class p4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10;
			num /=10;
		}
		System.out.print("sum="+sum);

	}

}
