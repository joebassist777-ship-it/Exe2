package list2.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//리스트 안에 좋아하는 송리스트
public class MusicPlayer {
	private List<Map<String,String> > musicList;
	public MusicPlayer () {
		musicList = new ArrayList<Map<String,String>>();
		Map<String,String> musicMap= new HashMap<String, String>(); 
//		musicMap.put("AUDREY NUNA", "Golden");
//		musicMap.put("Black Pink", "JUMP");
//		musicMap.put("사카낙션", "新宝島");
//		musicMap.put("Green day", "She");
//		musicMap.put("Nirvana", "Breed");
//		musicMap.put("Ami", "Gost");
		musicList.add(musicMap);
	}
	public void addMusic(String singer,String title,String release) {
		Map<String,String> musicMap = new HashMap<String,String>();
		musicMap.put(singer,title);
		musicMap.put("release",release);
		musicList.add(musicMap);
	}
}


=======================================


  package list2.map;

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
