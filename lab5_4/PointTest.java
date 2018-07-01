/*
 * 작성자: 정은애
 * 작성일: 2018.04.05.
 * 파일 내용: x좌표를 갖는 1차원 점 정의, 이용
 */

package lab5_4;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_4: 정은애 \n");

		Point p1 = new Point();
		Point p2 = new Point();
		// (5) Point 객체 p1, p2를 생성

		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);
		// (6) p1은 4.5  만큼 이동, p2는 -1.0만큼 이동, p1을 1.0만큼 다시 한 번 이동

		p1.move();  // (7) p1만 이동(매개변수 없이) ********

		// p1, p2의 속성을 출력
		System.out.println(p1.toString()); // p1.toString() 대신 p1 라고 적어도 됨
		System.out.println(p2.toString()); // p2.toString() 대신 p2 라고 적어도 됨

		// (8) p1과 p2의 거리를 출력 *******
		System.out.println("p1과 p2의 거리 출력 = "+p1.distance(p2));
		System.out.println("p2과 p1의 거리 출력 = "+p2.distance(p1));
	}

}
