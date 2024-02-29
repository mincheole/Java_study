package Chap_9;

import static java.lang.System.out;

public class Exercise9_5 {
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src.length());
		for(int i=0; i < src.length();i++) {
			char c = src.charAt(i);		// 문자열 src를 차례대로 c에 반환
			
			// c가 delCh에 포함되어있지 않으면(indexOf()로 못찾으면) sb에 추가
			if(delCh.indexOf(c)==-1) sb.append(c);
			}
		return sb.toString();
	}

	public static void main(String[] args) {
		out.println("(1!2@3^4~5)" + " -> "
											+ delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		out.println("(1 2 3 4\t5)" + " -> "
											+ delChar("(1 2 3 4\t5)", " \t"));

	}
}
