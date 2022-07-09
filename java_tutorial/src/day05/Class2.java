package day05;

public class Class2 {
	String 변수;
	public static void main(String[] args) {
		Myclass2 mc = new Myclass2();
		mc.add(1, 2);
		mc.add(3, 4);
		// 더하기 하려면 add, 빼기하려면 sub, 곱하기하려면 mul, 나누기하려면 div
		
		// 대한민국 GPS 좌표구하기 (위도,경도 구하는 공식 => 인수인계
		// => 클래스를 만들어서 사용 방법만 알려줌
		mc.div(4, 2);
		
		// 클래스명 변수명 = new 클래스명();			== 객체명(클래스를 변수로 만듦)
		MyStr cc = new MyStr();
		cc.saveprint("hello");
		cc.myprint();
		
	}
}

// ================================

// 클래스 : 함수 + 변수
// 메서드 : 클래스 안에 있는 함수
class Myclass2{
	// Myclass2 안에 사칙연산 기능 +,-,*,/
	void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	void sub(int n1, int n2) {
		System.out.println(n1-n2);	
	}
	void mul(int n1, int n2) {
		System.out.println(n1*n2);
	}
	void div(int n1, int n2) {
		System.out.println(n1/n2);
	}
	
	
}

class MyStr{
	String str = "";
	void myprint() {
		System.out.println(str);
	}
	void saveprint(String in) {
		str = in;
		
	}
} 


