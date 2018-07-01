package hw5_1;

public class Member {
	int rating; // 회원 등급
	int point; // 포인트

	// 회원등급지정 - 등급을 매개변수로 받아 회원 등급 지정
	void rate(int a) {
		rating = a;
	}

	// 포인트지급 - 매개변수는 없이, 회원 등급에 따라 포인트를 더해줌
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

	// 할인률조회 - 매개변수는 없이, 회원의 포인트에 따라 할인률을 구해 리턴함
	double discountRate() {
		if(point>=100)
			return 0.2;
		else
			return 0.1;
	}
}