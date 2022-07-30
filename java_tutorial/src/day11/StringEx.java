package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력하세요 :");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 se1 = new StringEx1();
		se1.go(price);
	}
}

class StringEx1{
	
	// 천원 단위로 , 를 붙여주세요 
	// 0-> 0
	// 00 -> 00
	// 000 -> 000
	// 0000 -> 0,000
	// 00000 -> 00,000
	// 000000 -> 000,000
	// 0000000 -> 0,000,000
	// 00000000 -> 00,000,000
	public void go(int num) {
		// num을 문자열로 
		String numString = ""+num;
		if(num<1000) {			// 방법1. 숫자 범위를 비교   방법2. 문자열 길이 비교  
			System.out.println(numString);
		}
		else if(num<10000) {
			// 앞뒤를 잘라서 사이에 ,를 붙여 합친다 substring
			
			String str1 = numString.substring(0,1);
			String str2 = numString.substring(1,4);
			System.out.println(str1+"," + str2);
		}
		else if(numString.length() == 5) {
			String str1 = numString.substring(0,2);
			String str2 = numString.substring(2,5);
			System.out.println(str1+"," + str2);
			
	}
		else if(num<1000000) {
			String str1 = numString.substring(0,3);
			String str2 = numString.substring(3,6);
			System.out.println(str1+"," + str2);
}
		else if(num<10000000) {
			String str1 = numString.substring(0,1);
			String str2 = numString.substring(1,4);
			String str3 = numString.substring(4,7);
			System.out.println(str1+"," + str2+",");
		
	}
	}
	}
