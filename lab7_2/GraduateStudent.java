package lab7_2;

public class GraduateStudent extends Student {  // 대학원생

	public GraduateStudent(int id, double score) {  // 생성자
		super(id, score);
	}

	@Override
	public boolean warning() {  // 학사경고(학점 1.5 이상 3.0 미만)
		if(getScore()>=1.5 && getScore()<3.0)
			return true;
		else
			return false;
	}

}