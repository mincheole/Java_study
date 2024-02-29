package Chap_11;

import java.util.*;
import static java.lang.System.out;

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;  // -1을 곱해서 기본 정렬 방식의 역으로 변경한다.
			//return c2.compareTo(c1);     // 같은 결과
		}
		return -1;
	}
}

public class Ex11_7 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);  // 정렬 기준을 정해주지 않아도 String의 Comparable구현에 의한 정렬
		out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);  // 대소문자 구분안함
		out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());  // 역순 정렬
		out.println("strArr=" + Arrays.toString(strArr));
	}
}
