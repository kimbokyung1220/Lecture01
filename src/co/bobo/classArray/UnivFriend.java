package co.bobo.classArray;

public class UnivFriend extends Friend {
	public String gubun;

	public UnivFriend(String name, String tel, String memo, String gubun) {
		this.name = name;
		this.tel = tel;
		this.memo = memo;
		this.gubun = gubun;
		
	}

	@Override
	public String toString() {
		System.out.println(" *** 대학 ***");
		System.out.println(" 이름 : " + name + " 연락처 : " + tel + " 전공 : " + memo);
		return null;
	}
	
}
//