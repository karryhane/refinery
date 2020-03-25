import java.util.Scanner;

//사각형 크기 입력받고, 입력한 점이 사각형 안에 있는지 판별하기 
public class pr0207 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("사각형의 가로 세로 크기를 입력하세요.");

		int x = 0;
		x = scan.nextInt();
		int y = 0;
		y = scan.nextInt();

		if ((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
			System.out.println("사각형 안에 점이 있습니다.");
		}else {
			System.out.println("사각형 안에 점이 없습니다.");
		}
		scan.close();
	}
}
