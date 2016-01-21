import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JButton ADD = new JButton("+");
	JButton SUB = new JButton("-");
	JButton MULTIPLY = new JButton("*");
	JTextField firstNum = new JTextField();
	JTextField secondNum = new JTextField();
	JLabel answer = new JLabel("0");
	int numanswer = 0;
	
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicker = (JButton)e.getSource();
		int num1 =Integer.parseInt(firstNum.getText());
		int num2 = Integer.parseInt(secondNum.getText());
		if(clicker == ADD){
			numanswer = num1 + num2;
			answer.setText("" + numanswer);
		}
		if(clicker == SUB){
			numanswer = num1 - num2;
			answer.setText("" + numanswer);
		}
		if(clicker == MULTIPLY){
			numanswer = num1 * num2;
			answer.setText("" + numanswer);
		}
		
	}

	Calculator() {
		myPanel.setLayout(null);
		ADD.setBounds(50, 225, 100, 50);
		SUB.setBounds(200, 225, 100, 50);
		MULTIPLY.setBounds(350, 225, 100, 50);
		firstNum.setBounds(150, 150, 100, 50);
		secondNum.setBounds(250, 150, 100, 50);
		answer.setBounds(200, 300, 100, 50);
		
		
		ADD.addActionListener(this);
		SUB.addActionListener(this);
		MULTIPLY.addActionListener(this);

		myFrame.setVisible(true);
		myPanel.add(firstNum);
		myPanel.add(secondNum);
		myPanel.add(ADD);
		myPanel.add(SUB);
		myPanel.add(MULTIPLY);
		myPanel.add(answer);
		myFrame.add(myPanel);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(500, 500);
	}
}
