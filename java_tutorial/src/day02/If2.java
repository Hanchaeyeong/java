package day02;

public class If2 {
	public static void main(String[] args) {
		int 나이 = 12;
		if(나이 >= 20) {
			System.out.println("성인 입니다.");
		}
		if(나이 >=14 && 나이<20) {
			System.out.println("청소년 입니다.");
		}
		if(나이 < 14) {
			System.out.println("어린이 입니다.");
		}
	}
}