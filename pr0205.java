//삼각형이 될 수 있는지? 가장 긴 변의 길이 < 나머지 두 변의 길이의 합
import java.util.Scanner;
public class pr0205 {

		public static void main(String[] args) { 
			Scanner scan = new Scanner(System.in); 
			
			System.out.println("세 변의 길이를 정수로 입력하세요"); 
			
			int a = 0;
			a = scan.nextInt(); 
			int b = 0;
			b = scan.nextInt(); 
			int c = 0;
			c = scan.nextInt(); 
			
			if((a+b) <= c || (a+c) <= b || (b+c) <= a) {
				System.out.println("삼각형을 만들 수 없습니다."); 
			}else {
				System.out.println("삼각형을 만들 수 있습니다."); 
			}
			
			scan.close(); }


	}


