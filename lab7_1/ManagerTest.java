/*
 * �ۼ���: ������
 * �鼺��: 2018.05.08.
 * ���ϳ���: ���
 */
package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("lab7_1: ������ \n");
		
		Manager m1 = new Manager();  // �Ŵ��� ��ü�� ����
		
		// �Ŵ����� ������ 1000, ���ʽ��� 500���� ����
		m1.setSalary(1000);
		m1.setBonus(500);
		
		// �Ŵ����� ����, ���ʽ�, ���ݾ��� ��ȸ�Ͽ� ���
		System.out.print("���� = "+m1.getSalary()+"��, ");
		System.out.print("���ʽ� = "+m1.getBonus()+"��, ");
		System.out.println("���ݾ� = "+m1.getTax()+"��");
	}

}
