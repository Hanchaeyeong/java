package day04;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		// 아이디와 비밀번호 맞추기
		// 무한 반복
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			String id;
			int password;
			System.out.print("아이디를 입력하세요>>>");
			id = sc.next();
			System.out.print("비밀번호를 입력하세요>>>");
			password = sc.nextInt();
			
			if(!(id.equals("hello"))||!(password == 1234)) {
				System.out.println("없는 아이디거나 패스워드가 일치하지 않습니다.");
			
		}
			else {
				System.out.println("로그인 성공");
				break;
			}
		}
	}

}
