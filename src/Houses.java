import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Houses {

	public static void main(String[] args) {
		// Copyright Wintriss Technical Schools 2013
		// 1. have the tortoise start in the bottom left corner
		Tortoise.setX(0);
		Tortoise.setY(440);
		Tortoise.penDown();
		// 2. draw a house of height 100 |**|_
		buildFlatRoof("medium", Color.green);
		buildFlatRoof("medium", Color.magenta);
		buildPointyRoof("small", Color.cyan);
		
		
		// 3. extract that into a method that takes height as a parameter
		// String size = JOptionPane.showInputDialog("What size building?\n
		// Small Medium Large");
		// String color = JOptionPane.showInputDialog("What color building?\nRed
		// Orange Yellow Green Blue Magenta");
		// 5. make the method take a String instead of a height

		// “small” 60
		// “medium” 120
		// “large” 250

		// 6. make the method take a color

		// 7. make the grass (between houses) always green

		// 8. give the houses peaked roofs

		// 9. extract that into a method “drawPointyRoof” and “drawFlatRoof”

		// 10. make large houses have flat rooves

		// 11. make the roof type selection random

	}

	private static void buildPointyRoof(String sizeString, Color color) {

		int sizeInt = 0;

		if (sizeString.equalsIgnoreCase("small")) {

			sizeInt = 60;

		}

		else if (sizeString.equalsIgnoreCase("medium")) {

			sizeInt = 120;

		}

		else if (sizeString.equalsIgnoreCase("large")) {

			sizeInt = 250;

		}
		
		Tortoise.setPenColor(color);
		Tortoise.move(sizeInt);
		Tortoise.turn(45);
		Tortoise.move(20);
		Tortoise.turn(90);
		Tortoise.move(20);
		Tortoise.turn(45);
		Tortoise.move(sizeInt);
		Tortoise.setPenColor(Color.green);
		Tortoise.turn(-90);
		Tortoise.move(15);
		Tortoise.turn(-90);

	}

	private static void buildFlatRoof(String sizeString, Color color) {

		int sizeInt = 0;

		if (sizeString.equalsIgnoreCase("small")) {

			sizeInt = 60;

		}

		else if (sizeString.equalsIgnoreCase("medium")) {

			sizeInt = 120;

		}

		else if (sizeString.equalsIgnoreCase("large")) {

			sizeInt = 250;

		}
		Tortoise.setPenColor(color);
		Tortoise.move(sizeInt);
		Tortoise.turn(90);
		Tortoise.move(30);
		Tortoise.turn(90);
		Tortoise.move(sizeInt);
		Tortoise.setPenColor(Color.green);
		Tortoise.turn(-90);
		Tortoise.move(15);
		Tortoise.turn(-90);

	}

}
