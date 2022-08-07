package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		Thread human1 = new Thread(dr, "사람1");
		Thread human2 = new Thread(dr, "사람2");
		Thread human3 = new Thread(dr, "사람3");
		
		human1.start();
		human2.start();
		human3.start();
	}
}

class DressRoom implements Runnable{
	private int time;
	 @Override
	public void run() {
		time = 0;
		synchronized (this) {
			System.out.println("드레스룸 입장");
			while(time < 10) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				time++;
				System.out.println("드레스룸 사용 중..."+time+"초");
			}
			System.out.println("드레스룸 비움");
				
			}
			
		}
		
	}
