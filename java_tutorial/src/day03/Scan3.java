package day03;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요 >>>");
		int 국어 = sc.nextInt();
		System.out.println("영어점수를 입력하세요 >>>");
		int 영어 = sc.nextInt(); 
		System.out.println("수학점수를 입력하세요 >>>");
		int 수학 = sc.nextInt();
	
		int 총점 = 국어+영어+수학;
		if(국어>= 40 && 영어 >= 40 && 수학>= 40 && 총점 >= 150) {
			System.out.println("합격");}
		else {
		}
		

			
			
		
		
		
		
	}
	

}
