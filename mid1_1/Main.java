/*
 * 작성자: 정은애
 * 잓성일: 2018.05.08.
 * 파일내용: 돼지 저금통
 */
package mid1_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mid1_1: 정은애 \n");
		
		// 500원 1개, 100원 1개를 넣은 돼지저금통을 생성
		PiggyBank bank = new PiggyBank(1, 1);

		// 돼지저금통에 동전을 저금
		bank.add(2, 10);
		bank.add(0, 1);
		bank.add(0, 1);

		// 돼지저금통을 열고 저금액을 출력
		System.out.println(bank.open()); // 2800

		// 돼지저금통에 동전을 저금
		bank.add(1, 1);

		// 돼지저금통을 열고 저금액을 출력
		System.out.println(bank.open()); // 600
	}

}
