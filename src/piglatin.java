import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatin implements ActionListener {
	
	PigLatinTranslator latin = new PigLatinTranslator();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Convert");
	JTextField answer = new JTextField(20);
	JTextField input = new JTextField(20);
	
	public static void main(String[] args) {
		piglatin pig = new piglatin();
		pig.createUI();
	}
	
	void createUI() {
		panel.add(input);
		panel.add(button);
		panel.add(answer);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		button.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			
			String hi = latin.translate(input.getText());
			answer.setText(hi);
		}
		
	}
}
