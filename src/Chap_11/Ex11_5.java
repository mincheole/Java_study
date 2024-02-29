package Chap_11;

import java.util.*;

public class Ex11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();	// 일회용, 다시 읽어 오려면 다시 선언해야함
		
		while(it.hasNext()) {			// 다시 선언 하지 않고 그대로 하면 hasNext = false
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		for(int i=0;i<list.size();i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
		
	}	// main
}
