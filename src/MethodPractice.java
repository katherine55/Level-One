import org.teachingextensions.logo.Tortoise;

public class MethodPractice {
	public static void main(String[] args) {
		food("apples");
		truth(4);
		for(int i = 0; i < 4; i++){
			drawLine();
		}
		jump(7);
		jump("piggy");
	}

	static void food(String fruit) {
		System.out.println("I like " + fruit);
	}

	static void truth(int x) {
		if (x > 5) {
			System.out.println("Geeks rule");
		} else {
			System.out.println("Nerds rule");
		}
	}

	static void drawLine() {
		Tortoise.move(100);
		Tortoise.turn(90);
	}

	static void jump(int height) {
		if (height > 100)
			System.out.println("The mouse jumped over the moon.");
		if (height > 50)
			System.out.println("The mouse jumped over the broom.");
		if (height > 5)
			System.out.println("The mouse jumped over the candlestick.");
	}

	static void jump(String obstacle) {
		System.out.println("The mouse jumped over the " + obstacle);
	}
}
