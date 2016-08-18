
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tootmachine implements ActionListener {

	public static void main(String[] args) {
		tootmachine toot = new tootmachine();
		toot.gui();
	}

	void gui() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Pull my finger");
		frame.add(panel);
		panel.add(button);
		frame.setSize(400, 200);
		frame.setVisible(true);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		playSound("farts.wav");
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
