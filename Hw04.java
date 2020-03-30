import java.util.Scanner;

abstract class Converter2 {
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

class Km2Mile extends Converter2 {
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}
	
	protected double convert(double src) {
		return src / ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
}


public class Hw04 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}