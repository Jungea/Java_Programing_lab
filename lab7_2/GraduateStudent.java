package lab7_2;

public class GraduateStudent extends Student {  // ���п���

	public GraduateStudent(int id, double score) {  // ������
		super(id, score);
	}

	@Override
	public boolean warning() {  // �л���(���� 1.5 �̻� 3.0 �̸�)
		if(getScore()>=1.5 && getScore()<3.0)
			return true;
		else
			return false;
	}

}