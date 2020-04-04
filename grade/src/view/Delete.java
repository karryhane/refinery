package view;

import model.People;

public class Delete implements GradeView{

	@Override
	public void display() {
		System.out.println("::: 삭제 기능 :::");
		if(data.pArr.length == 0) {
			System.out.println("삭제 할 데이터가 없습니다!");
			data.people = null;
			return;
		}
		System.out.print("삭제 할 idx 입력: ");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.pArr.length; i++) {
			if(idx == data.pArr[i].getIdx()) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("삭제 할 데이터를 찾을 수 없습니다!");
			display();
		} else {
			System.out.println("삭제 할 데이터를 찾았습니다!");
			data.people = new People(idx, "", "", "", "", 0, 0);
		}
	}
	}
