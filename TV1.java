
public class TV1 {
	private int size;
	
	public TV1(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV1 {
	public int color;

	public ColorTV(int size, int color) {
		super(size); 
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");

	}



	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}
}

class IPTV extends ColorTV{
	String IP;
	
	public IPTV(String IP, int size, int color) {
		super(size,color);
		this.IP = IP;
	}
	
	public void printProperty() {
		System.out.println("나의 IPTV는 " + IP + "주소의 " + getSize() + "인치 " + color + "컬러");
	}

	
	public static void main (String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}

