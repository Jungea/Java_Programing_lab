package hw7_2_1;

public class HourlyMember extends Member {
	private int hour;
	
	public HourlyMember(int age, int hour) {
		super(age);
		this.hour = hour;
	}
	
	@Override
	public int getPayment() {
		return hour*100;
	}
}
