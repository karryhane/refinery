//Q1-1 두 개의 정수 x,y를 저장하기 위한 인스턴스 변수가 선언된 Point 클래스를 정의하시오
class Point {
	int x;
	int y;

	Point() {
		this(1,1);
//		this.x = x;
//		this.y = y;
	}
	

//Q1-4 Point 클래스에 x,y를 매개변수로하는 생성자와 기본생성자(x,y를 모두 1로 초기화)를 추가하시오.
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

//Q1-3 Point 클래스에서 toString() 오버라이딩해서 x,y를 포함한 문자열을 반환하시오
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

//Q1-5 Point클래스의 double타입의 값으로 계산해서 반환하는 static메소드 getDistance(Point p1, Point p2)를 추가하시오
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

//Q1-6 Point 클래스에서 두 점 사이의 거리를 double 타입의 값으로 계산해서 반환하는 getDistance(Point p)를 추가하시오 
//	코드의  중복을 제거하려면, 어느 한 쪽이 다른 쪽을 호출하면 된다. 
	double getDistance(Point p) {
		return getDistance(p, this);
//		int a = this.x - p.x;
//		int b = this.y - p.y;
//
//		return Math.sqrt(a * a + b * b);
	}

//Q1-7 Point클래스의 equals()를 다음과 같은 조건으로 오버라이딩하고 테스트하시오
//-비교하는 객체가 Point 객체가 아니면 false를 반환
//-Point 객체의 x와 y값이 같을 때에만 true를  반환 	

	//this와 obj를 비교해서 같으면 true, 다르면 false
	public boolean equals(Object obj) {
		//obj가 Point일 것, 아니면 false
		if (!(obj instanceof Point)) {
			return false;
		} else {
			return true;
		}
	}

//Q1-8 Point클래스를 상속받고 z를 인스턴스 변수로 갖는 Point3D 클래스를 작성하시오.

	class Point3D extends Point {
		int z;

//Q1-9 Point 3D 클래스에 생성자 Point3D(int x, int y, int z)와 기본 생성자 (x,y,z를 1로 초기화)를 추가하시오. 
		Point3D() {
			this(1, 1, 1);
		}

		Point3D(int x, int y, int z) {
			super(x,y);		//조상멤버는 조상 생성자로 초기화한다. 
//			this.x = x;
//			this.y = y;
			this.z = z;
		}

//Q1-10 Point3D클래스의 toString()이 x,y,z의 값을 문자열로 반환하도록 오버라이딩 하시오.
		@Override
		public String toString() {
			return super.toString() + ", z = " + z;
//			return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
		}
	}

}
	

//Q1-2 앞서 정의한 point클래스를 테스트하기위한 PointTest클래스를 작성하고 
//point 클래스를 작성하고 Point 객체를 생성하는 코드를 작성하시오.
