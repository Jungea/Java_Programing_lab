package hw7_2;

//점을 표현하는 클래스 Point
public class Point {
	private int x; // x 좌표
	private int y; // y 좌표

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}