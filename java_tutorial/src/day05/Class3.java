package day05;

public class Class3 {
	public static void main(String[] args) {
		// 클래스 안에서 클래스를 사용하기 위해선 변수로 만들어준다.(객체화)
		Car 아빠차 = new Car();		// 객체 : Object (대상,물체), 클래스 : Class (반,추상적)
		Car 엄마차 = new Car();		
		Car 내차 = new Car();		
		Car 동생차 = new Car();		
		Car 홍길동차 = new Car();
		
		아빠차.차정보입력("검정", "아빠", "BMW");
		엄마차.차정보입력("빨강", "엄마", "SM");
		내차.차정보입력("회색", "나", "K5");
		동생차.차정보입력("흰색", "동생", "아반떼");
		홍길동차.차정보입력("파랑", "홍길동", "모닝");
		
		System.out.println(아빠차.차정보출력());
		System.out.println(엄마차.차정보출력());
		System.out.println(내차.차정보출력());
		System.out.println(동생차.차정보출력());
		System.out.println(홍길동차.차정보출력());	
	
	// Human 객체화
	 Human 홍길동 = new Human();
	 Human 철수 = new Human();
	 
	 // 메서드 사용
	 홍길동.정보입력("홍길동", "남성", 25, 177.7);
	 철수.정보입력("김철수", "남성", 29, 172.1);
	
	 System.out.println(홍길동.정보출력());
	 System.out.println(철수.정보출력());
	}
	
	

}
class Car{
	String color;
	String onwer_name;
	String car_name;
	
	void 차정보입력(String 색상,String 주인, String 차이름) {
		color = 색상;
		onwer_name = 주인;
		car_name = 차이름;
	}
	
	String 차정보출력() {
		return "이 차의 주인은"+onwer_name+"차의 이름과 색깔은"+car_name+color;		
	}
}
// Human : 이름, 성별, 나이, 키
class Human{
	String name;
	String gender;
	int age;
	double height;
	
	void 정보입력(String 이름, String 성별, int 나이, double 키) {
		name = 이름;			// this.을 붙이면 클래스에 있는 것을 사용
		gender = 성별;
		age = 나이;
		height = 키;
	}
	String 정보출력() {
		return name+"의 정보 : "+gender+age+height;
	}
}
