import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Typingtutor implements KeyListener {

	char currentLetter;
	JLabel letter;
	JFrame typedie;

	public static void main(String[] args) {
		Typingtutor type = new Typingtutor();
		type.createUI();

	}

	Typingtutor() {

		currentLetter = generateRandomLetter();

	}

	void createUI() {

		typedie = new JFrame("Type or Die");
		typedie.addKeyListener(this);
		letter = new JLabel("" + currentLetter);
		letter.setFont(letter.getFont().deriveFont(55.0f));
		letter.setHorizontalAlignment(JLabel.CENTER);
		typedie.add(letter);
		typedie.setSize(300, 100);
		// typedie.pack();
		typedie.setVisible(true);

	}

	public static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(2) + 'k');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("you pressed " + e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		currentLetter = generateRandomLetter();
		letter.setText("" + currentLetter);
		if (e.getKeyChar() == currentLetter) {

			System.out.println("Correct");
			typedie.getContentPane().setBackground(Color.green);

		} else {
			typedie.getContentPane().setBackground(Color.red);

		}

	}

}
