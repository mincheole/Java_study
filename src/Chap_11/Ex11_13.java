package Chap_11;

import java.util.*;
import static java.lang.System.out;

public class Ex11_13 {
	public static void main(String[] args) {
		Set set = new TreeSet();		// 범위 검색, 정렬에 유리(정렬 필요x, 저장 시 정렬)
		
		for (int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45+1);
			set.add(num);				// set.add(new Integer(num)); 컴파일러가 오토박싱
		}								// 비교 기준이 없지만 Integer에 Comparable 있으므로 상관x
		
		out.println(set);
	}
}
