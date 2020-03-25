/*
10~99를 입력받고, 10의 자리와 1의 자리가 같은지 여부를 판별해서 출력
*/

import java.util.Scanner;

public class pr0202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 자리수의 정수를 입력하시오>>");
		int num = scan.nextInt();
		if (num / 10 == num % 10) {
			System.out.println("10의자리와 1의자리가 같습니다.");
		} else {
			System.out.println("10의자리와 1의 자리가 다릅니다.");
		}
		scan.close();
	}

}
