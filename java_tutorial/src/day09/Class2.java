package day09;

public class Class2 {
	public static void main(String[] args) {
		stargangnam sg = new stargangnam();
		sg.cm();
		sg.cs();
		
		starSinchon ss = new starSinchon();
		sg.cm();
		sg.cs();
		
		starbupyeong sb = new starbupyeong();
		sg.cm();
		sg.cs();
		
		// 다형성 : 객체화를 할 때 상속한 인터페이스의 이름으로 통일
		starbucks star1 = new stargangnam();
		starbucks star2 = new starSinchon();
		starbucks star3 = new starbupyeong();
		starbucks star[] = new starbucks[30];
		
		star[0] = new stargangnam();
		star[1] = new starSinchon();
		
		star[0].cm();
		star[1].cs();
		
		// 다형성 : 코드수정을 줄이고 재사용 비율을 늘린다.
				
	}
}

// 스타벽스 
interface starbucks{
	void cm();
	void cs();
}
class stargangnam implements starbucks{

	@Override
	public void cm() {
		// TODO Auto-generated method stub
		System.out.println("강남점 커피만들기");
	}

	@Override
	public void cs() {
		// TODO Auto-generated method stub
		System.out.println("강남점 커피 판매");
	}
	
}
class starSinchon implements starbucks{

	@Override
	public void cm() {
		System.out.println("신촌점 커피만들기");	
	}

	@Override
	public void cs() {
		System.out.println("신촌점 커피 판매");		
	}	
}

class starbupyeong implements starbucks{

	@Override
	public void cm() {
		System.out.println("부평점 커피만들기");
		
	}

	@Override
	public void cs() {
		System.out.println("부평점 커피 판매");
		
	}
}
// 스타벅스 강남점
// 스타벅스 신촌점 
// 스타벅스 부평점 