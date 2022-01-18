package chap2;

public class Profile {
	//전역변수
	int age;
	String name;

	public void setAge(int val) {
		age = val;
	}
	//메소드
	public void setName(String str) {
		name = str;
	}

	public void printName() {
		System.out.println("My name is "+name);
	}

	public void printAge() {
		System.out.println("My age is "+age);
	}

}