//두 원의 중심 좌표평면값, 반지름 길이를 입력받아
//겹치나 안겹치나 알아보기

//수알못
//못풀었음

import java.util.Scanner;

public class pr0210 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("첫 번째 원의 중심과 반지름의 길이를 입력>>");
		double x1 = 0;
		x1 = scan.nextDouble();
		double y1 = 0;
		y1 = scan.nextDouble();
		double r1 = scan.nextDouble();

		System.out.println("두 번째 원의 중심과 반지름 입력>>");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double r2 = scan.nextDouble();

		if (length) // ??????
		{
			System.out.println("두 원은 겹친다.");
		} else {
			System.out.println("두 원은 겹치치 않는다.");
		}
		scan.close();

	}

}
