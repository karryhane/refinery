package view;

import model.People;

public class Input implements GradeView {
	

	public void display() {
		People p = new People();
		System.out.println("�Է±��");
		System.out.println("���� �Է�: ");
		p.setName(scan.next());
		System.out.println("����: ");
		p.setScoreK(scan.next());
		System.out.println("����: ");
		p.setScoreM(scan.next());
		System.out.println("����: ");
		p.setScoreE(scan.next());
		p.setTotal(Integer.parseInt(p.getScoreK()) + Integer.parseInt(p.getScoreM()) + Integer.parseInt(p.getScoreE()));

		data.people = p;
		System.out.println("���� �Է� �Ϸ�");
	
	
	}

}
