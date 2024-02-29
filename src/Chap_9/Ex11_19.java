package Chap_9;

import java.util.*;
import static java.util.Collections.*;
import static java.lang.System.out;

public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		out.println(list);
		
		addAll(list, 1,2,3,4,5);
		out.println(list);
		
		rotate(list, 2);	// 오른쪽(반시계방향)으로 두 칸씩 이동
		out.println(list);
		
		swap(list, 0, 2);	// 해당하는 index 교환
		out.println(list);
		
		shuffle(list);		// 저장된 요소의 위치를 임의로 변경
		out.println(list);
		
		sort(list, reverseOrder());	// 역순 정렬 reverse(list); 와 동일
		out.println(list);
		
		sort(list);			// 정렬
		out.println(list);
		
		int idx = binarySearch(list ,3);	// 3이 저장된 위치(index)를 반환
		out.println("index of 3 = " + idx);
		
		out.println("max="+max(list));
		out.println("min="+min(list));
		out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9);	// list를 9로 채운다.
		out.println("list="+list);
		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		out.println("newList=" + newList);
		
		out.println(disjoint(list, newList));	// 공통요소가 없으면 true
		
		copy(list, newList);
		out.println("newList="+newList);
		out.println("list="+list);
		
		replaceAll(list, 2, 1);
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		out.println("list2="+list2);
	}
}
