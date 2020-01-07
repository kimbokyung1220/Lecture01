package co.bobo.mainapp;

import java.util.Date;

import co.bobo.lecture01.Member;

public class MainApp {

	public static void main(String[] args) {
		
		Member member = new Member();
//		Date date = new Date();
	
//		member.id = "bobo";
//		member.name = "김보경";
//		member.addr = "대구광역시";
//		member.eDate = date;
//		member.tel = " 010-0000-0000";
		member.setAge(18);
		member.toString();
//		member.toPrint();
		
	}

}
