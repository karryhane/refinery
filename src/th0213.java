import java.util.Scanner;
public class th0213 {
//다음 스위치문이 있을 때 알애 1~4 문항에 따라 출력되는 결과값은?
	//정답: 190, 90, 40, 10점
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점: ");
		char grade = scan.next().charAt(0);
		
		int sum = 0;
		
		switch(grade) {
		case 'A' : sum += 100;
		
		case 'B' : sum += 50;
		
		case 'C' : sum += 30;
		
		case 'D' : sum += 10;
		
		
		}
		System.out.println(sum + "점입니다.");
	}

}
