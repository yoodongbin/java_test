package add;

public class calculator {

	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int multi(int a, int b) {
		return a*b;
	}
	public int divide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		calculator cal = new calculator();
		int a = 5;
		int b = 3;

		System.out.println(cal.add(a, b));
	}
}
