package day07;

public class Extends2 {
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 22);
		h1.Info();
		
		Member m1 = new Member("아무개", 33);
		m1.Info();
		
	}

}
class Human{
//	private String name;			// private : 내 클래스 안에서만 사용 가능
//	double weight;					// default : 내 패키지 안에서만 사용 가능
	protected int age;				// protected : 상속받은 곳까지는 허용 
//	public double height;			// public : 모두 사용 가능 
	protected String name;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void Info() {
		this.name = name;
		this.age = age;
		System.out.println("이름은 "+name+"이고, 나이는 "+this.age);
	}
}
// 상속 : extends 기존의 클래스를 일부만 수정/추가해서 사용하고 싶을 때 
class Member extends Human{
	Member(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	// Human의 코드가 복붙되어 있음
	// 상속을 해서 수정하는 것 : 오버라이딩
	public void Info() {
		System.out.println("회원의 이름은"+name+"이고, 나이는"+this.age);
	}
	// 함수 이름은 동일해도 인자()가 다르면 다른 함수로 취급 : 오버로딩

	
	public void go() {
		System.out.println("실행");
	}
}