/*
 * 작성자: 정은애
 * 잓성일: 2018.05.08.
 * 파일내용: 상속
 */
package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lab7_1: 정은애 \n");
		
		Manager m1 = new Manager();  // 매니저 객체를 생성
		
		// 매니저의 봉급을 1000, 보너스를 500으로 지정
		m1.setSalary(1000);
		m1.setBonus(500);
		
		// 매니저의 봉급, 보너스, 세금액을 조회하여 출력
		System.out.print("봉급 = "+m1.getSalary()+"원, ");
		System.out.print("보너스 = "+m1.getBonus()+"원, ");
		System.out.println("세금액 = "+m1.getTax()+"원");
	}

}
