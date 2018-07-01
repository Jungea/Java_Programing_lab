package lab7_4;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_4: 정은애 \n");
		
		// 반지름이 1.5인 원 c1, c2 생성
		Circle c1 = new Circle(1.5);
		Circle c2 = new Circle(1.5);
		
		// toString() 호출하여 출력
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		// ==로 비교한 결과 출력
		System.out.println(c1 == c2);
		
		// equals()로 비교한 결과 출력
		System.out.println(c1.equals(c2));
	}

}
