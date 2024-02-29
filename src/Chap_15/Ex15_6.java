package Chap_15;

import java.io.*;

public class Ex15_6 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			// BufferedOutputStream의 버퍼 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt에 1 ~ 9까지 출력한다.
			for(int i='1'; i <= '9'; i++) {
				bos.write(i);
			}
			
			fos.close();  // FileOutputStream을 닫는다
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
