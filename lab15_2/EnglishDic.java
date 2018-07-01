/*
 * 작성자: 정은애
 * 작성일: 2018.06.12.
 * 파일내용: set
 */

package lab15_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.

public class EnglishDic {
	public static void main(String[] args) {
		System.out.println("lab15_2: 정은애 \n");
		Map<String, Integer> st = new HashMap<String, Integer>();

		st.put("kim", 90);
		st.put("park", 80);
		st.put("lee", 100);

		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("이름 입력 : ");
			String key = sc.next();
			if( key.equals("quit") ) break;
			System.out.println("성적 = " + st.get(key));
		} while(true);

		System.out.println(st);
	}
}