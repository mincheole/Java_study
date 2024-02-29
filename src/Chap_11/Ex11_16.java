package Chap_11;

import java.util.*;
import static java.lang.System.out;
import static java.lang.System.in;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");	// OK. 이미 존재하는 키 추가가능. 기존 값에 덮어쓰기
		
		Scanner s = new Scanner(in); // 화면으로부터 라인단위로 입력받는다.
		
		while(true) {
			out.println("id와 password를 입력해주세요.");
			out.print("id :");
			String id = s.nextLine().trim();	// 앞뒤로 공백제거
			
			out.print("password :");
			String password = s.nextLine().trim();	// 앞뒤로 공백제거
			out.println();
			
			if(!map.containsKey(id)) {
				out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;	// 밑의 문장들을 건너뛰고 while문의 처음으로 돌아감
			}
			if(!(map.get(id)).equals(password)) {
				out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		} // while
	} // main의 끝
}
