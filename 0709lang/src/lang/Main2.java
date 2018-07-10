package lang;

public class Main2 {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setNum(1);
		user1.setName("홍길동");
		// 배열을 만들어서 넣어주어야 한다.
		String[] hobbies = { "노래", "춤" };
		user1.setHobbies(hobbies);
		//toString을 호출해서 내부 내용 확인 toString을 활용해서 바로 확인할 수 있음 밑에 코드처럼 치면
		//System.out.println(user1);
		
		//user1에 데이터가 저장된 곳의 주소를 user에 복사
		User user2 = user1;
		user2.setNum(3);
		System.out.println(user1);
		
		
		User user3 = user1.clone();
		user3.setNum(4);
		user3.setName("sdffff");
		//user3.getHobbies()[0] = "연기";
		System.out.println(user2);
		System.out.println(user3);
		
	}

}

