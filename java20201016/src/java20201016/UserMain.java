package java20201016;

public class UserMain {

	public static void main(String[] args) {
		//3개의 User 인스턴스를 저장할 배열을 생성
		User [] users = new User[3];
		
		users[0] = new User(
				1, "aaaa","1234","에이","첫번째");
		users[1] = new User(
				2, "bbbb","5678","비이","두번째");
		User user = new User();
		user.setNum(3);
		user.setId("cccc");
		user.setPw("9012");
		user.setNickname("씨이");
		user.setName("세번째");
		users[2] = user;
		
		
		//users의 모든 데이터에 접근해서 출력
		for(User temp : users) {
			System.out.println(temp);
		}
	}




}
