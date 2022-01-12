package GotOfJava_Chap3;


//class
public class calculator {
	//method
	public int add(int a, int b) {
		int sum;
		sum = a+b;
		return sum;
	}
	public int sub(int a, int b) {
		int sub;
		sub = a-b;
		return sub;
	}
	public int multi(int a, int b) {
		int multi;
		multi = a*b;
		return multi;
	}
	public int divide(int a, int b) {
		int divide;
		divide = a/b;
		return divide;
	}
	public static void main(String[] args) {
		calculator cal = new calculator();
		int a = 5;
		int b = 3;

		System.out.println(cal.add(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.multi(a, b));
		System.out.println(cal.divide(a, b));
	}
}
