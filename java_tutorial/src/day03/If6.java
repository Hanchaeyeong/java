package day03;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month,day=0;
		System.out.println("년도를 입력하세요>>");
		year = sc.nextInt();
		System.out.println("월을 입력하세요>>");
		month = sc.nextInt();
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			day = 31;
		}else if(month==4 || month==6 || month==9 || month==11) {
			day=30;
		}else if(month==2) {
			if(year%4==0 && year%100!=0 || year%400==0)
				day=29;
			else
				day=28;
			
		}else {
			System.out.println("?");
			return;
		}
		
		System.out.println(day+"일");
		
		
		
	}

}
