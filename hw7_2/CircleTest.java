/*
 * 작성자: 정은애
 * 작성일: 2018.05.20.
 * 내용: has-a
 */

package hw7_2;

//Point 클래스와 Circle 클래스를 이용하는 클래스
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5, new Point(10, 20));
		Circle c3 = new Circle(3.5, new Point(10, 20));

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true

		printCircle(c2);
	}

	// (1) 매개변수로 받은 원 c의 반지름, 중심의 x, y좌표를
	//     출력하는 메소드
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius());
		System.out.println(c.getCenter().getX());
		System.out.println(c.getCenter().getY());
	}

}
