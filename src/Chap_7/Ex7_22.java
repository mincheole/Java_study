//package Chap_7;
//
//abstract class Shape {
//	Point p;
//
//	Shape() {
//		this(new Point(0, 0));
//	}
//
//	Shape(Point p) {
//		this.p = p;
//	}
//
//	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
//
//	Point getPosition() {
//		return p;
//	}
//
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Circle extends Shape {
//	double r;
//	Circle() {};
//	Circle(double r) { this.r = r};
//	
//}
//
//class Rectangle extends Shape {
//	Rectangle() {};
//	
//}
//
//
//class Point {
//	int x;
//	int y;
//
//	Point() {
//		this(0, 0);
//	}
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	public String toString() {
//		return "[" + x + "," + y + "]";
//	}
//}
//
//class Ex7_22 {
//	static void sumArea(Shape a) {
//		
//	}
//	public static void main(String[] args) {
//		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
//		System.out.println(" :" + sumArea(arr));
//	}
//}
