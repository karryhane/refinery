import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "을" + getDestString() + "으로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다.");
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
		return "원";
	}
	
	protected String getDestString() {
		return "달러";
	}
	
}

public class WonDollar {
	public static void main(String[] args) {
	Won2Dollar toDollar = new Won2Dollar(1200);
	toDollar.run();
}
}