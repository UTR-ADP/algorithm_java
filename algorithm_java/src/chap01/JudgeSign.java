package chap01;

import java.util.Scanner;

public class JudgeSign {
	public static void main (String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : "); int n = stdIn.nextInt();
		
		if (n > 0) { //양수
			System.out.println(n + "은 양수입니다.");
		} else if (n < 0) { //음수
			System.out.println(n + "은 음수입니다.");
		} else { //0ㅓ
			System.out.println(n + "은 0입니다.");
		}
	}
}
