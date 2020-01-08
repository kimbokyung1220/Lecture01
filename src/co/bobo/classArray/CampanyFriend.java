package co.bobo.classArray;

public class CampanyFriend extends Friend {
	public String gubun;

	public CampanyFriend(String name, String tel, String memo, String gubun) {
		this.name = name;
		this.tel = tel;
		this.memo = memo;
		this.gubun = gubun;
		
	}

	@Override
	public String toString() {
		System.out.println(" *** 회사 ***");
		System.out.println(" 이름 : " + name + " 연락처 : " + tel + " 부서 : " + memo);
		return null;
	}

}
//