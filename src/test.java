import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test implements ActionListener{
	
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JLabel myLabel = new JLabel("What is black, white, and red all over?");
	JButton hintButton = new JButton("Hint");
	JButton submitButton = new JButton("Submit");
	JTextField myTextField = new JTextField("Write answer here");
	JLabel answer = new JLabel();
	
public static void main(String[] args) {
	
	test tester = new test();
	tester.GUI();

}

void GUI (){

	myTextField.addActionListener(this);
	hintButton.addActionListener(this);
	submitButton.addActionListener(this);

	myPanel.add(myLabel);
	myPanel.add(hintButton);
	myPanel.add(submitButton);
	myPanel.add(myTextField);
	myFrame.add(myPanel);
	myPanel.add(answer);
	myFrame.setSize(450, 150);
	myFrame.setVisible(true);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== hintButton){
		myLabel.setText("What is black, white, and red all over?   Hint: It's not a zebra!");
	}
	if(e.getSource()== submitButton && myTextField.getText().equals("newspaper")){
	answer.setText("Correct!");
	}
	else if (e.getSource()== submitButton && !myTextField.getText().equals("newspaper")){
		answer.setText("Wrong!");
	}
	
}
}
