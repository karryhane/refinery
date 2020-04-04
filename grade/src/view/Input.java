package view;

import model.People;

public class Input implements GradeView {
	

	public void display() {
		People p = new People();
		System.out.println("입력기능");
		System.out.println("성명 입력: ");
		p.setName(scan.next());
		System.out.println("국어: ");
		p.setScoreK(scan.next());
		System.out.println("수학: ");
		p.setScoreM(scan.next());
		System.out.println("영어: ");
		p.setScoreE(scan.next());
		p.setTotal(Integer.parseInt(p.getScoreK()) + Integer.parseInt(p.getScoreM()) + Integer.parseInt(p.getScoreE()));

		data.people = p;
		System.out.println("정보 입력 완료");
	
	
	}

}
