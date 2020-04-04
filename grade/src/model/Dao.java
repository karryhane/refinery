package model;


import static resource.Repository.*;

public class Dao {
	private static int sequence = 1;
	private People[] pArr = new People[MAX];
	private int top = 0;/*
	{
		pArr[top++] = new People(sequence++, "김", "80", "90", "100", 270, 90, 0);
		
		
	

	}*/

	// private Dao() {

	private static Dao instance;

	public static Dao getInstance() {
		if (instance == null) {
			instance = new Dao();
		}

		return instance;
	}

	public void insert(People dto) {
		if (top >= MAX) {
			System.out.println("더 이상 입력하실 수 없습니다.");
			return;
		}
		dto.setIdx(sequence++);
		pArr[top++] = dto;
	}

	public People[] select() {
		People[] arr = new People[top];
		for(int i = 0; i < arr.length; i++) {
			People dto = new People();
			dto.setIdx(pArr[i].getIdx());
			dto.setName(pArr[i].getName());
			dto.setScoreK(pArr[i].getScoreK());
			dto.setScoreM(pArr[i].getScoreM());
			dto.setScoreE(pArr[i].getScoreE());
			dto.setTotal(pArr[i].getTotal());
			dto.setAvg(pArr[i].getAvg());
			arr[i] = dto;
		}
		return arr;
	}

	public People[] select(People dto) {
		People[] tmp = new People[top];
		int cnt = 0;
		for (int i = 0; i < top; i++) {
			if (pArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				People p = new People();
				p.setIdx(pArr[i].getIdx());
				p.setName(pArr[i].getName());;
				p.setScoreK(pArr[i].getScoreK());
				p.setScoreM(pArr[i].getScoreM());
				p.setScoreE(pArr[i].getScoreE());
				p.setTotal(pArr[i].getTotal());
				p.setAvg(pArr[i].getAvg());
				tmp[cnt++] = p;
			}
		}
		People[] arr = new People[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = tmp[i];
		}
		return arr;
	}

	public void modify(People dto) {
		System.out.println(" " + dto);
		boolean flag = false;
		for (int i = 0; i < top; i++) {
			if (dto.getIdx() == pArr[i].getIdx()) {
				pArr[i] = dto;
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("수정 실패!");
		} else {
			System.out.println("수정 성공!");
		}
	}

	public void delete(People dto) {
		for (int i = 0; i < top; i++) {
			if (dto.getIdx() == pArr[i].getIdx()) {
				for (int j = i; j < top - 1; j++) {
					pArr[j] = pArr[j + 1];
				}
				top--;
				break;
			}
		}
	}

	public void rank(People dto) {
		for(int i = 0; i < top; i++) {
			if(dto.getTotal() < pArr[i].getTotal()) {
				People tmp = dto;
				dto = pArr[i];
				pArr[i] = dto;
			}
		}
	}
}
	
	
