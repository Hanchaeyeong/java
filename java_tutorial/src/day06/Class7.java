package day06;

public class Class7 {
	public static void main(String[] args) {
		Person c = new Person();
		c.setName("홍길동"); 
		c.setCountry("한국");
		c.setAge(23);
		
		System.out.println(c.getName()+"은 "+c.getCountry()+"에서 온 "+c.getAge()+"살이다.");
		
		Person a = new Person();
		a.setName("아무개"); 
		a.setCountry("캐나다");
		a.setAge(22);
		
		System.out.println(a.getName()+"는 "+a.getCountry()+"에서 온 "+a.getAge()+"살이다.");
		
		
		// 홍길동은 한국에서 온 23살이다.
		// 아무개는 캐나다에서 온 22살이다.
		
	}
	
}

// 클래스명 : Person
// 변수 : 이름, 나라, 나이
// 함수 : get, set

// getter/setter : 우클릭 -> source ->Generate getter/setter...
class Person{
	private String name;
	private String country;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Person2{
	private String name;
	private String country;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}