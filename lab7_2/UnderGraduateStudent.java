package lab7_2;

public class UnderGraduateStudent extends Student {  // 학부생

	public UnderGraduateStudent(int id, double score) {  //생성자
		super(id, score);
	}

	@Override
	public boolean warning() {  // 학사경고(학점 1.5 미만)
		if(getScore() < 1.5)
			return true;
		else
			return false;
	}
}