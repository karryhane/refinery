//3개의 정수를 입력받아 중간값을 출력

import java.util.Scanner;
public class pr0204 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		int a = 0;
		int b = 0;
		int c = 0; 
		
		System.out.println("3개의 정수를 입력하시오"); 
		a = scan.nextInt(); 
		b = scan.nextInt(); 
		c = scan.nextInt(); 
		
		if(a < b && b < c) {
			System.out.print("mid: "+b);
		}else if(b < a && a < c) {
			System.out.print("mid: "+a);
		}else{
			System.out.print("mid: "+c);
			
		} 
		
		scan.close(); 
		}



	}


