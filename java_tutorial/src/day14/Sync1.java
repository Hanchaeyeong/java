package day14;

public class Sync1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread human1 = new Thread(toilet, "사람1");
		Thread human2 = new Thread(toilet, "사람2");
	
		human1.start();
		human2.start();
	}
}

// 화장실 1개뿐...사람은 많다.
// 화장실 사용 다른 사람 대기 
class Toilet implements Runnable{
	private int time;
	@Override
	public void run() {
		time = 0;
		synchronized (this) {		// 현재 클래스는 한번에 한명만 사용가능하게끔 동기화
			System.out.println("화장실 들어감");
			while(time < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				time++;
				System.out.println("화장실 이용 중..."+time+"초");
			}
			System.out.println("화장실 비움");
		}
		
	}
	
	
}