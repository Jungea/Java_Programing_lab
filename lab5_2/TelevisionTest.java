/*
 * �ۼ���: ������
 * �ۼ���: 2018.04.10.
 * ���ϳ���: Television �迭
 */

package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_2: ������ \n");
		Television[] t = new Television[3];  
		// (1) ũ�Ⱑ 3�� �ڷ����� �迭�� ����

		for(int i=0;i<3;i++) 
			t[i] = new Television();
		// (2) �ݺ����� �̿��Ͽ� �ڷ����� �迭�� 3���� �ڷ������� �����Ͽ� ����


		t[0].channel=7;
		t[1].channel=7;
		t[2].channel=11;
		// (3) �ڷ����� ä���� ���� 7, 7, 11�� ����

		for(int j=0;j<3;j++)
			System.out.println(t[j].channel);
		// (4) �ݺ����� �̿��Ͽ� �迭�� ����� ��� �ڷ������� ä���� ���
	}


}