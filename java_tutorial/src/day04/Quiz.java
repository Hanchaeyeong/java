package day04;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password;
		for (int i = 0; i < 5; i++) {
			System.out.print("비밀번호를 입력하세요 :");
			password = sc.nextInt();
			if(password==5699) {
				System.out.println("로그인");
				break;
			}else {
				if(i == 4) {
					System.out.println("횟수초과");
					break;
				}
				
			}
		}	
	}
}


