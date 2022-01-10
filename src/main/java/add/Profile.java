package add;

public class Profile {
	String name;
	int age;

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

	public static void main(String[] args) {
		Profile profile = new Profile();
		profile.setAge(20);
		profile.setName("min");
		profile.printName();
		profile.printAge();
	}
}