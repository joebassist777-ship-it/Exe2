public class Music {
	private String singer;   // 가수 이름
	private String title;    // 곡 제목
	private String release;  // 발매일

	// getter: 값을 읽어올 때 사용
	public String getSinger() { return singer; }
	public String getTitle() { return title; }
	public String getRelease() { return release; }

	// setter: 값을 설정할 때 사용
	public void setSinger(String singer) { this.singer = singer; }
	public void setTitle(String title) { this.title = title; }
	public void setRelease(String release) { this.release = release; }
}

=================================
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
	private List<Music> musicList;  // 음악 객체들을 저장하는 리스트

	public MusicPlayer() {
		musicList = new ArrayList<Music>();  // 리스트 초기화
	}

	public List<Music> getMusicList() {
		return musicList;  // 음악 리스트 반환
	}

	public void setMusicList(List<Music> musicList) {
		this.musicList = musicList;  // 음악 리스트 설정
	}

	public void addMusic(String singer, String title, String release) {
		Music music = new Music();  // 새로운 음악 객체 생성
		music.setSinger(singer);    // 가수 설정
		music.setTitle(title);      // 제목 설정
		music.setRelease(release);  // 발매일 설정
		musicList.add(music);       // 리스트에 추가
	}
}

=========================================
  import java.util.Scanner;

class UserInter {
	private MusicPlayer mp;       // 음악 플레이어 객체
	private Scanner scanner;      // 사용자 입력을 받기 위한 스캐너

	public UserInter() {
		this.scanner = new Scanner(System.in);  // 스캐너 초기화
		mp = new MusicPlayer();                 // 음악 플레이어 초기화
	}

	public void start() {
		while (true) {
			System.out.println("=========================");
			System.out.println("글로벌 뮤직투어에 오신 걸 환영합니다!");
			System.out.println("1 > 뮤직 등록");
			System.out.println("2 > 뮤직 조회");
			System.out.println("0 > 종료");
			String menu = scanner.nextLine();  // 사용자 입력 받기

			if ("1".equals(menu)) {
				addMusic();  // 음악 등록
			}
			if ("2".equals(menu)) {
				show();      // 음악 목록 출력
			}
			else if ("0".equals(menu)) {
				System.out.println("프로그램을 종료합니다.");
				break;       // 프로그램 종료
			}
			// 잘못된 입력 처리는 주석 처리됨
		}
		System.out.println();
	}

	private void addMusic() {
		System.out.println("=========================");
		System.out.print("가수명? ");
		String singer = scanner.nextLine();  // 가수 입력
		System.out.print("곡명? ");
		String title = scanner.nextLine();   // 곡명 입력
		System.out.print("발매일? ");
		String release = scanner.nextLine(); // 발매일 입력
		mp.addMusic(singer, title, release); // 음악 추가
	}

	protected void show() {
		System.out.println("=========================");
		for (Music music : mp.getMusicList()) {
			System.out.printf("타이틀: %s, 아티스트: %s, 릴리즈: %s%n",
				music.getTitle(),
				music.getSinger(),
				music.getRelease());
		}
	}
}

==================================
  public class Test {
	public static void main(String[] args) {
		new UserInter().start();  // 프로그램 시작
	}
}

