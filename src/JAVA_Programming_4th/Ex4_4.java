package JAVA_Programming_4th;

class Rectangle{
	private int x;
	private int y;
	private int width;
	private int height;
	
	Rectangle() {}
	Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	protected int square() {
		return width*height;
	}
	
	protected void show() {
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	
	protected boolean contains(Rectangle r) {
		if((this.x < r.x && this.y < r.y) && ((this.x+this.width) > (r.x + r.width) && (this.y+this.height) > (r.y + r.height)))
			return true;
		else return false;
	}
}

public class Ex4_4 {

	public static void main(String args[]) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("의 면적은 "+r.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
