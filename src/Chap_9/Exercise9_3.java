package Chap_9;

import static java.lang.System.out;

public class Exercise9_3 {
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치

		for(int i=0; i<src.length(); i++) {
			pos = src.indexOf(target, pos);
			if(pos==-1) return count;
			count++;
			pos += target.length();
		}
//		// (1) 반복문을사용해서아래의과정을반복한다.
//		while (true) {
//			// 1. src에서 target을 pos의 위치부터 찾는다.
//			pos = src.indexOf(target, pos);
//			// 2. 찾으면 count의 값ㅅ을 1 증가시키고,
//			// pos의 값을 target.length만큼 증가시킨다.
//			if (pos != -1) {
//				count++;
//				pos += target.length(); // pos(검사 시작 위치)를 찾은 단어 이후로 옮긴다.
//			} else break;
//			// 3. indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.
//		}
		return count;
	}
	
	public static void main(String[] args) {
		out.println(count("12345AB12AB345AB", "AB"));
		out.println(count("12345", "AB"));
	}
}
