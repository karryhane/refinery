package view;

import model.People;

public class Rank implements GradeView {

	public void display() {
		People[] pArr = data.pArr;
		People[] pArrR = pArr;

		System.out.println("���� �� ��±��");
		if (pArrR == null) {
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		if (pArrR.length == 0) {
			System.out.println("����� ������ �����ϴ�. ");
			return;
		}

		for(int i = 0; i < pArrR.length; i++) {
			for(int j = i+1; j < pArrR.length; j++)
			{
			if(pArrR[i].getTotal() < pArrR[j].getTotal()) {
				People tmp = pArrR[i];
				pArrR[i] = pArrR[j];
				pArrR[j] = tmp;
			}
			}
		}
			for(int i = 0; i < pArrR.length ; i++) {
				System.out.print(i+1+"��: "+pArrR[i]+"\n");
			}
		}
	}
