package day04;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cc;
		System.out.println("수도를 입력하세요 >>>");
		cc = sc.next();
		if(!(cc.equals("서울"))) {
			System.out.println("실패");
		
		}else {
			System.out.println("성공");
		}
	}

}
