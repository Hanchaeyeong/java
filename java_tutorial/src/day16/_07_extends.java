package day16;

public class _07_extends {
	public static void main(String[] args) {
		Myclass2 mc2 = new Myclass2();
	}
}

class MyClass2 extends MyClass1{
	// extends 키워드로 상속을 받는다 
	// 상속 : 클래스 단위로 코드를 복사 붙어녛기 
	// 부모클래스 : 복사된 클래스 super
	// 자식클래스 : 붙여넣기 된 클래스 this
	
	// 메서드 오버라이딩 (메서드 수정)
	@Override
	public void go() {
		System.out.println("go함수를 변경하였습니다. 오버라이딩");
	}
	// 메서드 오버로딩 (같은 이름의 메서드가 여러개)
	public void go(int num) {
		System.out.println("go함수를 정수 1개 전달받는 메서드로 만들었습니다. 오버로딩");
	}
}

class MyClass3 extends MyClass1 implements _08_Interface{
	
}