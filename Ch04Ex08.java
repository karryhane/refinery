import java.util.Scanner;

public class Ch04Ex08 {
	public static final int MAX = 1000;
	private Ppl[] pArr = new Ppl[MAX];
	private int top = 0;
	private int sequence = 0;

	public static Scanner scan = new Scanner(System.in);

	public Ch04Ex08() {
		System.out.println("����Ʈ ������ ȣ��!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			terminate();
			break;

		default:
			System.out.println("�ش� ���� �����ϴ�!");
		}
		System.out.println("----------------------------");
	}

	
	public int menu() {

		int no = 0;
		System.out.println("������ �޴��� ��ȣ�� �Է��ϼ���!");
		System.out.println("1.�Է�  2.���  3.�˻�   4.����  5.����  6.����");
		System.out.print("����: ");
		try {
			no = scan.nextInt();

		} catch (Exception e) {
			scan = new Scanner(System.in);
			System.out.println("�Է°��� 1��  6 ������ ���Դϴ�. �ٽ� �Է����ּ���");
			menu();

		}
		return no;
	}
	

	public void input() {
		System.out.println("�Է±��...");
		if (top >= pArr.length) {
			System.out.println("�� �̻� �Է� �Ұ����մϴ�!");
			return;
		}
		Ppl p = new Ppl();
		p.setIdx(sequence++);
		System.out.print("�����Է�: ");
		p.setName(scan.next());
		scan.nextLine();
		System.out.print("��ȭ��ȣ(���� ���� �Է��ϼ���): ");
		p.setPhone(scan.next());

		pArr[top++] = p;

		System.out.println("�Է� �Ϸ�");
	}
	

	public void output() {
		System.out.println("��±��...");
		// pArr�� ��Ҹ� top���� �ݺ��ؼ� ����Ѵ�.
		for (Ppl p : pArr) {
			if (p == null)
				break;
			System.out.println(p);
		}
	}
	
	

	public int search() {
		System.out.println("�˻����...");
		while (true) {
			run2();
		}
	}
	

	public void run2() {
		switch (menu1()) {
		case 1:
			srcIdx();
			break;
		case 2:
			srcName();
			break;
		case 3:
			srcPhone();
			break;
		case 4:
			srcExit();
			break;

		default:
			System.out.println("�ش� ���� �����ϴ�!");
		}
		System.out.println("----------------------------");
	}
	

	public int menu1() {
		int no = 0;
		System.out.println("�˻��� �׸��� ��ȣ�� �Է��ϼ���");
		System.out.println("(1)ȸ����ȣ�� �˻� (2)�̸����� �˻� (3)��ȭ��ȣ�� �˻� (4)������");
		System.out.print("����: ");
		no = scan.nextInt();
		return no;
	}

	public void srcIdx() {
		System.out.println("�˻��� �ε������� �Է��ϼ���");
		int srcIdx = scan.nextInt();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];
			
			if (p.getIdx() == srcIdx) {
				System.out.println(p);
				m++;
			}
	}
		if(m == 0) {
			System.out.println("�Է��� �����Ͱ� �������� �ʽ��ϴ�. ");
		}
	}
	

	public void srcName() {
		System.out.println("�˻��� �̸��� �Է��ϼ���");
		String srcName = scan.next();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getName().equals(srcName)) {
				System.out.println(p);
				m++;
			}
		}
		if (m == 0) {
			System.out.println("�Է��� �����Ͱ� �������� �ʽ��ϴ�. ");
		}
	}
	

	public void srcPhone() {
		System.out.println("�˻��� ��ȭ��ȣ�� �Է��ϼ���");
		String srcPhone = scan.next();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getPhone().equals(srcPhone)) {
				System.out.println(p);
				m++;
			}
		}

		if (m == 0) {
			System.out.println("�Է��� �����Ͱ� �������� �ʽ��ϴ�. ");
		}
	}

	public void srcExit() {
		while (true) {
			run();
		}

	}
	

	public void modify() {
		System.out.println("�������...");

		System.out.print("������ ��ȣ�� �Է��ϼ���: ");
		int idx = scan.nextInt();
		System.out.println("�̸��Է�: ");
		String newName = scan.next();
		System.out.println("��ȭ��ȣ �Է�(���� ���� �Է��ϼ���): ");
		String newPhone = scan.next();

		for (int i = idx; i < top; i++) {
			Ppl p = pArr[i];

			if (p.getIdx() == idx) {
				p.setName(newName);
				p.setPhone(newPhone);
				System.out.println("������� : [" + p.getIdx() + ", " + p.getName() + ", " + p.getPhone() + "]");
			}
		}
	}

	
	public void delete() {
		System.out.println("������� ...");
		System.out.print("������ ���� �Է�: ");
		String name = scan.next();
		int m = 0;

		for (int i = 0; i < top; i++) {
			Ppl p = pArr[i];

			if (p.getName().equals(name)) {
				System.out.println(p);
				// p.setIdx(i);
				p.setName("������");
				p.setPhone("������");
				m++;
			}
		}
		if (m == 0) {
			System.out.println("������ ������ �����ϴ�.");

		} else {
			System.out.println("���� �Ϸ�");
		}
	}

	public void terminate() {
		System.out.println("�����մϴ�.");
		System.exit(0);
	}

	public static void main(String[] args) {
		new Ch04Ex08();
	}
}
