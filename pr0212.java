//��Ģ���� ���� �����
//�����߻� �ذ���ϴ��� 
import java.util.Scanner;
public class pr0212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("����>>"); 
				
		double num1 = 0;
		num1 = scan.nextDouble();
		String func = "";
		func = scan.next();
		double num2 = 0;
		num2 = scan.nextDouble(); 
		
		double res = 0; 
		
		
		if(func.equals("+")){ 
			res = num1 + num2; 
		}else if(func.equals("-")) {
			res = num1 - num2; 
		}else if(func.equals("*")) {
				res = num1 * num2; 
		}else if(func.equals("/")) {
			 if(num2 == 0) { 
				System.out.print("0���� ���� �� �����ϴ�."); 
			 }
		System.out.println(num1 + func + num2+"�� �������"+res); 
		
		scan.close();	 
		} 
	
}
}
	

