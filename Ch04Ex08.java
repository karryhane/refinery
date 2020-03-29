import java.util.Scanner;

public class Ch04Ex08 {
	public static final int MAX = 1000;
	private Ppl[] pArr = new Ppl[MAX];
	private int top = 0;
	private int sequence = 0;

	public static Scanner scan = new Scanner(System.in);

	public Ch04Ex08() {
		System.out.println("디폴트 생성자 호출!");

		while (true) {
			run();
		}
	}

	public void run() {
		switch (menu()) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			modify();
			break;
		case 5:
			delete();
			break;
		case 6:
			terminate();
			break;

		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("----------------------------");
	}

	public int menu() {

		int no = 0;
		System.out.println("실행할 메뉴의 번호를 입력하세요!");
		System.out.println("1.입력  2.출력  3.검색   4.수정  5.삭제  6.종료");
		System.out.print("선택: ");
		try {
			no = scan.nextInt();

		} catch (Exception e) {
			scan = new Scanner(System.in);
			System.out.println("입력값은 1과  6 사이의 값입니다. 다시 입력해주세요");
			menu();

		}
		return no;
	}

	public void input() {
		System.out.println("입력기능...");
		if (top >= pArr.length) {
			System.out.println("더 이상 입력 불가능합니다!");
			return;
		}
		Ppl p = new Ppl();
		p.setIdx(sequence++);
		System.out.print("성명입력: ");
		p.setName(scan.next());
		scan.nextLine();
		System.out.print("전화번호(공백 없이 입력하세요): ");
		p.setPhone(scan.next());

		pArr[top++] = p;

		System.out.println("입력 완료");
	}

	public void output() {
		System.out.println("출력기능...");
		for (Ppl p : pArr) {
			if (p == null)
				break;
			System.out.println(p);
		}
	}

	public int search() {
		System.out.println("검색기능...");
		while (true) {
			run2();
		}
	}

	public void run2() {
		switch (menu1()) {
		case 1:
			srcIdx();
			break;
		case 2:
			srcName();
			break;
		case 3:
			srcPhone();
			break;
		case 4:
			srcExit();
			break;

		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("----------------------------");
	}

	public int menu1() {
		int no = 0;
		System.out.println("검색할 항목의 번호를 입력하세요");
		System.out.println("(1)회원번호로 검색 (2)이름으로 검색 (3)전화번호로 검색 (4)나가기");
		System.out.print("선택: ");
		no = scan.nextInt();
		return no;
	}

	public void srcIdx() {
		System.out.println("검색할 인덱스값을 입력하세요");
		int srcIdx = scan.nextInt();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getIdx() == srcIdx) {
				System.out.println(p);
				m++;
			}
		}
		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void srcName() {
		System.out.println("검색할 이름을 입력하세요");
		String srcName = scan.next();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getName().equals(srcName)) {
				System.out.println(p);
				m++;
			}
		}
		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void srcPhone() {
		System.out.println("검색할 전화번호를 입력하세요");
		String srcPhone = scan.next();
		int m = 0;
		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getPhone().equals(srcPhone)) {
				System.out.println(p);
				m++;
			}
		}

		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void srcExit() {
		while (true) {
			run();
		}

	}

	public int modify() {
		System.out.println("수정기능...");
		while (true) {
			run3();
		}
	}

	public void run3() {
		switch (menu2()) {
		case 1:
			modIdx();
			break;
		case 2:
			modName();
			break;
		case 3:
			modPhone();
			break;
		case 4:
			modExit();
			break;

		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("----------------------------");
	}

	public int menu2() {
		int no = 0;
		System.out.println("수정할 항목의 번호를 입력하세요");
		System.out.println("(1)회원번호 수정 (2)이름 수정 (3)전화번호 수정 (4)나가기");
		System.out.print("선택: ");
		no = scan.nextInt();
		return no;
	}

	public void modIdx() {

		System.out.println("수정기능...");
		System.out.println("수정할 인덱스값을 입력하세요");
		int modIdx = scan.nextInt();
		int m = 0;
		System.out.println("이름입력: ");
		String newName = scan.next();
		System.out.println("전화번호 입력(공백 없이 입력하세요): ");
		String newPhone = scan.next();

		for (int k = modIdx; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getIdx() == modIdx) {
				p.setName(newName);
				p.setPhone(newPhone);
				System.out.println(p);
				m++;
				System.out.println("수정결과 : [" + p.getIdx() + ", " + p.getName() + ", " + p.getPhone() + "]");
			}
		}
		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void modName() {

		System.out.println("수정기능...");
		System.out.println("수정할 이름을 입력하세요");
		String modName = scan.next();
		int m = 0;
		System.out.println("이름입력: ");
		String newName = scan.next();
		System.out.println("전화번호 입력(공백 없이 입력하세요): ");
		String newPhone = scan.next();

		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getName().equals(modName)) {
				p.setName(newName);
				p.setPhone(newPhone);
				System.out.println(p);
				m++;
				System.out.println("수정결과 : [" + p.getIdx() + ", " + p.getName() + ", " + p.getPhone() + "]");
			}
		}
		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void modPhone() {

		System.out.println("수정기능...");
		System.out.println("수정할 전화번호를 입력하세요");
		String modPhone = scan.next();
		int m = 0;
		System.out.println("이름입력: ");
		String newName = scan.next();
		System.out.println("전화번호 입력(공백 없이 입력하세요): ");
		String newPhone = scan.next();

		for (int k = 0; k < top; k++) {
			Ppl p = pArr[k];

			if (p.getPhone().equals(modPhone)) {
				p.setName(newName);
				p.setPhone(newPhone);
				System.out.println(p);
				m++;
				System.out.println("수정결과 : [" + p.getIdx() + ", " + p.getName() + ", " + p.getPhone() + "]");
			}
		}
		if (m == 0) {
			System.out.println("입력한 데이터가 존재하지 않습니다. ");
		}
	}

	public void modExit() {
		while (true) {
			run();
		}

	}

	public int delete() {
		System.out.println("삭제기능...");
		while (true) {
			run4();
		}
	}

	public void run4() {
		switch (menu3()) {
		case 1:
			delIdx();
			break;
		case 2:
			delName();
			break;
		case 3:
			delPhone();
			break;
		case 4:
			delExit();
			break;

		default:
			System.out.println("해당 사항 없습니다!");
		}
		System.out.println("----------------------------");
	}

	public int menu3() {
		int no = 0;
		System.out.println("삭제할 항목의 번호를 입력하세요");
		System.out.println("(1)회원번호 삭제 (2)이름 삭제 (3)전화번호 삭제 (4)나가기");
		System.out.print("선택: ");
		no = scan.nextInt();
		return no;
	}

	public void delIdx() {

		System.out.println("삭제기능...");
		System.out.println("삭제할 인덱스값을 입력하세요");
		int delIdx = scan.nextInt();
		int m = 0;

		for (int i = 0; i < top; i++) {
			Ppl p = pArr[i];

			if (p.getIdx() == delIdx) {
				System.out.println(p);
				p.setName("삭제됨");
				p.setPhone("삭제됨");
				m++;
			}

			if (m == 1) {
				pArr[i] = pArr[i + 1];
				p.setIdx(p.getIdx() - 1);
			}
		}
		if (m == 0) {
			System.out.println("삭제할 내용이 없습니다.");

		} else {
			System.out.println("삭제 완료");
		}
	}

	public void delName() {
		System.out.println("삭제기능...");
		System.out.println("삭제할 인덱스값을 입력하세요");
		String delName = scan.next();
		int m = 0;

		for (int i = 0; i < top; i++) {
			Ppl p = pArr[i];

			if (p.getName().equals(delName)) {
				System.out.println(p);
				// p.setIdx();
				p.setName("삭제됨");
				p.setPhone("삭제됨");
				m++;
			}

			if (m == 1) {
				pArr[i] = pArr[i + 1];
				p.setIdx(p.getIdx() - 1);
			}

		}
		if (m == 0) {
			System.out.println("삭제할 내용이 없습니다.");

		} else {
			System.out.println("삭제 완료");
		}
	}

	public void delPhone() {
		System.out.println("삭제기능...");
		System.out.println("삭제할 전화번호를 입력하세요");
		String delPhone = scan.next();
		int m = 0;

		for (int i = 0; i < top; i++) {
			Ppl p = pArr[i];

			if (p.getPhone().equals(delPhone)) {
				System.out.println(p);
				// p.setIdx(i);
				p.setName("삭제됨");
				p.setPhone("삭제됨");
				m++;
			}

			if (m == 1) {
				pArr[i] = pArr[i + 1];
				p.setIdx(p.getIdx() - 1);
			}
		}
		if (m == 0) {
			System.out.println("삭제할 내용이 없습니다.");

		} else {
			System.out.println("삭제 완료");
		}
	}

	public void delExit() {
		while (true) {
			run();
		}

	}

	public void terminate() {
		System.out.println("종료합니다.");
		System.exit(0);
	}

	public static void main(String[] args) {
		new Ch04Ex08();
	}
}
