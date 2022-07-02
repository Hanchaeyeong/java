package day03;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String 번호 = "";
		System.out.println("숫자를 입력하세요>>");
		번호 = sc.next();
		
		switch(번호) {
		case "1":
			System.out.println("1번선택");
			break;
		case "2":
			System.out.println("2번선택");
			break;
		case "3":
			System.out.println("3번선택");
			break;
		case "4":
			System.out.println("4번선택");
			break;
		}
		
		
		
		}
	}

