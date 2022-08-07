package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		MyThread mt = new MyThread();
		Thread_3 t3 = new Thread_3();
		Thread tt3 = new Thread(t3);
		
		mt1.start();
		mt.start();	
		tt3.start();
		
	}
}

// 스레드를 생성하여 동시에 2개의 작업을 수행하세요 
// 스레드1 : 스캐너를 사용햇서 입력받으면 출력
// 스레드2 : 무한반복으로 내용 출력

class MyThread extends Thread{
	Scanner sc = new Scanner(System.in);
	private String str = "";
	@Override
	public void run() {
		go();
	}	
	public void go(){
		for(;;){
			str = sc.nextLine();
			System.out.println(str);
		}
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		go();
		
	}
	public  void go() {
		for (;;) {
			System.out.println("Hello world");	
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}		
	}
	}
// 자바는 다중상속이 안되기 떄문에 추가로 상속할 수 있는 인터페이스를 제공 : Runnable
class Thread_3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("BGM 재생 중");
			try {
				Thread.sleep(100);			// 0.01초 스레드 중지
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
