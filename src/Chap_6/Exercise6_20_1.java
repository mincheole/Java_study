package Chap_6;

public class Exercise6_20_1 {
	static int max(int[] arr) {
		if(arr==null || arr.length == 0) return -999999;
		
		int tmp=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > tmp) {
				tmp = arr[i];
			}
		}
		return tmp;
	}

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {}));
	}
}
