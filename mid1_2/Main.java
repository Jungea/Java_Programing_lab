/*
 * 작성자: 정은애
 * 잓성일: 2018.05.08.
 * 파일내용: 사원 클래스
 */

package mid1_2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mid1_2: 정은애 \n");

		Employee emp1 = new Employee("Kim", 8000, 11);
		// (1) 이름 Kim, 시급 8000, 시간 11인 사원 emp1 생성
		Employee emp2 = new Employee("Lee");
		// (2) 이름 Lee인 사원 emp2 생성

		// emp1, emp2를 비교하는 메소드 호출
		compare(emp1, emp2);
		compare(emp2, emp1);
	}

	// (3) 매개변수로 받은 사원 e1, e2중에서
	//      봉급이 많은 사원의 이름을 출력하는 메소드
	// -봉급이 동일하면 동일하다고 출력할 것
	private static void compare(Employee e1, Employee e2){ 
		if(e1.getSalary()==e2.getSalary()) 
			System.out.println("동일");
		else if(e1.getSalary() > e2.getSalary()) 
			System.out.println(e1.getName());
		else
			System.out.println(e2.getName());
	}
}
