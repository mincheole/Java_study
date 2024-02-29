package Chap_11;

import java.util.*;

public class Ex11_1 {
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));		// list1.add(5);도 가능
		list1.add(new Integer(4));		// 컴파일러가 오토박싱(Autoboxing) 해줌
		list1.add(new Integer(2));		// 정석은 아님
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		// subList 읽기 전용이라 new 사용
		print(list1, list2);
		
		Collections.sort(list1);		// list1과 list2를 정렬한다.  유틸클래스
		Collections.sort(list2);		// Collections.sort(List l)
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		// 모든 요소 포함 하는지 true / false
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	// 인덱스가 3인 곳에 "A"를 추가
		print(list1, list2);;
		
		list2.set(3, "AA");
		print(list1, list2);
		//list1.indexOf(new Integer(1)); // 지정된 객체의 위치(인덱스)를 알려준다
		//list1.remove(new Integer(1));	// 객체의 값이 Integer형이고 1인 객체 삭제
		//list1.remove(1);				// 객체의 인덱스가 1인 객체 삭제
		//remove(Object obj), remove(int index)
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1,retainAll(list2):"+list1.retainAll(list2));
		print(list1, list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				 // get으로 list2에서 객체를 꺼내서 list1에 있는지 확인 있으면 true
				list2.remove(i);
			}
			print(list1, list2);
		}
		
	}

}
