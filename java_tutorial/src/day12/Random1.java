package day12;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Rand1 r1 = new Rand1();
		r1.go3();	
		
		Rand2 r2 = new Rand2();
		r2.go4();
	}
}
class Rand1{
	Random rand = new Random();
	
	// 0 ~ 9
	public void go1() {
		int result = rand.nextInt(9+1);		// 0 ~ 9 랜덤
		System.out.println(result);
	}
	
	public void go4() {
		int result = rand.nextInt(4+1);
		System.out.println(result);
	}
	
	// 1 ~ 10 
	public void go2() {
		int result = rand.nextInt(10)+1;
		System.out.println(result);
	}
	
	// 100 ~ 105
	public void go3() {
		int result = rand.nextInt(5+1)+100;
		System.out.println(result);
	}
}

class Rand2{
	public void go1() {
		int result = (int)(Math.random()*10);		// 0~9
		System.out.println(result);
	}
	
	public void go2() {
		int result = (int)(Math.random()*5);		// 0~4
		System.out.println(result);
	}
	
	public void go3() {
		int result = (int)(Math.random()*10)+1;		
		System.out.println(result);
	}
	
	public void go4() {
		int result = (int)(Math.random()*6)+100;		// 100-105
		System.out.println(result);
	}
	
	
}
