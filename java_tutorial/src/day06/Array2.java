package day06;

public class Array2 {
	public static void main(String[] args) {
		Array2Ex a = new Array2Ex();
		a.go();
	}

}
class Array2Ex{
	public void go() {
		// 카페메뉴와 가격
		String 카페메뉴[] = {"아메리카노 : ","카푸치노 : ","녹차라떼 : ","레몬에이드 : "};
		int num[] = {2500,4000,5500,5500};
		
		// 배열값 수정
		num[0] = 1500;
		
		// 반복문 길이는 카페메뉴 갯수와 가격의 갯수가 같기 때문에 둘중 하나만 해주면 됨
		for (int i = 0; i < num.length; i++) {
			System.out.println(카페메뉴[i]+num[i]);
		}
		
		
	}
}
