package JAVA_Programming_4th;

import java.util.Scanner;

class Circle {
	private double x;
	private double y;
	private int radius;
	
	Circle() {}
	Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		radius = r;
	}
	
	protected void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}

public class Ex4_5 {
	public static void main(String args[]) {
		Circle[] c = new Circle[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int r = sc.nextInt();
			c[i] = new Circle(x,y,r);
		}
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}
		sc.close();
	}
}
