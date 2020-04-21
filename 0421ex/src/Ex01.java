//Q1-1 �� ���� ���� x,y�� �����ϱ� ���� �ν��Ͻ� ������ ����� Point Ŭ������ �����Ͻÿ�
class Point {
	int x;
	int y;

	Point() {
		this(1,1);
//		this.x = x;
//		this.y = y;
	}
	

//Q1-4 Point Ŭ������ x,y�� �Ű��������ϴ� �����ڿ� �⺻������(x,y�� ��� 1�� �ʱ�ȭ)�� �߰��Ͻÿ�.
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//Q1-3 Point Ŭ�������� toString() �������̵��ؼ� x,y�� ������ ���ڿ��� ��ȯ�Ͻÿ�
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//Q1-5 PointŬ������ doubleŸ���� ������ ����ؼ� ��ȯ�ϴ� static�޼ҵ� getDistance(Point p1, Point p2)�� �߰��Ͻÿ�
	static double getDistance(int x1, int x2, int y1, int y2) {
		int a = x1 - x2;
		int b = y1 - y2;

		return Math.sqrt(a * a + b * b);

	}
	
	static double getDistance(Point p1, Point p2) {
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		
		return (a*a + b*b);
	}

//Q1-6 Point Ŭ�������� �� �� ������ �Ÿ��� double Ÿ���� ������ ����ؼ� ��ȯ�ϴ� getDistance(Point p)�� �߰��Ͻÿ� 
//	�ڵ���  �ߺ��� �����Ϸ���, ��� �� ���� �ٸ� ���� ȣ���ϸ� �ȴ�. 
	double getDistance(Point p) {
		return getDistance(p, this);
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//
//		return Math.sqrt(a * a + b * b);
	}

//Q1-7 PointŬ������ equals()�� ������ ���� �������� �������̵��ϰ� �׽�Ʈ�Ͻÿ�
//-���ϴ� ��ü�� Point ��ü�� �ƴϸ� false�� ��ȯ
//-Point ��ü�� x�� y���� ���� ������ true��  ��ȯ 	

	//this�� obj�� ���ؼ� ������ true, �ٸ��� false
	public boolean equals(Object obj) {
		//obj�� Point�� ��, �ƴϸ� false
		if (!(obj instanceof Point)) {
			return false;
		} else {
			return true;
		}
	}

//Q1-8 PointŬ������ ��ӹް� z�� �ν��Ͻ� ������ ���� Point3D Ŭ������ �ۼ��Ͻÿ�.

	class Point3D extends Point {
		int z;

//Q1-9 Point 3D Ŭ������ ������ Point3D(int x, int y, int z)�� �⺻ ������ (x,y,z�� 1�� �ʱ�ȭ)�� �߰��Ͻÿ�. 
		Point3D() {
			this(1, 1, 1);
		}

		Point3D(int x, int y, int z) {
			super(x,y);		//�������� ���� �����ڷ� �ʱ�ȭ�Ѵ�. 
//			this.x = x;
//			this.y = y;
			this.z = z;
		}

//Q1-10 Point3DŬ������ toString()�� x,y,z�� ���� ���ڿ��� ��ȯ�ϵ��� �������̵� �Ͻÿ�.
		@Override
		public String toString() {
			return super.toString() + ", z = " + z;
//			return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
		}
	}

}
	

//Q1-2 �ռ� ������ pointŬ������ �׽�Ʈ�ϱ����� PointTestŬ������ �ۼ��ϰ� 
//point Ŭ������ �ۼ��ϰ� Point ��ü�� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
