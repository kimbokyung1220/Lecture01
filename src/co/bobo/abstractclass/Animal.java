package co.bobo.abstractclass;

public abstract class Animal {
	
	//추상메소드 : 값이 없는 메소드 (abstract를 사용해주면 됨)
	public abstract void run();   
		
	public void eat() {
		System.out.println("먹는다.");
	}

}
