package JAVA_Programming_4th;

import java.util.Scanner;

class Circle_6 {
	private double x;
	private double y;
	private int radius;
	
	Circle_6() {}
	Circle_6(double x, double y, int r) {
		this.x = x;
		this.y = y;
		radius = r;
	}
	
	protected int getradius() {
		return radius;
	}
	
	protected void show() {
		System.out.println("가장 면적이 큰 원은 ("+x+","+y+")"+radius);
	}
}

public class Ex4_6 {
	public static void main(String args[]) {
		Circle_6[] c = new Circle_6[3];
		Scanner sc = new Scanner(System.in);
		
		int index=0;
		int compare=0;
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int r = sc.nextInt();
			c[i] = new Circle_6(x,y,r);
		}
		
		for(int i=0; i<c.length; i++) {
			if(compare < c[i].getradius()) index = i;
		}
		
		c[index].show();
		sc.close();
	}
}
