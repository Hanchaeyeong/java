package day12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Review {
	public static void main(String[] args) {
		// R1 객체화 
		// go 메서드 사용
	R1 s1 = new R1();
	s1.go();
	
	R2 r2 = new R2();
	r2.go();
	
	R3 r3 = new R3();
	r3.go(10,0);
	
	// 자바는 Object클래스를 항상 상속받아 있음.
	// 자바의 각종 기능은 Object라는 클래스 안에 구현이 되어있음
	// ex) String,Date, ...
	}
}

class R1{
	// 클래스 멤버 
	private String s1;			// 클래스 멤버변수는 일반적으로 private을 앞에 붙여줌
	
	public void go() {			// 클래스 멤버함수(메서드)는 일반적으로 public을 앞에 붙여줌
		// 지역 (함수 내부)
		String s1 = null;		// 지역변수는 만들때 초기화 작업을 같이 해준다. null은 변값을 의미 
		s1 = "hello world";
		this.s1 = s1.substring(0,4+1);		// substring : 자르기 
		if(s1.equals(this.s1)) {
			System.out.println("둘은 같다");	// equals : 같은지 비교 
		}else {
			System.out.println("둘은 다르다");
		}
		
		System.out.println(this.s1);
		
	}
}

class R2{
	
	Calendar cal = Calendar.getInstance();
	Date date = cal.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
	String time = sdf.format(date);					// yyyy년 MM월 dd일 HH시 mm분 ss초가 문자열로 바뀜(형변환)
	
	public void go() {
		System.out.println(time);
		int year = Integer.parseInt(time.substring(0,4));
		System.out.println("작년은 "+(year-1)+"년"); 		// ()로 감싸서 왼쪽부터 계산되는 것을 피함		
	}
}

class R3{
	private int n1, n2;
	
	public void go(int n1, int n2) {	// 매개변수는 사용하는 곳에서 값을 정해줘야함
		this.n1 = n1;					// 매개변수로 받은 n1의 값을 멤버변수 n1에 옮긴다.						
		this.n2 = n2;					// 매개변수로 받은 n2의 값을 멤버변수 n2에 옮긴다.
		try {
			System.out.println(n1/n2);
		}catch(Exception e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}
	}
}