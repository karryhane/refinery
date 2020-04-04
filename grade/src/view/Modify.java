package view;

import model.People;

public class Modify implements GradeView{
	public void display() {
		System.out.println("::: ���� ��� :::");
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
			System.out.println("������ �����͸� ã�� �� �����ϴ�!");
			display();
		} else {
			System.out.println("������ �����͸� ã�ҽ��ϴ�!");
			People newPeople = new People();
			newPeople.setIdx(idx);
			System.out.print("�� �̸��Է� : ");
			newPeople.setName(scan.next());
			System.out.print("�������� : ");
			newPeople.setScoreK(scan.next());
			System.out.print("�������� : ");
			newPeople.setScoreM(scan.next());
			System.out.print("�������� : ");
			newPeople.setScoreE(scan.next());
			newPeople.setTotal(Integer.parseInt(newPeople.getScoreK()) + Integer.parseInt(newPeople.getScoreM()) + Integer.parseInt(newPeople.getScoreE()));
			newPeople.setAvg(newPeople.getTotal()/3);
			data.people = newPeople;
		}
	}

}