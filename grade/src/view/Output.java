package view;

import model.People;

public class Output implements GradeView {
	
	
	public void display() {
		People[] pArr = data.pArr;
		
		System.out.println("��±��");
		if(pArr == null) {
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		if(pArr.length == 0) {
			System.out.println("����� ������ �����ϴ�. ");
			return;
		}
		
		for(People P : pArr) {
			System.out.println(P);
		}
	}

}
