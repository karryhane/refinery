//���� �߽��� ��Ÿ���� ���� �������� �Ǽ��� �Է¹޾�
//������ ��ǥ��鰪�� ���� ����/�ܺο� �ִ��� �Ǻ��ϱ� 

import java.util.Scanner;
public class pr0209 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("���� �߽��� �Ǵ� ��ǥ��鰪�� �Է��ϼ���."); 
				
		double p1 = 0;
		p1 = scan.nextDouble(); 
		double p2 = 0;
		p2 = scan.nextDouble(); 
		
		System.out.println("�������� ���̸� �Է��ϼ���. ");
		double r = 0; 
		r = scan.nextDouble();
		
		System.out.println("������ ��ǥ��鰪(x,y)�� ���� �Է��ϼ���."); 
		double x = 0;
		x = scan.nextDouble(); 
		double y = 0;
		y = scan.nextDouble();
				
		double length = Math.sqrt((x - p1)*(x - p1)+(y - p2)*(y - p2));
		
		if(length < r) {
			System.out.println("��ǥ��鰪  ("+x+","+y+")��"+"�� ���ο� �ֽ��ϴ�."); 
		}else {
			System.out.println("��ǥ��鰪 ("+x+","+y+")��"+"���ܺο� �ֽ��ϴ�."); 
		}
		
		scan.close();

	}

}
