package view;

import model.People;

public class Output implements GradeView {
	
	
	public void display() {
		People[] pArr = data.pArr;
		
		System.out.println("출력기능");
		if(pArr == null) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		if(pArr.length == 0) {
			System.out.println("출력할 내용이 없습니다. ");
			return;
		}
		
		for(People P : pArr) {
			System.out.println(P);
		}
	}

}
