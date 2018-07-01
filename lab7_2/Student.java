package lab7_2;

public abstract class Student {  // 추상클래스

	private int id;  // 학번
	private double score;  // 학점

	public Student(int id, double score) {  // 생성자
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

	public abstract boolean warning();  // 추상메소드, 학사경고
}