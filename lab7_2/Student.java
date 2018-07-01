package lab7_2;

public abstract class Student {  // �߻�Ŭ����

	private int id;  // �й�
	private double score;  // ����

	public Student(int id, double score) {  // ������
		this.id = id;
		this.score = score;
	}

	public int getId() {  // id getter
		return id;
	}

	public double getScore() {  // score getter
		return score;
	}

	public void setScore(double score) {  // score setter
		this.score = score;
	}

	public abstract boolean warning();  // �߻�޼ҵ�, �л���
}