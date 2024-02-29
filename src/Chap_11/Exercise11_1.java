package Chap_11;

import java. util.*;

public class Exercise11_1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);	// (3,6,2,7) 순서x
		//System.out.println(set);
		TreeSet tset = new TreeSet(set);	// (2,3,6,7) 정렬하면서 저장
		//System.out.println(tset);
		Stack stack = new Stack();			
		stack.addAll(tset);					// (2,3,6,7) 순서o
		
		while(!stack.empty())
			System.out.println(stack.pop()); // LIFO(후입선출)
	}
}
