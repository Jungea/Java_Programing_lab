/*
 * �ۼ���: ������
 * �ۼ���: 2018.05.29.
 * ���ϳ���: �������̽��� ���ٽ�
 */

package hw9_3;

class Student {
	 int age;
	 int score;
	}

	@FunctionalInterface
	interface Tester {
	 boolean test(Student s);
	}

	public class Main {
	 public static void check(Student s, Tester t) {
	  boolean result = t.test(s);
	  System.out.println(result);
	 }

	 public static void main(String... args) {
	  System.out.println("hw9_3: ������ \n");

	  Student kim = new Student();
	  kim.age = 19;
	  kim.score = 80;

//	  class PassTester implements Tester {
//	   @Override
//	   public boolean test(Student s) {
//	    return s.score >= 60;
//	   }
//	  }
//
//	  class AdultTester implements Tester {
//	   @Override
//	   public boolean test(Student s) {
//	    return s.age >= 20;
//	   }   
//	  }

	  check(kim, (s) -> s.score >= 60  );
	  check(kim, (s) -> s.age >= 20);
	 }
	}