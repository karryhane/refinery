//��ĳ�ʷ� �ݾ��� �Է¹޾� ��������/�ϸ�����/õ����/�����/���/�ʿ� ���� ��� �������� ����ϱ�
import java.util.Scanner;

public class pr0203 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.print("�ݾ�: "); 
		
		int num = 0;
		num = scan.nextInt(); 
		
		
		System.out.println("5��������:"+num/50000+"��"); 
		num%=50000; 
		System.out.println("1������: "+num/10000+"��"); 
		num%=10000; 
		System.out.println("õ����: "+num/1000+"��"); 
		num%=1000; 
		System.out.println("100��¥�� ����: "+num/100+"��"); 
		num%=100; 
		System.out.println("50��¥�� ����: "+num/50+"��"); 
		num%=50; 
		System.out.println("10��¥�� ����: "+num/10+"��"); 
		num%=10; 
		System.out.println("�Դϴ�.");
		
		scan.close(); }


	}


