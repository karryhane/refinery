//�ﰢ���� �� �� �ִ���? ���� �� ���� ���� < ������ �� ���� ������ ��
import java.util.Scanner;
public class pr0205 {

		public static void main(String[] args) { 
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("�� ���� ���̸� ������ �Է��ϼ���"); 
			
			int a = 0;
			a = scan.nextInt(); 
			int b = 0;
			b = scan.nextInt(); 
			int c = 0;
			c = scan.nextInt(); 
			
			if((a+b) <= c || (a+c) <= b || (b+c) <= a) {
				System.out.println("�ﰢ���� ���� �� �����ϴ�."); 
			}else {
				System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�."); 
			}
			
			scan.close(); }


	}


