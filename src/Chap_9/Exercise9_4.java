package Chap_9;

import static java.lang.System.out;

public class Exercise9_4 {
	public static boolean contains(String src, String target) {
		if(src.indexOf(target)==-1) return false;
		return true;		
	}
//	public static boolean contains(String src, String target) {
//		return src.indexOf(target) !=-1;	// return -1!=-1; -> return false;
//	}

	public static void main(String[] args) {
		out.println(contains("12345","23"));
		out.println(contains("12345","67"));
	}
}
