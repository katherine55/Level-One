import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ChuckleClicker implements ActionListener {
	JFrame mine = new JFrame();
	JPanel pane = new JPanel();
	JButton butt1 = new JButton("JOKE");
	JButton butt2 = new JButton("PUNCHLINE");

	public static void main(String[] args) {
		ChuckleClicker muah = new ChuckleClicker();
		muah.makeButtons();
	}

	void makeButtons() {
		butt1.addActionListener(this);
		butt2.addActionListener(this);
		pane.add(butt1);
		pane.add(butt2);

		mine.add(pane);
		mine.setVisible(true);
		mine.pack();
	}

	ChuckleClicker() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butt1) {
			JOptionPane.showMessageDialog(null, "Why don't dinosaurs talk?");
		} else if (e.getSource() == butt2) {
			JOptionPane.showMessageDialog(null, "Because they are dead");
		}
	}
}
