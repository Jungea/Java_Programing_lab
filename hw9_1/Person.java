package hw9_1;

public class Person implements Speakable {
	private String name;  // 이름

	public Person(String name) {  // 생성자
		this.name = name;
	}

	public String getName() {  // 이름 getter
		return name+"입니다.";
	}

	public void setName(String name) {  // 이름 setter
		this.name = name;
	}
	
	@Override
	public void speak() {
		System.out.println("안녕하세요.");
	}
}
