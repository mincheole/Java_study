package Chap4;

public class p4_6 {

	public static void main(String[] args) {
		
		for (int sum=0, i=1; i <=6; i++) {
			for (int j=1; j <=6; j++) {
				sum = i+j;
				if (sum==6) {
					System.out.println(i+" "+j);
				}				
			}
		}

	}

}
