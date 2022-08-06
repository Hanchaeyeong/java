package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		HM2 hm = new HM2();
		hm.go();
		
		Nations ns = new Nations();
		ns.go();
	}
}

class Nations{
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		// 수도 put
		hm.put("한국", "서울");
		hm.put("그리스","아테네");
		hm.put("영국", "런던");
		hm.put("독일", "베를린");
		hm.put("호주", "캔버라");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("어느 나라 수도가 궁금하신가요?(0 입력은 종료) >>");
			// ==, != : 기본 자료형 비교할 때 int double boolean
			// .equals : 자바 클래스 자료형을 비교할 떄 String
			// 나라를 전체 보여주기
			System.out.println(hm.keySet());
			// 나라를 입력받아서
			String nation = sc.next();
			// 수도를 알려주기
			if(hm.containsKey(nation)) {
				System.out.println(hm.get(nation));
			}else if(nation.equals("0")) {
				break;
			}
			else{
				System.out.println("입력받은 나라 없음");
			}
			
		}
	}
}

class HM2{
		public void go() {
			HashMap<String, Integer> hm = new HashMap<>();
			hm.put("아메리카노",1500);
			hm.put("카페라떼",2500);
			hm.put("카페모카",2500);
			hm.put("카라멜마끼아또",3500);
			
			System.out.println(hm.containsKey("아메리카노"));
			System.out.println(hm.containsKey("2500"));
		    hm.remove("카라멜마끼아또");
			hm.get("아메리카노");
			System.out.println(hm.keySet());
			Set<String> keySet = hm.keySet();
		    Iterator<String> it = keySet.iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("메뉴 : "+key+"\t 가격 : "+hm.get(key));
			
		}
	}
}
