//원의 중심을 나타내는 점과 반지름을 실수로 입력받아
//임의의 좌표평면값이 원의 내부/외부에 있는지 판별하기 

import java.util.Scanner;
public class pr0209 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("원의 중심이 되는 좌표평면값을 입력하세요."); 
				
		double p1 = 0;
		p1 = scan.nextDouble(); 
		double p2 = 0;
		p2 = scan.nextDouble(); 
		
		System.out.println("반지름의 길이를 입력하세요. ");
		double r = 0; 
		r = scan.nextDouble();
		
		System.out.println("임의의 좌표평면값(x,y)의 값을 입력하세요."); 
		double x = 0;
		x = scan.nextDouble(); 
		double y = 0;
		y = scan.nextDouble();
				
		double length = Math.sqrt((x - p1)*(x - p1)+(y - p2)*(y - p2));
		
		if(length < r) {
			System.out.println("좌표평면값  ("+x+","+y+")은"+"원 내부에 있습니다."); 
		}else {
			System.out.println("좌표평면값 ("+x+","+y+")은"+"원외부에 있습니다."); 
		}
		
		scan.close();

	}

}
