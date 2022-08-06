package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		Menu1 aa = new Menu1();
		aa.go();
		
	}
}


class Menu1{
	private int choice = -1;
	public void go() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String str1 = "", str2 = "";
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("추가할 항목입력 >>");
				str1 = sc.next();
				arr.add(str1);
			}
			else if(choice == 2) {
				System.out.println("수정할 위치를 입력하세요. >>");
				int aa = sc.nextInt();
				System.out.println("수정내용을 입력하세요. >>");
				str2 = sc.next();
				arr.set(-1+aa,str2);
				
				
			}
			else if(choice == 3) {
				System.out.println("삭제할 위치를 입력하세요. >>");
				int bb = sc.nextInt();
				arr.remove(-1+bb);
				
			}
			else if(choice == 4) {
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i)+" ");
				
			}
			}
			else if(choice == 0) {System.out.println("수정할 위치를 입력하세요. >>");
			int dd = sc.nextInt();
			System.out.println("수정내용을 입력하세요. >>");
				break;
				}
			else {
				System.out.println("잘못입력하셨습니다.");
			}	
		}
		System.out.println("프로그램 종료");
	}
}