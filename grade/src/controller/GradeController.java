package controller;

import static resource.Repository.*;
import model.People;

public class GradeController {
	public void search() {
		search.display();
		data.pArr = dao.select(data.people);
		search.display(data.pArr);
	}
	
	public void service() {
		if(data.no == 0) {
			menu.display();
		}
		
		switch(data.no) {

		case 1 :
			input.display();
			People dto = data.people;
			dao.insert(dto);
			break;
			
		case 2 :
			data.pArr = dao.select();
			output.display();
			break;
			
		case 3 : 
			data.pArr = dao.select();
			rank.display();
			break;
			
		case 4 :
			search();
			break;
		case 5 :
			search();
			modify.display();
			dao.modify(data.people);
			break;
			
		case 6 :
			search();
			delete.display();
			if(data.people == null) {
				System.out.println("���� ����� �����մϴ�.");
				return;
			}
			
			
		case 7 :
			System.out.println("���α׷� ����!");
			System.exit(0);
			break;
			
		default:
			System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
			
		
		}
		data.no = 0;
		service();
		
	}
	
}
