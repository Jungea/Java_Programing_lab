/*
 * 작성자: 정은애
 * 작성일: 2018.04.05.
 * 파일 내용: x좌표를 갖는 1차원 점 정의, 이용
 */

package lab5_4;

public class Point {
	double x;  // (1) 필드: double형 x 좌표

	// (2) move() 메소드 : double형 매개변수를 그 값만큼 x 좌표를 이동
	void move(double a) {
		x+=a;
	}

	// (3) move() 메소드 : 매개변수를 받지 않고 x좌표를 1만큼 이동 *******
	void move() {
		x++;
	}

	// toString() 메소드: Point의 속성을 문자열로 만들어 리턴 - @Override, public은 6, 7장에서 배움
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}

	// (4) distance() 메소드 : Point형 매개변수를 받아, 매개변수로 받은 점과 현재 점의 거리를 구하여 리턴 *******
	double distance(Point p) {
		return (x>p.x) ? x-p.x: p.x-x;
	}
}
