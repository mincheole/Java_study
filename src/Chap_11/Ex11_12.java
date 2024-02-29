package Chap_11;

import java.util.*;
import static java.lang.System.out;

public class Ex11_12 {
	public static void main(String[] args) {
		HashSet setA   = new HashSet();
		HashSet setB   = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");	setA.add("2");	setA.add("3");
		setA.add("4");	setA.add("5");
		out.println("A = "+setA);
		
		setB.add("4");	setB.add("5");	setB.add("6");
		setB.add("7");	setB.add("8");
		out.println("B = "+setB);
		
		Iterator it = setB.iterator();
		while(it.hasNext()) { 		// 교집합, setA.retainAll(setB)
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		
		it = setA.iterator();
		while(it.hasNext()) { 		// 차집합, setA.removeAll(setB)
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
		
		it = setA.iterator();
		while(it.hasNext())		 // 합집합
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext()) 		// 합집합, setA.addAll(setB) 결과같음
			setHab.add(it.next());
		
		out.println("A ∪ B = "+setKyo);
		out.println("A ∩ B = "+setHab);
		out.println("A - B = "+setCha);
	}
}
