package co.bobo.lecture01;

import java.util.Date;

public class Member {
	/*
	 * public 생략
	 * public을 생략하면 같은 패키지 안에 있는 클래스에만 사용가능
	 * 만약, 다른 패키지에 있는 클래스에도 사용하고싶다면 public을 생략하면 안됨.
	 * 
	 * */ 
	
	String id;
	String name;
	Date eDate;
	String addr;
	String tel;
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAget() {
		return this.age;
	}
	
	
	public String toString() {
		age = 18;
		System.out.println("id : " + id + " 나이 : " + age);
		return null;
	}
		
	public void toPrint() {
		System.out.println("name : " + name + " eDate : " + eDate + " addr : " + addr + " tel : " + tel);
		System.out.println("===========================");
	}
	//
}
