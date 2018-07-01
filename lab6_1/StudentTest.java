/*
 * 작성자: 정은애
 * 작성일: 2018.04.12.
 * 파일내용: 접근자/설정자
 */

package lab6_1;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();  //학생 객체 생성
		
		s.setNum(11223344);  //학번 지정
		System.out.println(s.getNum());  //학번 조회
	}

}
