import java.util.Scanner;

//�簢�� ũ�� �Է¹ް�, �Է��� ���� �簢�� �ȿ� �ִ��� �Ǻ��ϱ� 
public class pr0207 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�簢���� ���� ���� ũ�⸦ �Է��ϼ���.");

		int x = 0;
		x = scan.nextInt();
		int y = 0;
		y = scan.nextInt();

		if ((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
			System.out.println("�簢�� �ȿ� ���� �ֽ��ϴ�.");
		}else {
			System.out.println("�簢�� �ȿ� ���� �����ϴ�.");
		}
		scan.close();
	}
}
