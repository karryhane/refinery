//사칙연산 계산기 만들기
//에러발생 해결못하는중 
import java.util.Scanner;
public class pr0212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("연산>>"); 
				
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
				System.out.print("0으로 나눌 수 없습니다."); 
			 }
		System.out.println(num1 + func + num2+"의 계산결과는"+res); 
		
		scan.close();	 
		} 
	
}
}
	

