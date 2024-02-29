package Chap_11;

import java.util.*;
import static java.lang.System.out;

class Person {
	String name;
	int age;
		
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;  // 형변환 가능한지 체크
		Person p = (Person)obj;						// 형변환해야 .name, .age사용가능
		return this.name.equals(p.name) && this.age==p.age;
	}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() { return name + ":" + age; }
}

public class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		out.println(set);	
	}
}
