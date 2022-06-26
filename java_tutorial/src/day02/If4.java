package day02;

public class If4 {
	public static void main(String[] args) {
		int 나이 = 88;
		
		if(나이 >= 20) {
			// 20이상 
			System.out.println("성인 입니다.");
		}
		else if(나이 >= 14) {
			// 14이상 20미만 
			System.out.println("청소년 입니다.");
		}
		else if(나이 < 14) {
			// 14미만 
			System.out.println("어린이 입니다.");
	}
		else {
			System.out.println("그 밖에 나머지");
		}
		// 퀴즈 : 성적매기기
		// 90이상 "A", 80이상 "B", 70이상 "C", 그 미만은 "F"
		int 성적 = 44;
		
		if(성적 >= 90) {
			System.out.println("A");
		}
		else if(성적 >= 80) {
			System.out.println("B");
		}
		else if(성적 >= 70)
			System.out.println("C");
		else {
			System.out.println("F");
		}
			
}
}
