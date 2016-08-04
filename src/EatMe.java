import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import java.util.Date;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * This game uses the Makey Makey to see if you can match the pictures of food to the correct utensil. There are utensils (including metal chopsticks!)
 * in one of the blue drawers.
 * 
 * Learn how to hook up the Makey Makey here: http://makeymakey.com/howto.php
 * 
 */

public class EatMe extends KeyAdapter {

	int tries = 10;
JFrame jFrame;
HashMap<Integer, String> images = new HashMap<Integer, String>();
private int correctUtensilCode;

private void makeAlbum() {
	// 1. Find 4 images of foods eaten by different utensils and put them in
	// your default package
	// 2. Connect the images to the UP, DOWN, LEFT, and RIGHT keys like
	// this...
	images.put(new Integer(KeyEvent.VK_DOWN), "salad.jpg"); // the spoon will be connected to the UP key
	images.put(new Integer(KeyEvent.VK_RIGHT), "seeew.jpg");
	images.put(new Integer(KeyEvent.VK_LEFT), "steak.jpg");
	images.put(new Integer(KeyEvent.VK_UP), "cereal.jpg");// the chopstick will be connected to the LEFT key

	// 3. Call the method to show an image
	showImage();
	}

private void showImage() {
jFrame = new JFrame();
	// 4. Initialize your jFrame to a new JFrame() (jFrame already exists)
jFrame.setVisible(true);
	// 5. Set the JFrame to visible

	jFrame.add(getNextRandomImage());
jFrame.pack();
	// 6. Pack the frame
jFrame.addKeyListener(this);
	// 7. Add a KeyListener to the frame
	}

public void keyPressed(KeyEvent e) {
	int whichKeyPressed = e.getKeyCode();
	System.out.println(whichKeyPressed);
	// 9. Print the correctUtensilCode
	System.out.println(correctUtensilCode);
	// 10. If they match, tell the user they were correct
	if(whichKeyPressed == correctUtensilCode){
		JOptionPane.showMessageDialog(null, "Correct!");
		System.out.println("You have "+ tries + "tries left");
	}
	else{
		tries--;
		JOptionPane.showMessageDialog(null, "Learn some manners, already!");
		System.out.println("You have "+ tries + "tries left");
		if(tries == 0){
			JOptionPane.showMessageDialog(null, "Game Over!");
			System.exit(0);
		}
	}

	jFrame.dispatchEvent(new WindowEvent(jFrame, WindowEvent.WINDOW_CLOSING)); // closes the window

	showImage();

	}

private Component getNextRandomImage() {
	String[] fileNames = images.values().toArray(new String[0]);
	int randomness = new Random().nextInt(fileNames.length);
	String randomFile = fileNames[randomness];
	System.out.println("loading image " + randomness + ": " + randomFile);

	this.correctUtensilCode = getHashMapKey(randomFile);
	return loadImage(randomFile);

	}

private Integer getHashMapKey(String randomFile) {
	for (Integer key : images.keySet()) {
		if (images.get(key).equals(randomFile)) {
			return key;
		}
	}
		return null;
}

private JLabel loadImage(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}

public static void main(String[] args) throws Exception {
	new EatMe().makeAlbum();
}
}




