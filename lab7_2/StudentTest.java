package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab7_2: ������ \n");

		// (1) �й� 11, ���� 1.5�� �ʱ�ȭ�� �кλ��� ����
		UnderGraduateStudent stu1 = new UnderGraduateStudent(11, 1.5);
		// (2) �й� 222, ���� 1.5�� �ʱ�ȭ�� ���п����� ����
		GraduateStudent stu2 = new GraduateStudent(222, 1.5);

		// (3) �кλ��� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(stu1.getId()+" "+stu1.getScore()+" "+stu1.warning());
		// (4) ���п����� �й�, ����, �л��� ���θ� ��ȸ�Ͽ� ���
		System.out.println(stu2.getId()+" "+stu2.getScore()+" "+stu2.warning());
	}

}