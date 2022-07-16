package day07;

public class Constructor2 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.go();
	}
}

class Person{
	private String 이름; 
	private String 나라; 
	private int 나이;
	
	// 생성자를 통해서 set
	Person(){
		set이름("신짱구");
		set나라("한국");
		set나이(22);
		
		
		
		
	}
	
	public void go() {		// main
		// go함수를 통해서 syso(get).
		System.out.println(get이름()+"는"
				+ " "+get나라()+"에서 온 "+get나이()+"살이다.");
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get나라() {
		return 나라;
	}

	public void set나라(String 나라) {
		this.나라 = 나라;
	}

	public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}
}