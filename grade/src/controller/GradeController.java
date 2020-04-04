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
				System.out.println("삭제 기능을 종료합니다.");
				return;
			}
			
			
		case 7 :
			System.out.println("프로그램 종료!");
			System.exit(0);
			break;
			
		default:
			System.out.println("해당 메뉴가 존재하지 않습니다.");
			
		
		}
		data.no = 0;
		service();
		
	}
	
}
