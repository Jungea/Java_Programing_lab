package hw5_1;

public class Member {
	int rating; // ȸ�� ���
	int point; // ����Ʈ

	// ȸ��������� - ����� �Ű������� �޾� ȸ�� ��� ����
	void rate(int a) {
		rating = a;
	}

	// ����Ʈ���� - �Ű������� ����, ȸ�� ��޿� ���� ����Ʈ�� ������
	void pointPayment() {
		if(rating==1)
			point+=100;
		else if(rating==2)
			point+=50;
		else if(rating==3)
			point+=40;
		else
			point+=10;
	}

	// ���η���ȸ - �Ű������� ����, ȸ���� ����Ʈ�� ���� ���η��� ���� ������
	double discountRate() {
		if(point>=100)
			return 0.2;
		else
			return 0.1;
	}
}