package day10;

public class StringClass1 {
	public static void main(String[] args) {
		MyString1 ms1 = new MyString1();
		//ms1.go();	// 클래스 자료형
		Quiz1 q1 = new Quiz1();
		q1.name();
		q1.hello();
		q1.bye();
		q1.myInfo("홍홍홍");
		
	}
}

class Quiz1{
		String info = "안녕하세요 저는 홍길동 입니다. 잘 부탁드립니다. 안녕히계세요";
		public void name() {
			String result = "";
			int idx = 0;
			// 1. 홍길동을 찾는다 info.indexOf("홍길동")
			idx = info.indexOf("홍길동");
			// 2. 찾은 위치로부터 3칸 가서 자른다 info.substring(찾은위치,찾은위치+3)
			result = info.substring(idx, idx+3);
			// 3. 출력한다 syso(result);
			System.out.println(result);
	}
		public void hello() {
			String result = "";
			int idx = 0;
			idx = info.indexOf("안녕하세요");
			result = info.substring(idx,idx+5 );
			System.out.println(result);
		}
		
		public void bye() {
			// 안녕히 계세요
			String result = "";
			int idx = 0;
			idx = info.indexOf("안녕히계세요");
			result = info.substring(idx,idx+6);
			System.out.println(result);
			
		}
		
		public void myInfo(String name) {
			// 안녕하세요. 저는 OOO입니다. 잘 부탁드립니다.
			String result = "";
			int idx = 0;
			result = info.replace("홍길동",name);
			System.out.println(result);
			
			
		}
}

class MyString1{
	int var1;		// 자료형이 붉은색이고 소문자
	double var2;	// 붉은색, 소문자
	String var3;	// 까만색, 맨 앞이 대문자
	boolean var4;	// 붉은색, 소문자
	
	public void go() {
		var3 = "Hello world!";
		// String만 가지고 있는 메서드
		
		// 1. equals() : 같은지 비교
		var3.equals("Hello world!");				// 같으면 true, 다르면 false
		
		// 2. contains() : 포함하는지 검사
		var3.contains("world");						// var3에 world가 들어있으면 true, 없으면 false
		
		// 3. replace() : 교체 
		var3 = var3.replace("world", "Java");		// var3에 world가 들어있으면 Java로 바꾼다.
		System.out.println(var3);
		
		// 4. length() : 글자 갯수를 알려줌
		var1 = var3.length();						// var3의 글자 갯수를 알려준다.
		System.out.println(var1);
		
		// 5. indexOf() : 해당 글자의 방번호(위치)를 알려줌
		var1 = var3.indexOf('!');
		System.out.println("!의 방번호는 : "+var1);	// 방번호는 0부터 시작
		
		// 6. charAt() : 방번호를 알려주면 해당 글자를 알려줌(반환)
		char var5 = var3.charAt(10);
		System.out.println("10번째 방에 있는 문자는 "+var5);
		
		// 7. substring() : 잘라내기
		var3 = var3.substring(0, 4+1);				// Hello Java!
		System.out.println("0번부터 4번까지 자른 결과 : "+var3);
		
		// 8. + : 합치기
		var3 = var3 + " world!";
		System.out.println(var3+" world!");
		
	}
	
}