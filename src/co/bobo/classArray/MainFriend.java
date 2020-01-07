package co.bobo.classArray;

public class MainFriend {

	public static void main(String[] args) {

		Friend[] friends = new Friend[5];

//		Friend friend = new Friend("김보경", "000-0000-0000", " ");
		UnivFriend ufriend = new UnivFriend("배효빈", "010-1111-1111", "Relationship", "U");
		CampanyFriend cfriend = new CampanyFriend("박카스", "010-2222-2222", "Marketing", "C");
		UnivFriend ufriend1 = new UnivFriend("이다영", "010-3333-3333", "Relationship", "U");
		
//		friends[0] = friend;
		friends[0] = ufriend;
		friends[1] = cfriend;
		friends[2] = ufriend1;
		friends[0].toString();
		friends[1].toString();
		friends[2].toString();
		
//		for (int i = 0; i < 3; i++) {
//			friends[i].toString();
//			
//		}
	}
		
	
}
