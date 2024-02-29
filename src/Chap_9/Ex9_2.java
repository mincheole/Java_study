package Chap_9;

class Person {
	long id;

	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id ==((Person)obj).id;
      // obj가 Object타입이므로 id값을 갖고있지 않음
			// 참조하기 위해서 Person타입으로 형변환
		else return false;
	}
	Person(long id) {
		this.id = id;
	}
}

class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(123);
		Person p2 = new Person(123);

		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 같은 사람입니다.");
	}
}

