package lab7_2;

public class UnderGraduateStudent extends Student {  // �кλ�

	public UnderGraduateStudent(int id, double score) {  //������
		super(id, score);
	}

	@Override
	public boolean warning() {  // �л���(���� 1.5 �̸�)
		if(getScore() < 1.5)
			return true;
		else
			return false;
	}
}