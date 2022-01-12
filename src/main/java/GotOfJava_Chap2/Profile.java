package GotOfJava_Chap2;

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

	//main method
	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setAge(20);
		profile.setName("min");
		profile.printName();
		profile.printAge();
	}
}