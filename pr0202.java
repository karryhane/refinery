/*
10~99�� �Է¹ް�, 10�� �ڸ��� 1�� �ڸ��� ������ ���θ� �Ǻ��ؼ� ���
*/

import java.util.Scanner;

public class pr0202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �ڸ����� ������ �Է��Ͻÿ�>>");
		int num = scan.nextInt();
		if (num / 10 == num % 10) {
			System.out.println("10���ڸ��� 1���ڸ��� �����ϴ�.");
		} else {
			System.out.println("10���ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scan.close();
	}

}
