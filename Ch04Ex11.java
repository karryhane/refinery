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

	// 세터
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
	// ~게터

	public void play() {
		System.out.println("가수: " + singer + ", 곡명: " + song);
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
			System.out.println("저장할 공간이 부족합니다!");
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

		Music m1 = new Music("룰라", "3!4!");
		Music m2 = new Music();
		m2.setSinger("투투");
		m2.setSong("1과2분의1");
		Music m3 = new Music("이선희", "아 옛날이여");

		MusicPlayer mp = new MusicPlayer();

		mp.add(m1);
		mp.add(m2);
		mp.add(m3);
		mp.add(new Music("조용필", "바람의 노래"));

		String[] a = new String[7];
		String[] b = new String[7];

		for (int i = 0; i < 8; i++) {
			scan = new Scanner(System.in);
			System.out.println("추가할 가수명과 곡명을 입력해주세요");
			System.out.println("가수명:");
			a[i] = scan.nextLine();
			System.out.println("곡명:");
			b[i] = scan.nextLine();

			mp.add(new Music(a[i], b[i]));

			System.out.println("더 입력하시겠습니까?");
			System.out.println("1.예     2.아니오");

			int c = scan.nextInt();
			if (c == 2) {
				break;
			}

		}

		mp.play();
	}
}
