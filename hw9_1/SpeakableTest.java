/*
 * 작성자: 정은애
 * 작성일: 2018. 05. 20.
 * 파일내용: 인터페이스
 */

package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1: 정은애 \n");

		// (1) 크기가 4인 Speakble 배열을 생성
		Speakable[] s = new Speakable[4];

		// (2) Person 객체 2개, Dog 객체 2개를 생성하여 배열에 저장
		s[0] = new Person("강감찬");
		s[1] = new Person("홍길동");
		s[2] = new Dog(2);
		s[3] = new Dog(5);

		// (3) 반복문을 이용하여 다음을 수행:
		// 모든 배열 원소 객체에 대해 speak()를 호출하고,
		// 만일 배열 원소가 사람이면 추가로 이름을 조회(getName() 호출)하여 출력할 것
		for(int i=0; i<4; i++) {
			s[i].speak();
			if(s[i] instanceof Person)
				System.out.println(((Person)s[i]).getName());
			System.out.println();
		}

	}

}
