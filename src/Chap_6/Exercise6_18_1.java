package Chap_6;

public class Exercise6_18_1 {
	
	static boolean isNumber(String str) {
		char c;
		for(int i=0; i<str.length(); i++) {
			c = str.charAt(i);
			if(c < '0' || c > '9') return false; // c가 숫자면 if문이 실행되므로 false 리턴하고 메서드 종료
		}										 // c가 숫자가 아니면 false 리턴
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
