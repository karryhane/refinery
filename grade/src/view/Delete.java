package view;

import model.People;

public class Delete implements GradeView{

	@Override
	public void display() {
		System.out.println("::: ���� ��� :::");
		if(data.pArr.length == 0) {
			System.out.println("���� �� �����Ͱ� �����ϴ�!");
			data.people = null;
			return;
		}
		System.out.print("���� �� idx �Է�: ");
		int idx = scan.nextInt();
		boolean flag = false;
		for(int i=0; i<data.pArr.length; i++) {
			if(idx == data.pArr[i].getIdx()) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("���� �� �����͸� ã�� �� �����ϴ�!");
			display();
		} else {
			System.out.println("���� �� �����͸� ã�ҽ��ϴ�!");
			data.people = new People(idx, "", "", "", "", 0, 0);
		}
	}
	}
