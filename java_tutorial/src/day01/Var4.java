package day01;

public class Var4 {
	public static void main(String[] args) {
		// 자료형 : 변수를 만들때 공간의 형태를 미리 정해놓는 것 
		// 자료형 쓰는 이유 
		//1 .동작의 명확화 2. 개발자의 실수를 체크 
		
		// 예시1
		// 4444-2222;
		int 빼기 = 4444-2222;
		String 핸드폰번호 = "4444-2222";		// 동작 명확화 : 글자그대로 
		// 빼기 = "4444-2222";				// 개발자 실수 검출 
	
	    // 자료형은 변수의 법 (오용 방지) 
		
		// 정수형(int) : 소수점없는 숫자 
		// 실수형(double) : 소수점있는 숫자
		// 문자열형(String) : "글자"
		// 문자형 (char) : '한글자' (한글은 불가능)
		// 불린형 (boolean) : 참거짓 판별 (false/true)
		
		int 정수형 = -12;
		double 실수형 = 3.14;
		String 문자열형 = "내가 적고 싶은 것 아무거나";  // 적고싶은것 ""안에 
		char 문자형 = 'D';						 // 한글안되고 한글자만 ''안에 
		boolean 불린형 = false;				     // 참 또는 거짓 
		
	}
}
