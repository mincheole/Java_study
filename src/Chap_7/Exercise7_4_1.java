package Chap_7;

class Point4 {
	int x, y;
	
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D4 extends Point4 {
	int z;
	
	Point3D4(int x, int y, int z) {
		super(x,y);		// Point4(int x, int y)를 호출
		this.z = z;
	}
}

public class Exercise7_4_1 {

	public static void main(String[] args) {
		Point3D4 p = new Point3D4(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
	}
}
