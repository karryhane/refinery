package view;

public class Menu implements GradeView{
	
	public void display() {
		System.out.println("1.성적입력 2.성적출력 3.순위 4.검색 5.수정 6.삭제 7.종료");
		System.out.print("선택: ");
		int no = scan.nextInt();
		data.no = no;
	}

}
