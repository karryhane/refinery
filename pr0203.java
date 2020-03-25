//스캐너로 금액을 입력받아 오만원권/일만원권/천원권/오백원/백원/십원 동전 몇개씩 나오는지 출력하기
import java.util.Scanner;

public class pr0203 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.print("금액: "); 
		
		int num = 0;
		num = scan.nextInt(); 
		
		
		System.out.println("5만원원권:"+num/50000+"장"); 
		num%=50000; 
		System.out.println("1만원권: "+num/10000+"장"); 
		num%=10000; 
		System.out.println("천원권: "+num/1000+"장"); 
		num%=1000; 
		System.out.println("100원짜리 동전: "+num/100+"개"); 
		num%=100; 
		System.out.println("50원짜리 동전: "+num/50+"개"); 
		num%=50; 
		System.out.println("10원짜리 동전: "+num/10+"개"); 
		num%=10; 
		System.out.println("입니다.");
		
		scan.close(); }


	}


