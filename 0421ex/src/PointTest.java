import java.awt.Point;

public class PointTest {
		public static void main(String[] args) {
			Point p = new Point();

			Point p1 = new Point(1, 1);
//Q1-3 PointTestŬ�������� Point��ü�� �����Ѵ���, x,y�� ���� 3,5�� �ʱ�ȭ�Ͻÿ�. 
//Q1-3 �׸��� toString()�� ȣ���ؼ� x,y���� ����Ͻÿ�. 
//			p.x = 3;
//			p.y = 5;
			
			//�ν��Ͻ� �޼ҵ� ȣ��
			//��������.�޼ҵ�
			//p1, p2�� �Ÿ��� ���Ѵ�. 
			double d = p.distance(p1);
			System.out.println(p.equals(p));
			System.out.println(p1.equals(p));
			System.out.println(Point.distance(0, 0, 1, 1));
			// Q1-4 �� ������ PointTestŬ�������� �׽�Ʈ�Ͻÿ�.
		}
	}

