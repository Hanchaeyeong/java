package day13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set1 {
	public static void main(String[] args) {
		HashSet1 hs1 = new HashSet1();
		hs1.go();
	}
}
class HashSet1{
	public void go() {
		HashSet<Integer> hs1 = new HashSet<>();
		
		// 추가 add
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		// HashSet은 순서가 없기 때문에 
		// 반복자 Iterator의 도움으로 전체조회가 가능하다 
		Iterator<Integer> itl = hs1.iterator();
		while(itl.hasNext()) {
			System.out.println(itl.next());
		}
	} 
}

class TreeSet1{
	public void go() {
		// HashSet : 순서x, 중복 금지
		// TreeSet : 글자순 정렬, 중복 금지 
		// a -> b -> c
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		// 추가 add
		ts1.add(1);
		ts1.add(4);
		ts1.add(3);
		ts1.add(2);
		
		Iterator<Integer> itl = ts1.iterator();
		while(itl.hasNext()) {
			System.out.println(itl.next());
	}
}
}
