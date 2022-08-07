package day14;

public class Thread1 {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		MyClass3 mc3 = new MyClass3();
		//mc1.go();
		//mc2.go();
		//mc3.go();
		mc1.start();
		mc2.start();
		mc3.start();
		
		// 프로그램 : 개발자가 만든 애플리케이션
		// 프로세스 : 실행중인 프로그램
		// 스레드 : 프로세스의 실질적인 동작수행을 담당
		// 멀티스레드 : 하나의 프로세스에 여러개의 스레들를 동작시키는 것 (원래는 main스레드만 작동)
		// ex : 캐릭터를 움직이면서 배경음악이 재생이 되면서 채팅을 주고받는다.
		
		// main스레드 외에 추가스레드를 생성하는 법
		// 클래스를 만들어 스레드를 상속받고 run에 내용을 입력한 다음 start로 실행한다.
	}
}

class MyClass1 extends Thread{
	
	@Override
	public void run() {		// run : 추가 스레드가 수행할 내용
		go();
	}
	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("UI화면갱신(캐릭터 움직임, 대화창)");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class MyClass2 extends Thread{
	@Override
	public void run() {		// run : 추가 스레드가 수행할 내용
		go();
	}
	
	public int go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악 재생 중");	
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
	}	
}

class MyClass3 extends Thread{
	@Override
	public void run() {		// run : 추가 스레드가 수행할 내용
		go();
	}
	public String go() {
		for (int i = 0; i < 10; i++) {
			System.out.println("메시지 송수신(네트워크)");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "";
	}
}
