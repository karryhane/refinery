import java.util.Scanner;
public class th0213 {
//���� ����ġ���� ���� �� �˾� 1~4 ���׿� ���� ��µǴ� �������?
	//����: 190, 90, 40, 10��
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����: ");
		char grade = scan.next().charAt(0);
		
		int sum = 0;
		
		switch(grade) {
		case 'A' : sum += 100;
		
		case 'B' : sum += 50;
		
		case 'C' : sum += 30;
		
		case 'D' : sum += 10;
		
		
		}
		System.out.println(sum + "���Դϴ�.");
	}

}
