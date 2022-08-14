package day16;

import java.util.Scanner;

public class _06_Class {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		System.out.println(mc1.getNum());
		
	}

}
class MyClass1{
	// 생성자 : 객체화시 사용되는 메서드
	MyClass1(){
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자으 ㅣ값은 ? ");
		int num = sc.nextInt();
		setNum(num);
	}
	// 메서드 : 클래스 안에 있는 함수
	// 접근권한제어자 : private, default, protected, public
	// 변수는 private, 메서드는 public, 상속이 필요할때만 private을 protected로
	private int num;
	
	public int getNum() {
		return num;
		
	}
	
	public void setNum(int num) {
		this.num = num;
		
	}
	
	
	
}