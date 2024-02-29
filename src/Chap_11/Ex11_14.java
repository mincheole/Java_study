package Chap_11;

import java.util.*;
import static java.lang.System.out;

public class Ex11_14 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");			set.add("alien");		set.add("bat");
		set.add("car");			set.add("Car");			set.add("disc");
		set.add("dnace");		set.add("dZZZZ");		set.add("dzzzz");
		set.add("elephant");	set.add("elevator");	set.add("fan");
		set.add("flower");
		
		out.println(set);
		out.println("range search : from " + from + " to "+ to);
		out.println("result1 : " + set.subSet(from, to));		// 부분집합
		out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}
