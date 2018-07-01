/*
 * 작성자: 정은애
 * 작성일: 2018.03.29.
 * 파일 내용: Pizza 클래스를 정의하고 Pizza 객체를 하나 생성
 */
package lab5_1;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza p = new Pizza();
		
		System.out.println("lab5_1:정은애 \n");
		
		p.brand="피자헛";
		p.diameter=50.5;
		p.price=32000;
		
		System.out.println("브랜드: "+p.brand+", 지름: "+p.diameter+"cm, 가격: "+p.price+"원");
	}

}
