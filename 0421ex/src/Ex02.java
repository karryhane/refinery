
//Q2-1 Object배열 objArr을 인스턴스변수로 갖는 클래스MyVector 클래스를 선언하시오
class MyVector {
	Object[] objArr;

//Q2-2 MyVector클래스에 생성자 MyVector(int capacity)와 기본 생성자 capacity = 16 를 추가하시오
	
	MyVector(int capacity) {
		objArr = Object[capacity];
	}
	
	MyVector(){
		this(16);
	}
}

public class Ex02 {
	public static void main(String[] args) {
	}
}
