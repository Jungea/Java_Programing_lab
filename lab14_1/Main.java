/*
 * 작성자: 정은애
 * 작성일: 2018.05.31.
 * 파일내용: 디버거 사용하기
 */

package lab14_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: 정은애");

		int[] values = new int[] {1, 2, 3, -1}; 
		int sum = arraySum(values);   // (가) breakpoint 설정
		System.out.print("합은 ");
		System.out.println(sum);
	}

	private static int arraySum(int[] array) {
		int sum = 0;     
		for (int i = 0; i < array.length; i++) {  
			sum += array[i];   // (나) =+ 오류
		} 
		return sum;     // (다) breakpoint 설정 후 삭제
	}
}