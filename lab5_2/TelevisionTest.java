/*
 * 작성자: 정은애
 * 작성일: 2018.04.10.
 * 파일내용: Television 배열
 */

package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_2: 정은애 \n");
		Television[] t = new Television[3];  
		// (1) 크기가 3인 텔레비전 배열을 생성

		for(int i=0;i<3;i++) 
			t[i] = new Television();
		// (2) 반복문을 이용하여 텔레비전 배열에 3개의 텔레비전을 생성하여 지정


		t[0].channel=7;
		t[1].channel=7;
		t[2].channel=11;
		// (3) 텔레비전 채널을 각각 7, 7, 11로 지정

		for(int j=0;j<3;j++)
			System.out.println(t[j].channel);
		// (4) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
	}


}