package view;

public class Menu implements GradeView{
	
	public void display() {
		System.out.println("1.�����Է� 2.������� 3.���� 4.�˻� 5.���� 6.���� 7.����");
		System.out.print("����: ");
		int no = scan.nextInt();
		data.no = no;
	}

}
