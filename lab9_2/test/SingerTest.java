/*
 * �ۼ���: ������
 * �ۼ���: 2018.05.29.
 * ���ϳ���: ��Ű��
 */

package test;

import mic.MicSystem;

public class SingerTest {  // Singer �������̽��� �׽�Ʈ�ϴ� Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab9_2: ������ \n");

		// ����ũ �ý��� ��ü�� ����
		MicSystem mic = new MicSystem();

		// Person ��ü�� �����Ͽ� ����ũ �׽�Ʈ �Ű������� ����
		mic.micTest(new Person());
	}

}
