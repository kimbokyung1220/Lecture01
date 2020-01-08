package co.bobo.inheritance;

public class Car {
	public int chair;		//의자수
	public String engine;	//엔진마력
	
	public Car() {
		
	}
	
	public void run() {
		System.out.println("달린다");
	}
	
	private void stop() {
		System.out.println("멈춘다");
	}
	
	//캡슐화
	public void car() {
		run();
		stop();
	}
}
//
