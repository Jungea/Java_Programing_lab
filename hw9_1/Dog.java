package hw9_1;

public class Dog implements Speakable {
	private int age;  // 나이

	public Dog(int age) {  // 생성자
		this.age = age;
	}

	public int getAge() {  // 나이 getter
		return age;
	}

	public void setAge(int age) {  // 나이 setter
		this.age = age;
	}

	public void speak() {
		for(int i=0; i<age ; i++)
			System.out.print("멍");
		System.out.println();
	}
}
