/*
 * �ۼ���: ������
 * �ۼ���: 2018.03.29.
 * ���� ����: Pizza Ŭ������ �����ϰ� Pizza ��ü�� �ϳ� ����
 */
package lab5_1;

public class PizzaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza p = new Pizza();
		
		System.out.println("lab5_1:������ \n");
		
		p.brand="������";
		p.diameter=50.5;
		p.price=32000;
		
		System.out.println("�귣��: "+p.brand+", ����: "+p.diameter+"cm, ����: "+p.price+"��");
	}

}
