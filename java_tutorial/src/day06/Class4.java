package day06;

public class Class4 {
	public static void main(String[] args) {
		// 사칙연산 클래스를 사용
		사칙연산 a = new 사칙연산();
		double result = 0;
		result = a.더하기(3, 2);
		System.out.println((int)result);
		
		사칙연산 b = new 사칙연산();
		b.빼기(10, 88);
		
		사칙연산 c = new 사칙연산();
		c.곱하기(55, 0);
		
		사칙연산 d = new 사칙연산();
		d.나누기(20, 5);
	}
}

class 사칙연산{
	// 더하기,빼기,곱하기,나누기
	int 더하기(int num1,int num2) {
		return num1+num2;		
	}
	void 빼기(int num1, int num2) {
		System.out.println(num1-num2);
	}
	void 곱하기(int num1,int num2) {
		System.out.println(num1*num2);
	}
	void 나누기(int num1,int num2) {
		System.out.println(num1/num2);
	}
}