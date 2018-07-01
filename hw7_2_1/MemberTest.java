package hw7_2_1;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(1) 크기가 4인 Member 배열을 생성
		Member[] m = new Member[4];
		
		//(2) 다음 4명 생성하여 위의 회원 배열에 저장
		m[0] = new HourlyMember(22, 2);  //시간제회원(나이 22, 사용시간 2)
		m[1] = new HourlyMember(33, 3);  //시간제회원(나이 33, 사용시간 3)
		m[2] = new RegularMember(44);  //정회원(나이 44)
		m[3] = new RegularMember(55);  //정회원(나이 55) 

		//(3) 회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지
		int sum = 0;
		for(int i=0;i<4;i++) 
			sum+=m[i].getAge();
		
		System.out.println("평균 나이 = "+sum/4.0);
		
		//(4) 회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
		sum=0;
		for(int i=0;i<4;i++) 
			sum+=m[i].getPayment();
		
		System.out.println("회비 합 = "+sum);
	}

}
