//package Chap_6;
//
//import java.util.Arrays;
//
//public class Exercise6_20 {
//	
//	static int max(int[] arr) {
//		int result=0;
//		if(arr == null || arr.length == 0) return -999999;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > result) result = arr[i];
//		}
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		int[] data = {3, 2, 9, 4, 7};
//		System.out.println(Arrays.toString(data));
//		System.out.println("최대값:" + max(data));
//		System.out.println("최대값:" + max(null));
//		System.out.println("최대값:" + max(new int[] {}));
//	}
//}
