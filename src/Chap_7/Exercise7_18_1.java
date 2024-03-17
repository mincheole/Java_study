package Chap_7;

import java.awt.*;
import java.awt.event.*;

//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}
//
//public class Exercise7_18_1 {
//	public static void main(String[] args) {
//		Button b = new Button("Start");
//		b.addActionListener(new EventHandler());
//	}
//}
// 위의 클래스를 익명클래스로 변환
class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
	}
}

public class Exercise7_18_1 {
	public static void main(String[] args) {
		Button b = new Button("Start");				// 클래스의 정의와 객체 생성을 동시에
		b.addActionListener(new ActionListener() {	// 부모 이름 or 인터페이스 이름
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				}
			} // 익명 클래스 끝
		);
	} // main 끝
}