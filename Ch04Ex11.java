import java.util.Arrays;
import java.util.Scanner;

class Music {
	private String singer;
	private String song;
	protected int MAX = 7;

	public Music() {
		this("no-name", "no-song");
	}

	public Music(String singer, String song) {
		this.singer = singer;
		this.song = song;
	}

	// ����
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}
	// ~����

	public void play() {
		System.out.println("����: " + singer + ", ���: " + song);
	}

}

class MusicPlayer extends Music {
	private Music[] mArr = new Music[MAX];
	private int n = 0;

	public MusicPlayer() {

	}

	public MusicPlayer(Music[] music) {
		this.mArr = music;
	}

	public void add(Music music) {
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] == null) {
				Music muse = new Music(music.getSinger(), music.getSong());
				mArr[i] = muse;
				n++;
				break;
			}
		}
		if (n == MAX) {
			System.out.println("������ ������ �����մϴ�!");
		}
	}

	@Override
	public void play() {
		for (int i = 0; i < mArr.length; i++) {
			if (mArr[i] != null) {
				System.out.println("[" + mArr[i].getSinger() + "]" + mArr[i].getSong());
			}
		}
	}

}

public class Ch04Ex11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Music m1 = new Music("���", "3!4!");
		Music m2 = new Music();
		m2.setSinger("����");
		m2.setSong("1��2����1");
		Music m3 = new Music("�̼���", "�� �����̿�");

		MusicPlayer mp = new MusicPlayer();

		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("������", "�ٶ��� �뷡"));

		String[] a = new String[7];
		String[] b = new String[7];

		for (int i = 0; i < 8; i++) {
			scan = new Scanner(System.in);
			System.out.println("�߰��� ������� ����� �Է����ּ���");
			System.out.println("������:");
			a[i] = scan.nextLine();
			System.out.println("���:");
			b[i] = scan.nextLine();

			mp.add(new Music(a[i], b[i]));

			System.out.println("�� �Է��Ͻðڽ��ϱ�?");
			System.out.println("1.��     2.�ƴϿ�");

			int c = scan.nextInt();
			if (c == 2) {
				break;
			}

		}

		mp.play();
	}
}
