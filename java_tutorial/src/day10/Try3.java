package day10;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		Myclass3 mc3 = new Myclass3();
		//mc3.go();
		double result = mc3.divide(20, 10);		// 20 / 10
		System.out.println(result);
		
		result = mc3.divide(10,0);
		System.out.println(result);
	}
}
class Myclass3{
	double divide(double num1, double num2) {
		double result = 0.0;
		if(num2 != 0) 					// num2 가 0일때는 나누기 하지마라 
		{	
			result = num1 / num2;		// 0으로 나누면 프로그램 버그 발생
		}else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		return result;
	}
	
	double divide(double num1, int num2) {
		double result = 0.0;
		try 					// num2 가 0일때는 나누기 하지마라 
		{	
			result = num1 / num2;		// 0으로 나누면 프로그램 버그 발생
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로는 나눌 수 없습니다.");
		} 
		return result;
	}
	
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("프로그램 시작");
		int a=0, b=0, c=0;
		
		System.out.println("숫자1을 입력하세요");
		try{
			a = sc.nextInt();
		}catch(Exception e) {
			System.out.println("20번째 줄에서 오류 발생");		
		}
		
		
		System.out.println("숫자2를 입력하세요");
		try{
			b = Integer.parseInt(sc.next());
		}catch(Exception e) {
			System.out.println("28번째 줄에서 오류 발생");
		}
		System.out.println(b);

		// if(b != 0){} -> try{}
		try{
			c = a / b;
		}catch(Exception e) {
			System.out.println("35번째 줄에서 오류 발생");
		}
		System.out.println(c);
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	
	}
