package day10;

public class StringClass2 {
	public static void main(String[] args) {
		String info1 = "STAname=A01price=001000num=02ED";
		String info2 = "STAname=A01price=001000num=04ED";
		Quiz2 q2 = new Quiz2();
		q2.go(info1);
		q2.go(info2);	
	}
}

class Quiz2{
	// info는 주문 내역 (통신 패킷)
	// 보안을 위해서 시작은 무조건 STA로 시작, 마지막은 ED로 끝나야함
	
	// 상품명은 name= 다음에, 가격은 price= 다음에, 수량은 num= 다음에
	// A01 : 에스프레소, A02 : 아메리카노, A03 : 카푸치노, A04 : 카페라떼
	
	public void go(String info) {
		String result = "";
		int index = 0;
		index = info.indexOf("name");
		result = info.substring(index+5,index+8);
		System.out.println(result);
		if(result.equals(result));
	}
}
