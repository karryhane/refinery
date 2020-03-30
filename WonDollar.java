import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "���� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ���");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�.");
		scan.close();
	
	}	
}

class Won2Dollar extends Converter {
	public Won2Dollar (double ratio) {
		this.ratio = ratio;
	}
	
	protected double convert(double src) {
		return src / ratio;
	}
	
	protected String getSrcString() {
		return "��";
	}
	
	protected String getDestString() {
		return "�޷�";
	}
	
}

public class WonDollar {
	public static void main(String[] args) {
	Won2Dollar toDollar = new Won2Dollar(1200);
	toDollar.run();
}
}