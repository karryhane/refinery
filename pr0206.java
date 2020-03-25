// 369게임 33,66,99,36,39,63,69,93,96은 박수짝짝
// 3이나 6이나 9가 한 번 들어간 경우는 박수짝 출력

import java.util.Scanner;

public class pr0206 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오");
		int num = scan.nextInt();

		int a = 0;
		int b = 0;

		if (num >= 1 && num <= 99)
			a = num / 10;
			b = num % 10;

		if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 || b == 9)) {
			System.out.println("박수짝짝");
		} else if ((a == 3 || a == 6 || a == 9) || (b == 3 || b == 6 || b == 9)) {
			System.out.println("박수짝");
		}
	}
}
