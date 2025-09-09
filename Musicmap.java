package list2.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 좋아하는 노래들을 저장하는 클래스
public class MusicPlayer {
    // 노래 정보를 담는 리스트 (리스트 안에 Map이 들어감)
    private List<Map<String, String>> musicList;

    // 생성자: MusicPlayer 객체가 만들어질 때 실행됨
    public MusicPlayer() {
        // 리스트 초기화
        musicList = new ArrayList<Map<String, String>>();

        // Map 하나 생성 (아직 아무 노래 정보도 없음)
        Map<String, String> musicMap = new HashMap<String, String>();

        // 아래는 예시로 넣을 수 있는 노래들 (현재는 주석 처리됨)
        // musicMap.put("AUDREY NUNA", "Golden");
        // musicMap.put("Black Pink", "JUMP");
        // musicMap.put("사카낙션", "新宝島");
        // musicMap.put("Green day", "She");
        // musicMap.put("Nirvana", "Breed");
        // musicMap.put("Ami", "Gost");

        // 비어 있는 Map을 리스트에 추가함
        musicList.add(musicMap);
    }

    // 새로운 노래를 추가하는 메서드
    public void addMusic(String singer, String title, String release) {
        // 새로운 Map 생성
        Map<String, String> musicMap = new HashMap<String, String>();

        // 가수 이름을 key로, 노래 제목을 value로 저장
        musicMap.put(singer, title);

        // 발매일은 "release"라는 key로 저장
        musicMap.put("release", release);

        // 완성된 노래 정보를 리스트에 추가
        musicList.add(musicMap);
    }
}

=======================================


 package list2.map;

public class Test {
    public static void main(String[] args) {
        // MusicPlayer 객체 생성
        MusicPlayer mp = new MusicPlayer();

        // 노래 정보 추가 (가수, 제목, 발매일)
        mp.addMusic("AUDREY NUNA", "Golden", "2025.06.20");
        mp.addMusic("Black Pink", "JUMP", "2025.07.10");
        mp.addMusic("사카낙션", "新宝島", "2000.07.10");
        mp.addMusic("Green day", "She", "1994.02.10");
        mp.addMusic("Nirvana", "Breed", "1999.01.10");
        mp.addMusic("Ami", "Gost", "2025.04.10");

        // 현재는 출력 코드가 없음 → 콘솔에 아무것도 안 나옴
        System.out.println(); // 그냥 빈 줄 출력
    }
}



======================================= Been

    package list2.been;

import java.util.ArrayList;
import java.util.List;

//리스트 안에 좋아하는 송리스트
public class MusicPlayer {
	private List<Music> musicList;
	public MusicPlayer () {
		musicList = new ArrayList<Music>();
	}
	public void addMusic(String singer,String title,
			String release) {
		Music music =new Music();
		music.setSinger(singer);
		music.setTitle(title);
		music.setRelease(release);
		musicList.add(music);
		
	}
}
==================================================
package list2.been;

public class Test {
	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		mp.addMusic("AUDREY NUNA", "Golden","2025.06.20");
		mp.addMusic("Black Pink", "JUMP","2025.07.10");
		mp.addMusic("사카낙션", "新宝島","2000.07.10");
		mp.addMusic("Green day", "She","1994.02.10");
		mp.addMusic("Nirvana", "Breed","1999.01.10");
		mp.addMusic("Ami", "Gost","2025.04.10");
		System.out.println();	
	}
}
-=============================

    package list2.been;

public class Music {
 private String singer;
 private String title;
 private String release;
 public String getSinger() {
	return singer;
 }
 public String getTitle() {
	return title;
 }
 public String getRelease() {
	return release;
 }
 public void setSinger(String singer) {
	this.singer = singer;
 }
 public void setTitle(String title) {
	this.title = title;
 }
 public void setRelease(String release) {
	this.release = release;
 }
}
