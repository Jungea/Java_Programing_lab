/*
 * 작성자: 정은애
 * 작성일: 2018.04.17.
 * 파일내용: 원 프로그램
 */

package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab6_2: 정은애 \n");

		Circle c1 = new Circle();  // (1) 원 생성(c1)
		Circle c2 = new Circle(2.5);  // (2) 반지름이 2.5인 원 생성(c2)

		// (3) c1, c2의 반지름을 조회하여 출력
		System.out.println("c1의 반지름 = "+c1.getR());
		System.out.println("c2의 반지름 = "+c2.getR());

		// (4) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c1의 면적 = "+c1.area());
		System.out.println("c2의 면적 = "+c2.area());

		// (5) c1의 반지름을 c2의 반지름 값으로 지정
		c2.setR(c1.getR());

		// (6) c1, c2의 반지름을 조회하여 출력
		System.out.println("c1의 반지름 = "+c1.getR());
		System.out.println("c2의 반지름 = "+c2.getR());

		// (7) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c1의 면적 = "+c1.area());
		System.out.println("c2의 면적 = "+c2.area());

		// (8) c2의 반지름을 1.5로 지정
		c2.setR(1.5);

		// (9) c1, c2의 면적을 출력 - 직접 계산하지 말고 면적계산 메소드 호출
		System.out.println("c1의 면적 = "+c1.area());
		System.out.println("c2의 면적 = "+c2.area());
	}

}
