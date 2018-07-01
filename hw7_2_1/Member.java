package hw7_2_1;

public abstract class Member {
	private int age;
	
	public Member(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract int getPayment();
}
