//�������� 10���� �Է¹޾� 3�ǹ���� ����ϴ� ���α׷�

import java.util.Scanner;

public class pr0305 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);

		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for (int i = 0; i < arr.length; i++)
			arr[i] = scan.nextInt();

		System.out.print("3�� ����� ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0)

				System.out.print(arr[i] + " ");
		}
		scan.close();
	}
}
