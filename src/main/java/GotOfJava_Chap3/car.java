package GotOfJava_Chap3;

public class car {
		public car() {
		}
		int speed;
		int distance;
		String color;
		
		public void speedUp() {
			speed = speed +5;
		}
		public void speedDown() {
			speed = speed -10;
		}
		public int getCurrentSpeed() {
			return speed;
		}

}
