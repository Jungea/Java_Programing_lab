/*
 * 작성자: 정은애
 * 작성일: 2018.06.07.
 * 파일내용: MyPair 객체를 생성하고 이용하는 프로그램
 */

package lab15_1;

public class MyPairTest {

	public static void main(String[] args) {
		System.out.println("lab15_1: 정은애\n");

		// 문자열을 주/종 원소로 갖는 MyPair 객체 pair를 생성
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");

		String master = pair.getMaster();  // 주 원소를 변수에 저장 후 출력
		System.out.println(master + "팀");

		System.out.println(pair);  // pair를 출력

		pair.swap();  // pair의 주/종 원소를 교환

		System.out.println(pair);  // pair를 출력
		System.out.println();
		
		
		// 학생(Student) 객체를 두 개 생성
		Student s1 = new Student("kim"); 
		Student s2 = new Student("park");
		
		MyPair<Student> stuentPair = new MyPair<Student>(s1,s2);
		// 이 두 Student 객체를 주/종 원소로 갖는 MyPair 객체 studentPair를 생성
		
		System.out.println(stuentPair);  // studentPair를 출력
		
		stuentPair.swap();  // studentPair의 주/종 원소를 교환
		
		System.out.println(stuentPair);  // studentPair를 출력
		System.out.println();
		
		// 정수(Integer) 객체 두 개 생성
		Integer i1 = new Integer(11);
		Integer i2 = new Integer(22);
		
		MyPair<Integer> integerPair = new MyPair<Integer>(i1,i2); // (11,22) autoBoxing
		// 이 두 Integer 객체를 주/종 원소로 갖는 MyPair 객체 integerPair를 생성
		
		System.out.println(integerPair);  // integerPair를 출력
		
		integerPair.swap();  // integerPair의 주/종 원소를 교환
		
		System.out.println(integerPair);  // integerPair를 출력

	}
}


// String형 주/종 원소를 저장하는 클래스
class MyPair<T> {
	private T master; // 주 원소
	private T slave; // 종 원소

	public MyPair(T master, T slave) { // 생성자
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  주/종 원소를 교환하는 메소드
		T temp = master;
		master = slave;
		slave = temp;
	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "주=" + master + " 종=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}