package lab7_1;

public class Manager extends Employee {

	private int bonus;  // ���ʽ�
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public int getTax() {
		return (getSalary()+bonus) / 10;
	}
	
}
