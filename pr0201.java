import java.util.Scanner;
public class pr0201 {
//Scanner Ŭ������ �̿��Ͽ� �Է¹��� ��ȭ ���� �޷��� �ٲٰ�//

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���(����:��)>>");
		int num = scan.nextInt();
		double dollar = num / 1100;
		System.out.println(num + "���� $" + dollar + "�Դϴ�.");
		scan.close();
	}

}
