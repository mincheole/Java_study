package Chap_6;

public class Exercise6_17_1 {
	static int[] shuffle(int[] arr) {
		int tmp=0;
		
		for(int i=0; i<arr.length;i++) {			 // 0~9 사이의 랜덤한 정수 n을 생성하여
			int n = (int)(Math.random()*arr.length); // arr[i]와 arr[n]의 값을 교체
			tmp = arr[i];
			arr[i] = arr[n];
			arr[n] = tmp;
		}
		return arr;
	}	

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
