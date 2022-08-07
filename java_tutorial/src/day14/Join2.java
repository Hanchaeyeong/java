package day14;

public class Join2 {
	public static void main(String[] args) {
		Music1 m1 = new Music1();
		Music2 m2 = new Music2();
		
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();
		
		
	}
}

class Music1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("배경음악1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}

class Music2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("배경음악2");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}