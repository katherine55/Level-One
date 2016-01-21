import java.awt.event.*;

import javax.swing.*;

public class LearningGUI implements ActionListener {
	
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JButton myButton = new JButton("Don't press my buttons!");
	JButton myButton2 = new JButton("If you do...");
	JTextField myTextField = new JTextField("Your name?");
	
	public static void main(String[] args) {
		new LearningGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicker = (JButton)e.getSource();
		if(clicker == myButton){
		myButton.setText("Oh no you didn't\n\nOh no you didn't press my buttons");
		myButton2.setText("*growls*");
		}
		if(clicker == myButton2){
		myButton.setText("If you dare press my buttons!!!!!!!...");
		myButton2.setText("I will- I will.. um ... uh...\n\ncome back in one moment please");
		}
		
	 JLabel name = new JLabel(myTextField.getText() + ", how dare you press my buttons!!");
	 myPanel.add(name);
	}

	LearningGUI() {
		myButton.addActionListener(this);
		myButton2.addActionListener(this);

		myFrame.setVisible(true);
		myPanel.add(myButton);
		myPanel.add(myButton2);
		myPanel.add(myTextField);
		myFrame.add(myPanel);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 500);
	}
}
