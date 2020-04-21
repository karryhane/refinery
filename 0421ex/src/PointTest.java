import java.awt.Point;

public class PointTest {
		public static void main(String[] args) {
			Point p = new Point();

			Point p1 = new Point(1, 1);
//Q1-3 PointTest클래스에서 Point객체를 생성한다음, x,y의 값을 3,5를 초기화하시오. 
//Q1-3 그리고 toString()을 호출해서 x,y값을 출력하시오. 
//			p.x = 3;
//			p.y = 5;
			
			//인스턴스 메소드 호출
			//참조변수.메소드
			//p1, p2의 거리를 구한다. 
			double d = p.distance(p1);
			System.out.println(p.equals(p));
			System.out.println(p1.equals(p));
			System.out.println(Point.distance(0, 0, 1, 1));
			// Q1-4 그 다음에 PointTest클래스에서 테스트하시오.
		}
	}

